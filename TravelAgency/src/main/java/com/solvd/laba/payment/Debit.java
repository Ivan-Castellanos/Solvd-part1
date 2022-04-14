package com.solvd.laba.payment;

public class Debit implements IPay {
    //Class to implement
    @Override
    public void pay() {
        System.out.println("Correct Transaction");
    }

    @Override
    public void rejectPay() {
        System.out.println("Transaction Failed");
    }
}
