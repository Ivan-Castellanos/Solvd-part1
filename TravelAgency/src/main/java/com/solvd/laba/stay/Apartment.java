package com.solvd.laba.stay;

public class Apartment implements IStay {

    @Override
    public void hasVacancy() {
        System.out.println("This apartment is occupied");
    }

    @Override
    public void fullOcupation() {
        System.out.println("This apartment is empty");
    }
}
