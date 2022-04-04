package com.solvd.laba.ui;

import com.solvd.laba.travel.Plane;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Messages.class);

    public static void main(String[] args) {
        Plane plane1 = new Plane(100, 50, 660, "off", "Boing", "S/n 2456");
        Plane plane2 = new Plane(100, 50, 660, "off", "Boing", "S/n 5879");
        Queue<String> hangar1 = new LinkedList<String>();

        //just testing the Queue.
        hangar1.add(plane1.getSerialNumber());
        hangar1.add(plane2.getSerialNumber());
        System.out.print(hangar1);
        hangar1.remove();
        System.out.print(hangar1);


        /*
        Menu menu = new Menu();
        Messages messages = new Messages();
        Scanner sc = new Scanner(System.in);


        messages.welcomeScreen();
        menu.menuOptions();
        messages.selectionMessage();
        menu.menu();*/
    }
}
