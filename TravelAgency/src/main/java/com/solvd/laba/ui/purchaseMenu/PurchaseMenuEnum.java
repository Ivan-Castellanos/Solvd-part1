package com.solvd.laba.ui.purchaseMenu;

import com.solvd.laba.ui.IMenuEnum;

public enum PurchaseMenuEnum implements IMenuEnum {
    SHOW_TRAVEL("Show selected travel."),
    EXECUTE_PAYMENT("Proceed to payment."),
    GO_BACK("GO back to Main Menu."),
    EXIT("Exit");

    private final String value;

    PurchaseMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
