package com.solvd.laba.ui;

import com.solvd.laba.data.RandomGeneratorforEnum;
import com.solvd.laba.lambda.IRegexCompare;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractMenu<T extends Enum<T>> implements IUi<T> {
    public static final Date clock = new Date();
    protected final static IRegexCompare regex = ((pattern, input) -> {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        return m.matches();
    });
    private static final Logger LOGGER = LogManager.getLogger(AbstractMenu.class);

    public abstract void printAllElements(Class<T> options);

    @Override
    public T changeOption(Class<T> options) {
        T newTag = manageOptions(options);
        return newTag;
    }

    @Override
    public T manageOptions(Class<T> options) {

        printAllElements(options);

        //Unused temporary in order to select personally the execution process.
        RandomGeneratorforEnum<T> randomGeneratorforEnum = new RandomGeneratorforEnum<>();
        Scanner sc = new Scanner(System.in);
        String chosenOption = String.valueOf(sc.nextInt()); //change here with randomGeneratorforEnum.randomRandIntEnum(options) to randomize execution.

        LOGGER.info("Chosen option: " + Integer.parseInt(chosenOption));

        String pattern = "[0-4]";
        if (!regex.validateInput(pattern, chosenOption)) {
            LOGGER.warn("No natural number entered in Menu options");
            return manageOptions(options);
        }
        try {
            return options.getEnumConstants()[Integer.parseInt(chosenOption)];
        } catch (NumberFormatException e) {
            LOGGER.error(e);
        }
        LOGGER.warn("Number entered is not between given options");
        return manageOptions(options);
    }
}
