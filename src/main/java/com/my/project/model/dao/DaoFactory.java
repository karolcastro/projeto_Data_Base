package com.my.project.model.dao;

import com.my.project.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static  SellerDao creatSellerDao() {
        return new SellerDaoJDBC();
    }
}
