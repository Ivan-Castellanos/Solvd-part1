package com.solvd.laba.ui.countrieslMenu;

public enum CountriesMenuEnum {
    //TODO Add more countries once i made some price and distance implementation
    ARGENTINA("Argentina"),
    USA("USA"),
    BELARUS("Belarus");

    private final String value;

    CountriesMenuEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
