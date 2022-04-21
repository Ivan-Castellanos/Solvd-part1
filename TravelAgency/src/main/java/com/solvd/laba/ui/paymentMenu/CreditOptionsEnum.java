package com.solvd.laba.ui.paymentMenu;

import com.solvd.laba.ui.IMenuEnum;

public enum CreditOptionsEnum implements IMenuEnum {
    ONE("Pay in a single fee"),
    THREE("Pay in 3 installments"),
    SIX("Pay in 6 installments"),
    GO_BACK("GO back to Purchase Menu"),
    EXIT("Exit");

    private final String value;

    CreditOptionsEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
