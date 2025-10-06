package com.example.demo.controller;

import com.example.demo.entity.GiaoVien;
import com.example.demo.service.GiaoVienService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/giaovien")
public class GiaoVienController {
    private GiaoVienService service;

    public GiaoVienController(GiaoVienService service) {
        this.service = service;
    }

    @GetMapping
    List<GiaoVien>getAll(){
        return service.giaoVienList();
    }

    @GetMapping("/tengv")
    List<String>getTenGv(){
        return service.giaoVienListTen();
    }
}
