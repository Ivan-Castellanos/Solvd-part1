package main.model.com.solvd.laba;


import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Messages.class);

    public static void main(String[] args) {
        Menu menu = new Menu();
        Messages messages = new Messages();
        Scanner sc = new Scanner(System.in);

        messages.welcomeScreen();
        menu.menuOptions();
        messages.selectionMessage();
        menu.menu();
    }
}
