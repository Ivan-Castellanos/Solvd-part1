package com.solvd.laba.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Messages {
    private final static Logger LOGGER = LogManager.getLogger(Messages.class);

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

//    public static Integer nextFLightsMessage(String destination) {
//        LOGGER.info("The next flights to " + destination + ": ");
//        Travel.printDates();
//        Messages.selectionMessage();
//        int date = sc.nextInt();
//        if (date < 1 || date > 3) {
//            Messages.exit();
//            return null;
//        } else {
//            return date - 1;
//        }
//    }
}
