package com.solvd.laba.ui.paymentMenu;

public enum PaymentMenuEnum {
    DEBIT("Pay with Debit card"),
    CREDIT("Pay with Credit card"),
    GO_BACK("GO back to Purchase Menu"),
    EXIT("Exit");

    private final String value;

    PaymentMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
