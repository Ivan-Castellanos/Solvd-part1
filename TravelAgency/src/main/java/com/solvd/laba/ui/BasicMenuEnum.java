package com.solvd.laba.ui;

public enum BasicMenuEnum implements IMenuEnum {
    PRINT_OPTIONS("Print Options"),
    //CREATE_USER("Create a User"),
    EXIT("Go Back");

    private final String value;

    BasicMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
