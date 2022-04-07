package com.solvd.laba.ui;

import java.util.Random;

public class RandomGenerator {

    public String[] serialNumberGenerator(int n) {
        Random random = new Random();
        String[] serialNumbers = new String[n];

        for (int i = 0; i < n; i++) {
            serialNumbers[i] = String.valueOf(random.nextInt(999, 9999));
        }
        return serialNumbers;
    }
}
