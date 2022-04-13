package com.solvd.laba.ui;

import java.util.List;
import java.util.Random;

public class RandomGenerator <T extends Enum<T>> {
    Random random = new Random();

    public String[] serialNumberGenerator(int n) {
        String[] serialNumbers = new String[n];

        for (int i = 0; i < n; i++) {
            serialNumbers[i] = String.valueOf(random.nextInt(999, 9999));
        }
        return serialNumbers;
    }

    public int randomRandIntEnum(Class<T> enum_list){
        return random.nextInt(0, enum_list.getEnumConstants().length);
    }

    public int randomRandIntEnum(List<T> enum_list){
        return random.nextInt(0, enum_list.size());
    }
}
