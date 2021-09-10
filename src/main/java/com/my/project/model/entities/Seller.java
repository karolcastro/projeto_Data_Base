package com.my.project.model.entities;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Seller implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private SellerDao department;

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, SellerDao department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }
}
