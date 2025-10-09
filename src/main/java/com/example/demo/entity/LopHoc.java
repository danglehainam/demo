package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lophoc")
public class LopHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String maLop;
    private String tenLop;
    private String maGv;
    private String ghiChu;

    public LopHoc(Long id, String maLop, String tenLop, String maGv, String ghiChu) {
        this.id = id;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maGv = maGv;
        this.ghiChu = ghiChu;
    }

    public LopHoc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
