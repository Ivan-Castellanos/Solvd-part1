package com.solvd.laba.travelAgency.model.payment;

public class Debit implements Ipay{

    @Override
    public void pay() {
        System.out.println("Correct Transaction");
    }

    @Override
    public void rejectPay() {
        System.out.println("Transaction Failed");
    }
}
