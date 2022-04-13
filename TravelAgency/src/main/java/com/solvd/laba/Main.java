package com.solvd.laba;

import com.solvd.laba.collection.CustomLinkedList;
import com.solvd.laba.travel.Plane;
import com.solvd.laba.ui.RandomGenerator;
import com.solvd.laba.ui.userMenu.UserMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        UserMenu menu = new UserMenu();
//        RandomGenerator randomGenerator = new RandomGenerator();
//        int planeQuantity = 10;
//
//        Plane[] plane = new Plane[planeQuantity];
//        List<String> hangarEzeReady = new ArrayList<String>();
//        CustomLinkedList<String> hangarEzeRecharge = new CustomLinkedList<String>();
//        String[] serialNumbers = randomGenerator.serialNumberGenerator(planeQuantity);
//        String[] models = {"Boing"};
//        int[] passengerCapacity = {250};
//        int[] topSpeed = {600};
//
//        for (int i = 0; i < serialNumbers.length; i++) {
//            plane[i] = new Plane(passengerCapacity[0], topSpeed[0], models[0], serialNumbers[i]);
//        }
//
//        for (int i = 0; i < serialNumbers.length; i++) {
//            plane[i].rechargeFuel();
//            if (plane[i].getFuel() > 50) {
//                plane[i].getFuel();
//                hangarEzeReady.add(plane[i].getSerialNumber());
//            } else {
//                hangarEzeRecharge.insert(plane[i].getSerialNumber());
//            }
//        }
//
//        //just testing random generators.
//        for (int i = 0; i < hangarEzeReady.size(); i++) {
//            LOGGER.info("The s/n is " + hangarEzeReady.get(i));
//        }
//
//        //just testing random generators.
//        hangarEzeRecharge.show();

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
