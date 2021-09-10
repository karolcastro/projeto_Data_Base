package com.my.project.model.DTO;

import java.util.List;

public interface SellerDTO {

    void insert(SellerDTO obj);
    void update(SellerDTO obj);
    void deleteById(Integer id);
    void findById(Integer id);
    List<SellerDTO> findAll();
}
