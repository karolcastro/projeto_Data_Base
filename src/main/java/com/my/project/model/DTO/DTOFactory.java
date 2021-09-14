package com.my.project.model.DTO;

import com.my.project.exceptions.DB;

public class DTOFactory {

    public static SellerDTO creatSellerDTO() {

        return new SellerDTOJDBC(DB.getConnection());
    }
}
