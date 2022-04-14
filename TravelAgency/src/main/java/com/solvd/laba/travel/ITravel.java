package com.solvd.laba.travel;

import com.solvd.laba.ui.countrieslMenu.CountriesMenuEnum;

public interface ITravel {
    void calculateDistance(CountriesMenuEnum origin, CountriesMenuEnum destination);

    void calculatePrice(int distance);

    void calculateTime(int distance);
}
