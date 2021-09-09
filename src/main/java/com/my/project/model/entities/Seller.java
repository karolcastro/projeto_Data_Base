package com.my.project.model.entities;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Seller {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private Department department;

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }
}
