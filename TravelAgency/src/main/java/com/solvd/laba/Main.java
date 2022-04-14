package com.solvd.laba;

import com.solvd.laba.ui.Messages;
import com.solvd.laba.ui.loginMenu.LoginMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Starting execution.");
        Messages.welcomeScreen();
        LoginMenu menu = new LoginMenu();
        LOGGER.info("Ending execution.");
        //TODO check unused classes
        //TODO erase unused comments
        //TODO implement multi person ticket
        //TODO implement the stay branch in order to look for hotels or an apartment.
        //TODO implement custom linked list.
    }
}
