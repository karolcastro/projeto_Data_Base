package com.my.project.model.entities;

import lombok.*;
import java.io.Serializable;


@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Department implements Serializable {
    private Integer id;
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
