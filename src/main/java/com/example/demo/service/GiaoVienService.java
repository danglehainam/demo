package com.example.demo.service;

import com.example.demo.entity.GiaoVien;
import com.example.demo.repository.GiaoVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiaoVienService {
    @Autowired
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

    public GiaoVien createGiaoVien(GiaoVien gv){
        return repo.save(gv);
    }

    public GiaoVien updateGiaovien(Long id, GiaoVien gv){
        GiaoVien existing = repo.findById(id).orElseThrow(()->new RuntimeException("Khong tim thay giao vien"));
        existing.setMaGv(gv.getMaGv());
        existing.setTenGv(gv.getTenGv());
        existing.setTuoi(gv.getTuoi());
        existing.setGhiChu(gv.getGhiChu());
        return repo.save(existing);
    }

    public GiaoVien getGiaovienById(Long id){
        GiaoVien gv = repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay"));
        return gv;
    }

    public void deleteGiaoVienById(Long id){
        GiaoVien gv = repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay"));
        repo.delete(gv);
    }

    public GiaoVien createGv(GiaoVien gv){
        return repo.save(gv);
    }
}
