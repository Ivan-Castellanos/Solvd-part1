package com.solvd.laba.ui.paymentMenu;

import com.solvd.laba.ui.IMenuEnum;

public enum PaymentMenuEnum implements IMenuEnum {
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
