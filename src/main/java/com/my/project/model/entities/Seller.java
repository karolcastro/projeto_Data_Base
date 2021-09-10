package com.my.project.model.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_seller")
public class Seller implements Serializable {

    @Id
    @NotNull
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
