package com.solvd.laba.travel;

import com.solvd.laba.ui.RandomGenerator;

public class Airport extends Location {
    RandomGenerator randomGenerator = new RandomGenerator();
    int planeQuantity = 10;

    public Airport(String name, String tags) {
        super(name, tags);
    }

}