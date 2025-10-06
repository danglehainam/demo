package com.example.demo.service;

import com.example.demo.entity.GiaoVien;
import com.example.demo.repository.GiaoVienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoVienService {
    private GiaoVienRepository repo;

    public GiaoVienService(GiaoVienRepository repo) {
        this.repo = repo;
    }

    public List<GiaoVien>giaoVienList(){
        return repo.findAll();
    }

    public List<String>giaoVienListTen(){
        return repo.layTenGiaoVienThoi();
    }
}
