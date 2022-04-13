package com.solvd.laba.ui.userMenu;

public enum UserMenuEnum {
    LOGIN("Login"),
    //CREATE_USER("Create a User"),
    EXIT("Exit");

    private final String value;

    UserMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
