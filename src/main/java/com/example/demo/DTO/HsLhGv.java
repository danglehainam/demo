package com.example.demo.DTO;

public class HsLhGv {
    private String tenHs;
    private String tenLh;
    private String tenGv;

    public HsLhGv(String tenHs, String tenLh, String tenGv) {
        this.tenHs = tenHs;
        this.tenLh = tenLh;
        this.tenGv = tenGv;
    }

    public HsLhGv() {
    }

    public String getTenHs() {
        return tenHs;
    }

    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }

    public String getTenLh() {
        return tenLh;
    }

    public void setTenLh(String tenLh) {
        this.tenLh = tenLh;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }
}
