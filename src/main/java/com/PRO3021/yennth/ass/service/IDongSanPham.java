package com.PRO3021.yennth.ass.service;

import com.PRO3021.yennth.ass.entity.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDongSanPham extends JpaRepository<DongSanPham, Integer> {
}
