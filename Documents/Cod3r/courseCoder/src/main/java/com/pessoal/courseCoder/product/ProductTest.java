package com.pessoal.courseCoder.product;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("Celular", 300.25);

        Product p2 = new Product("Cama", 500.75);

        Product.discount = 0.50;

        System.out.printf(p1.name + " = R$ %.2f" , p1.priceWithDiscount());
        System.out.println();
        System.out.printf(p2.name + " = R$ %.2f" , p2.priceWithDiscount());
        System.out.println();

        double precoFinalP1 = p1.priceWithDiscount();
        double precoFinalP2 = p2.priceWithDiscount(0.1);
        double media = (precoFinalP1 + precoFinalP2) / 2;

        System.out.printf("Media = R$ %.2f. " , media);


    }
}