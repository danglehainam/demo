package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name="hocsinh")
public class HocSinh{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String maHs;
    private String tenHs;
    private String maLop;
    private String ghiChu;

    public HocSinh(Long id, String maHs, String tenHs, String maLop, String ghiChu) {
        this.id = id;
        this.maHs = maHs;
        this.tenHs = tenHs;
        this.maLop = maLop;
        this.ghiChu = ghiChu;
    }

    public HocSinh() {
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenHs() {
        return tenHs;
    }

    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
