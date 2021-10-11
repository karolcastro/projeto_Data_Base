package com.pessoal.courseCoder.Data;

public class AreaCircunferencia {

    public Double raio;
    public Double pi ;

    public AreaCircunferencia(double raioInicial) {
        pi = 3.14;
        raio = raioInicial;
    }

    public double area() {
        return pi * Math.pow(raio,2);
    }

}
