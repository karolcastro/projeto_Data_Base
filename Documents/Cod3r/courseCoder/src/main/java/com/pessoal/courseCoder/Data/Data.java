package com.pessoal.courseCoder.Data;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data() {

    }

    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);

    }

    public void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
