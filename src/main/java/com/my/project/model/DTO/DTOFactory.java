package com.my.project.model.DTO;

import com.my.project.model.DTO.impl.SellerDaoJDBC;

public class DTOFactory {

    public static SellerDTO creatSellerDao() {
        return new SellerDaoJDBC();
    }
}
