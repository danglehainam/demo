package com.example.demo.security;

import com.example.demo.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceCustom implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceCustom(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        var userData = userRepository.findByUsername(login).orElseThrow(() -> new UsernameNotFoundException("User " + login + " not found"));
//        Set<GrantedAuthority> roles = userData.getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role)).collect(Collectors.toSet());
        return User.builder().username(login).password(userData.getPassword()).authorities(new ArrayList<>()).build();
    }
}

