package com.PRO3021.yennth.btvn.B12.service;

import com.PRO3021.yennth.btvn.B12.entity.B12_CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface B12_ICuaHang extends JpaRepository<B12_CuaHang, Integer> {
}
