package com.solvd.laba.lambda;

@FunctionalInterface
public interface IRegexCompare {
    boolean validateInput(String patter, String input);
}
