package com.my.project.model.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@ToString
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "department")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 32, nullable = false)
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
