package com.solvd.laba.data;

import java.util.Random;

public class RandomGenerator {
    static Random random = new Random();

    public static int generateRandomNumber(int start, int bound) {
        return random.nextInt(start, bound);
    }

    public static int generateRandomNumber(int bound) {
        return random.nextInt(bound);
    }

    public static int[] generateCard() {
        int[] card = new int[4];
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(999, 9999);
            card[i] = number;
        }
        return card;
    }
}
