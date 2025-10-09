package com.example.demo.service;

import com.example.demo.entity.HocSinh;
import com.example.demo.repository.HocSinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocSinhService {
    @Autowired
    private HocSinhRepository repo;

    public HocSinhService(HocSinhRepository repo) {
        this.repo = repo;
    }

    public HocSinhService() {
    }

    public List<HocSinh>getAllHs(){
        return repo.findAll();
    }

    public HocSinh getHsById(Long id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay hoc sinh can tim"));
    }

    public HocSinh createHs(HocSinh hs){
        return repo.save(hs);
    }

    public HocSinh updateHs(HocSinh hs, Long id){
        HocSinh existing = repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay de sua"));
        existing.setMaHs(hs.getMaHs());
        existing.setTenHs(hs.getTenHs());
        existing.setMaLop(hs.getMaLop());
        existing.setGhiChu(hs.getGhiChu());
        return repo.save(existing);
    }

    public void deleteHs(Long id){
        repo.delete(repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay de xoa")));
    }
}
