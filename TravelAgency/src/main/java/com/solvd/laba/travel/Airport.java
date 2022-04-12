package com.solvd.laba.travel;

import com.solvd.laba.ui.RandomGenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Airport extends Location {
    public Airport(String name, String tags) {
        super(name, tags);
    }

    RandomGenerator randomGenerator = new RandomGenerator();
    int planeQuantity = 10;

}