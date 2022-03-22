package com.solvd.laba.travelAgency.model.travel;

public class Travel {
    private int value;
    private String[] POSIBLE_DATES = {"01/04/2022","08/04/2022", "15/04/2022"};

    public int ArgToUSA(){
        return value = 1500;
    }

    public int ArgToBelarus(){
        return value = 2400;
    }

    public int usaToBelarus(){
        return value = 5000;
    }

    public void printDates() {
        for (int i = 0; i < POSIBLE_DATES.length; i++) {
            System.out.println((i + 1) +") " + POSIBLE_DATES[i]);
        }
    }
}
