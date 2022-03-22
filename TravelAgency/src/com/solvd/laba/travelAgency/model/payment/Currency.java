package com.solvd.laba.travelAgency.model.payment;

public class Currency {
    private int dolar;
    private int peso;
    private int belarusianRuble;

    public float dolarToPeso(int value){
        return value*115.00f;
    }

    public float dolarToRelarusianRuble(int value){
        return (value*3.27f);
    }
}
