package com.my.project.model.DTO;

import com.my.project.model.entities.Department;
import com.my.project.model.entities.Seller;

import java.util.List;

public interface SellerDTO {

    void insert(SellerDTO obj);

    void update(SellerDTO obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<SellerDTO> findAll();

    List<Seller> findByDepartment(Department department);
}
