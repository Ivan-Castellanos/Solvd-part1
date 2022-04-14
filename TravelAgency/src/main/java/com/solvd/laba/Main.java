package com.solvd.laba;

import com.solvd.laba.ui.loginMenu.LoginMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Starting execution.");
        //TODO override toString, hashCode and equals for all non abstract class
        //TODO check unused classes
        //TODO erase unused comments
        //TODO implement multi person ticket
        LoginMenu menu = new LoginMenu();
        LOGGER.info("Ending execution.");


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
