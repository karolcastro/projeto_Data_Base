package com.my.project.model.entities;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_department")
public class Department implements Serializable {

    @Id
    @NonNull
    private Integer id;
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
