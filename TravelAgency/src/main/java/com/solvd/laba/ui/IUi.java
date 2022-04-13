package com.solvd.laba.ui;

public interface IUi<T> {

    T changeOption(Class<T> options);

    T manageOptions(Class<T> options);
}

