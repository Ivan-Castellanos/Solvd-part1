package com.solvd.laba.travel;

import com.solvd.laba.payment.Currency;

public class Travel implements ITravel {
    private static String[] COUNTRIES = {"ARGENTINA", "USA", "BELARUS"};
    private static String[] POSIBLE_DATES = {"01/04/2022", "08/04/2022", "15/04/2022"};
    Currency currency = new Currency();
    private int value;
    private int[] PRICES = {1500, 2400, 5000};
    private float price;
    private float businessClassExtra = 2000f;

    public static String[] getCOUNTRIES() {
        return COUNTRIES;
    }

    public static void setCOUNTRIES(String[] COUNTRIES) {
        Travel.COUNTRIES = COUNTRIES;
    }

    public static void printDates() {
        for (int i = 0; i < POSIBLE_DATES.length; i++) {
            System.out.println((i + 1) + ") " + POSIBLE_DATES[i]);
        }
    }

    public float getBusinessClassExtra() {
        return businessClassExtra;
    }

    public void setBusinessClassExtra(int businessClassExtra) {
        this.businessClassExtra = businessClassExtra;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int argToUSA() {
        return value = 1500;
    }

    public int argToBelarus() {
        return value = 2400;
    }

    public int usaToBelarus() {
        return value = 5000;
    }

    public float pricing(String origin, String destination) {
        if (origin == COUNTRIES[0] && destination == COUNTRIES[1] || origin == COUNTRIES[1] && destination == COUNTRIES[0]) {
            return argToUSA();
        } else if (origin == COUNTRIES[0] && destination == COUNTRIES[2] || origin == COUNTRIES[2] && destination == COUNTRIES[0]) {
            return argToBelarus();
        } else {
            return usaToBelarus();
        }
    }
}