package com.solvd.laba.ui.mainMenu;

import com.solvd.laba.ui.IMenuEnum;

public enum MainMenuEnum implements IMenuEnum {
    CHECK_FLIGHTS("Check flights."),
    PURCHASE("Purchase flight."),
    EXIT("Exit");

    private final String value;

    MainMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
