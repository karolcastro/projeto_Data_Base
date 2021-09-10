package com.my.project.model.dao;

import com.my.project.model.entities.SellerDao;

import java.util.List;

public interface DepartmentDao {

    void insert(SellerDao obj);
    void update(SellerDao obj);
    void deleteById(Integer id);
    SellerDao findById(Integer id);
    List<SellerDao> findAll();

}
