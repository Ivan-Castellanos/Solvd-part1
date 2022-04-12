package com.solvd.laba.ui;

import com.solvd.laba.travel.Travel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Messages {
    private final static Logger LOGGER = LogManager.getLogger(Messages.class);
    static Scanner sc = new Scanner(System.in);

    public static void welcomeScreen() {
        LOGGER.info("""

                  ______           _                \s
                 /_  __/_  _______(_)___  ___  __  __
                  / / / / / / ___/ / __ \\/ _ \\/ / / /
                 / / / /_/ / /  / / /_/ /  __/ /_/ /\s
                /_/  \\__,_/_/  /_/ .___/\\___/\\__,_/ \s
                                /_/                 \s
                """);
    }

    public static void selectionMessage() {
        LOGGER.info("Select one of the options above: ");
    }

    public static void exit() {
        LOGGER.info("Exit option selected. Thanks for using Turipeu.");
    }

    public static void classMessage() {
        LOGGER.info("""
                Now, please select the flight class that you want for this Trip:
                1) Economy (regular price)
                2) Business (+$2000)
                """);
    }

    public static Integer nextFLightsMessage(String destination) {
        LOGGER.info("The next flights to " + destination + ": ");
        Travel.printDates();
        Messages.selectionMessage();
        int date = sc.nextInt();
        if (date < 1 || date > 3) {
            Messages.exit();
            return null;
        } else {
            return date - 1;
        }
    }
}
