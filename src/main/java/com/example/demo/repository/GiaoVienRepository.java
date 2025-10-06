package com.example.demo.repository;

import com.example.demo.entity.GiaoVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GiaoVienRepository extends JpaRepository<GiaoVien, Long> {
    @Query(value = "SELECT ten_gv FROM giaovien", nativeQuery = true)
    List<String> layTenGiaoVienThoi();
}
