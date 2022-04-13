package com.solvd.laba.ui.userMenu;

import com.solvd.laba.lambda.IShowDate;
import com.solvd.laba.ui.AbstractMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Date;

public abstract class AbtractMenuEnum <T extends Enum<T>> extends AbstractMenu<T> {
    private static final Logger LOGGER = LogManager.getLogger(AbtractMenuEnum.class);

    public void printAllElements(Class<T> options) {

        IShowDate stringDate = Date::toString;

        LOGGER.info("Clock: " + stringDate.showDate(clock));
        LOGGER.info("Giving all elements options");
        Arrays.stream(options.getEnumConstants()).forEach(option ->
                LOGGER.info(option.ordinal() + "- " + option + "."));
    }
}
