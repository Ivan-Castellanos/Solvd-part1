package com.solvd.laba.ui.destinationMenu;

import com.solvd.laba.lambda.IShowDate;
import com.solvd.laba.ui.countrieslMenu.CountriesMenuEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DestinationMenu extends AbstractDestinationMenu<CountriesMenuEnum, List<CountriesMenuEnum>> {
    private final static Logger LOGGER = LogManager.getLogger(DestinationMenu.class);

    public DestinationMenu(CountriesMenuEnum startingCountry) {
        LOGGER.info("Printing User Menu");
        List<CountriesMenuEnum> remainings = remainingEnums(startingCountry);
        CountriesMenuEnum destination = changeOption(remainings);
        manageCases(startingCountry, destination);

    }

    @Override
    public void printAllElements(Class<CountriesMenuEnum> options) {
        IShowDate stringDate = Date::toString;

        LOGGER.info("Clock: " + stringDate.showDate(clock));
        LOGGER.info("Giving all elements options");
        Arrays.stream(options.getEnumConstants()).forEach(option ->
                LOGGER.info(option.ordinal() + "- " + option + "."));
    }

    public void manageCases(CountriesMenuEnum startingCountry, CountriesMenuEnum destination) {
        LOGGER.info("We travel from " + startingCountry.toString() + " to " + destination.toString());
    }


}
