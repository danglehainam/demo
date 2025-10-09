package com.example.demo.controller;

import com.example.demo.entity.GiaoVien;
import com.example.demo.service.GiaoVienService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    GiaoVien createGv(@RequestBody GiaoVien gv){
        return service.createGv(gv);
    }

    @PutMapping("{id}")
    GiaoVien updateGv(@PathVariable Long id, @RequestBody GiaoVien gv){
        return service.updateGiaovien(id, gv);
    }

    @GetMapping("{id}")
    GiaoVien getGiaovienById(@PathVariable Long id){
        return service.getGiaovienById(id);
    }

    @DeleteMapping("{id}")
    void deleteGv(@PathVariable Long id){
        service.deleteGiaoVienById(id);
    }

}
