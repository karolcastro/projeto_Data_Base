package com.pessoal.courseCoder;

import com.pessoal.courseCoder.Data.AreaCircunferencia;
import org.junit.jupiter.api.Test;

public class AreaCircunferenciaTest {
    public static void main(String[] args) {

        AreaCircunferencia a1 = new AreaCircunferencia(10);
        a1.pi = 10.0;
        System.out.println(a1.area());

        AreaCircunferencia a2 = new AreaCircunferencia(5);
        a2.pi = 2.3;
        System.out.println(a1.area());
        }
    }