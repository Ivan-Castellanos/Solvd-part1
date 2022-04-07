package com.solvd.laba;

import com.solvd.laba.travel.Plane;
import com.solvd.laba.ui.Messages;
import com.solvd.laba.ui.RandomGenerator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Messages.class);

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        Plane[] plane = new Plane[5];
        Queue<String> hangarEzeReady = new LinkedList<String>();
        Queue<String> hangarEzeRecharge = new LinkedList<String>();

        String[] serialNumbers = randomGenerator.serialNumberGenerator(5);
        String[] models = {"Boing"};
        int[] passengerCapacity = {250};
        int[] topSpeed = {600};

        for (int i = 0; i < serialNumbers.length; i++) {
            plane[i] = new Plane(passengerCapacity[0], topSpeed[0], models[0], serialNumbers[i]);
        }

        for (int i = 0; i < serialNumbers.length; i++) {
            plane[i].rechargeFuel();
            if (plane[i].getFuel() > 50) {
                plane[i].getFuel();
                hangarEzeReady.add(plane[i].getSerialNumber());
            } else {
                hangarEzeRecharge.add(plane[i].getSerialNumber());
            }
        }

        //just testing random generators.
        for (int i = 0; i < serialNumbers.length; i++) {
            System.out.print("The s/n is " + hangarEzeReady.poll() + "\n");
        }

        //just testing random generators.
        for (int i = 0; i < serialNumbers.length; i++) {
            System.out.print("The s/n  in recharge is " + hangarEzeRecharge.poll() + "\n");
        }

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
