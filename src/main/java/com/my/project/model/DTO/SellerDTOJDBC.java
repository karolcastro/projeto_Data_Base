package com.my.project.model.DTO;


import java.util.List;


public class SellerDTOJDBC implements SellerDTO {

    private SellerDTO sellerDTO;


    @Override
    public void insert(SellerDTO obj) {

    }

    @Override
    public void update(SellerDTO obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void findById(Integer id) {
        sellerDTO.findById(id);

    }

    @Override
    public List<SellerDTO> findAll() {

        return null;
    }
}
