package com.my.project.application;

import com.my.project.model.DTO.DTOFactory;
import com.my.project.model.DTO.SellerDTO;
import com.my.project.model.entities.Department;
import com.my.project.model.entities.Seller;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.boot.SpringApplication;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class Program {
    public  static void main(String[] args) throws SQLException {


        SpringApplication.run(Program.class, args);
        System.out.println(" aplicação rodando ");


        //Department obj = new Department(1, "Books");
        //System.out.println(obj);

        //Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00);
        //System.out.println(seller);

        SellerDTO sellerDTO = DTOFactory.creatSellerDTO();

        System.out.println("===Test 1 : seller findById ===");
        Seller seller = sellerDTO.findById(3);
        System.out.println(seller);

        System.out.println("===Test 2 : seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDTO.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("===Test 3 : seller findAll ===");
        list = sellerDTO.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("===Test  4: seller findAll ===");
        Seller newSeller = new Seller(null, "Bob", "bob@gmail.com", new Date(), 4000.0, department);
        sellerDTO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

    }
}
