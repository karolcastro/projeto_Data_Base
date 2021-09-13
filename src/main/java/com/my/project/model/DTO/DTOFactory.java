package com.my.project.model.DTO;

public class DTOFactory {

    public static SellerDTO creatSellerDTO() {

        return new SellerDTOJDBC();
    }
}
