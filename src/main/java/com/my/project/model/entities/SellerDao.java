package com.my.project.model.entities;

import lombok.*;
import java.io.Serializable;


@ToString
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class SellerDao implements Serializable {
    private Integer id;
    private String name;

    public SellerDao(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
