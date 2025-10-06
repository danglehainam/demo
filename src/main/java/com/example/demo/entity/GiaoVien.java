package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "giaovien")
public class GiaoVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String maGv;
    private String tenGv;
    private int tuoi;
    private String ghiChu;

    public GiaoVien() {
    }

    public GiaoVien(String ghiChu, int tuoi, String tenGv, String maGv, Long id) {
        this.ghiChu = ghiChu;
        this.tuoi = tuoi;
        this.tenGv = tenGv;
        this.maGv = maGv;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
