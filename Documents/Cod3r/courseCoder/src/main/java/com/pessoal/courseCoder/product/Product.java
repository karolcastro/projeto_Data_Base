package com.pessoal.courseCoder.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {

    String name;
    Double price;
    static Double discount = 0.25;

    double priceWithDiscount() {
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}
