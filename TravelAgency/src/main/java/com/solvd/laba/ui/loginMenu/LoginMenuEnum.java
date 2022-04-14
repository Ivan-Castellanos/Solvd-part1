package com.solvd.laba.ui.loginMenu;

public enum LoginMenuEnum {
    LOGIN("Login"),
    EXIT("Exit");

    private final String value;

    LoginMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
