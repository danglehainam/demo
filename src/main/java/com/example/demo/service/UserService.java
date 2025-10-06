package com.example.demo.service;

import com.example.demo.DTO.LoginRequest;
import com.example.demo.DTO.LoginResponse;
import com.example.demo.config.AppConfig;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private JwtUtil jwtUtil;


    private AppConfig appConfig = new AppConfig();
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public String registerUser(User user){
        if (repo.existsByUsername(user.getUsername())){
            return "Username da ton tai";
        }
        if ((repo.existsByEmail(user.getEmail()))){
            return "Email da ton tai";
        }

        String encoderPassword = appConfig.passwordEncoder().encode(user.getPassword());
        user.setPassword(encoderPassword);

        repo.save(user);
        return "Dang ky thanh cong!";
    }

    public LoginResponse login(LoginRequest req){
        User user = repo.findByUsername(req.getUsername()).orElseThrow(()->new RuntimeException("Username không tồn tại"));

        if(!appConfig.passwordEncoder().matches(req.getPassword(), user.getPassword())){
            throw new RuntimeException("Sai mật khẩu");
        }
        String token = jwtUtil.generateToken(user.getUsername());
        System.out.println(token);
        return new LoginResponse(token);
    }
}
