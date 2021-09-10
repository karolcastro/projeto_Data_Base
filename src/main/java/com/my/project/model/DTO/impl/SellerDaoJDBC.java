package com.my.project.model.DTO.impl;


import com.my.project.model.DTO.SellerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SellerDaoJDBC implements SellerDTO {

    private Connection conn;

    public SellerDaoJDBC(Connection connection){
        this.conn = connection;
    }
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
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

    }

    @Override
    public List<SellerDTO> findAll() {
        return null;
    }
}
