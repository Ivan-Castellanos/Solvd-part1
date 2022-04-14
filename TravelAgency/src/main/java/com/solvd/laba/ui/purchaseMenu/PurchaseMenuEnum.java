package com.solvd.laba.ui.purchaseMenu;

public enum PurchaseMenuEnum {
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
