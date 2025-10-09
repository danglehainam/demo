package com.example.demo.service;

import com.example.demo.entity.LopHoc;
import com.example.demo.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocService {
    @Autowired
    private LopHocRepository repo;

    public LopHocService(LopHocRepository repo) {
        this.repo = repo;
    }

    public LopHocService() {
    }

    public List<LopHoc>getAllLh(){
        return repo.findAll();
    }

    public LopHoc createLh(LopHoc lh){
        return repo.save(lh);
    }

    public LopHoc getLopHocById(Long id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("Khong thay lop nay"));
    }

    public LopHoc updateLopHoc(Long id, LopHoc lh){
        LopHoc lhNew = repo.findById(id).orElseThrow();
        lhNew.setMaLop(lh.getMaLop());
        lhNew.setTenLop(lh.getTenLop());
        lhNew.setMaGv(lh.getMaGv());
        lhNew.setGhiChu(lh.getGhiChu());
        return repo.save(lhNew);
    }

    public void deleteLopHoc(Long id){
        repo.delete(repo.findById(id).orElseThrow());
    }
}
