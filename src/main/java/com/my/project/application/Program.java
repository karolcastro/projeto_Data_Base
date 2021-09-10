package com.my.project.application;

import com.my.project.model.entities.SellerDao;
import com.my.project.model.entities.Seller;

import java.util.Date;

public class Program {
    public  static void main(String[] args) {

        SellerDao obj = new SellerDao(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
        System.out.println(seller);
    }
}
