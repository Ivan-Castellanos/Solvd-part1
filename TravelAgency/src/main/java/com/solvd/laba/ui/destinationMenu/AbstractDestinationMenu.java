package com.solvd.laba.ui.destinationMenu;

import com.solvd.laba.lambda.IShowDate;
import com.solvd.laba.ui.AbstractMenu;
import com.solvd.laba.ui.RandomGenerator;
import com.solvd.laba.ui.countrieslMenu.CountriesMenuEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public abstract class AbstractDestinationMenu<T extends Enum<T>, L extends List<T>> extends AbstractMenu<T> {
    private final static Logger LOGGER = LogManager.getLogger(AbstractDestinationMenu.class);

    public List<CountriesMenuEnum> remainingEnums(CountriesMenuEnum result){
        List<CountriesMenuEnum> listOfCountries = new ArrayList<>();
        for (CountriesMenuEnum option : CountriesMenuEnum.class.getEnumConstants()) {
            if (option != result) {
                listOfCountries.add(option);
            }
        }
        return listOfCountries;
    }

    public T changeOption(L options) {
        T newTag = manageOptions(options);
        LOGGER.info("Option selected in changeOption: ");
        return newTag;
    }

    public void printRemainingElements(L options) {
        IShowDate stringDate = Date::toString;

        LOGGER.info("Clock: " + stringDate.showDate(clock));
        LOGGER.info("Giving all elements options");
        for (T country: options) {
            LOGGER.info(options.indexOf(country) + "- " + country + ".");
        }
    }

    public T manageOptions(L options) {

        LOGGER.info("Choosing Menu ui options");
        printRemainingElements(options);

        RandomGenerator<T> randomGenerator = new RandomGenerator<>();
        String chosenOption = String.valueOf(randomGenerator.randomRandIntEnum(options));

        LOGGER.info("Chosen option: " + Integer.parseInt(chosenOption));

        String pattern = "[0-9]+";
        if (!regex.validateInput(pattern, chosenOption)) {
            LOGGER.warn("No natural number entered in Menu options");
            return manageOptions(options);
        }
        try {
            return options.get(Integer.parseInt(chosenOption));
        } catch (NumberFormatException e) {
            LOGGER.error(e);
        }
        LOGGER.warn("Number entered is not between given options");
        return manageOptions(options);
    }
}
