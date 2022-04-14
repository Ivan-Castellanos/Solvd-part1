package com.solvd.laba.ui;

import java.util.List;
import java.util.Random;

public class RandomGenerator<T extends Enum<T>> {
    Random random = new Random();

    //randomGenerator.randomRandIntEnum(options)
    public int randomRandIntEnum(Class<T> enum_list) {
        return random.nextInt(0, enum_list.getEnumConstants().length);
    }

    public int randomRandIntEnum(List<T> enum_list) {
        return random.nextInt(0, enum_list.size());
    }
}