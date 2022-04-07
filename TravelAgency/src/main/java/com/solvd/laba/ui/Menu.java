package com.solvd.laba.ui;


import com.solvd.laba.travel.Ticket;
import com.solvd.laba.travel.Travel;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(Menu.class);
    static Scanner sc = new Scanner(System.in);
    private static String destination;
    private static String COUNTRIES[] = Travel.getCOUNTRIES();
    Travel travel = new Travel();
    Ticket ticket = new Ticket();
    /*Airport ezeizaAirport = new Airport("Ezeiza", "EZE");
    Airport minskAirport = new Airport("Minsk International Airport", "MSQ");
    Airport miamiAirport = new Airport("Miami International Airport", "MIA");*/
    private int election;
    private String[] travelInfo;


    public static void menuOptions() {
        LOGGER.info(" Where are you from?\n" +
                "1) " + COUNTRIES[0] + "\n" + //Countries[0] is Argentina
                "2) " + COUNTRIES[1] + "\n" + //Countries[1] is USA
                "3) " + COUNTRIES[2] + "\n" + //Countries[2] is Belarus
                "4) Exit");
    }

    private static String countryMenu(int country1, int country2) {
        LOGGER.info(" Where do you want to travel?\n" +
                "1) " + COUNTRIES[country1] + "\n" +
                "2) " + COUNTRIES[country2] + "\n" +
                "3) Exit");
        Messages.selectionMessage();
        int election = sc.nextInt();
        if (election == 1) {
            return COUNTRIES[country1];
        } else if (election == 2) {
            return COUNTRIES[country2];
        } else {
            Messages.exit();
            return null;
        }
    }

    private static String[] argentinianMenu() {
        destination = countryMenu(1, 2);
        return new String[]{COUNTRIES[0], destination}; //argentinian origin tag
    }

    private static String[] belarusMenu() {
        destination = countryMenu(0, 1);
        return new String[]{COUNTRIES[2], destination}; //belarus origin tag
    }

    private static String[] usaMenu() {
        destination = countryMenu(0, 2);
        return new String[]{COUNTRIES[1], destination}; //USA origin tag
    }


    private Float fligthClass() {
        Messages.classMessage();
        Messages.selectionMessage();
        int classELection = sc.nextInt();
        if (classELection == 1) {
            return 0f;
        } else if (classELection == 2) {
            return travel.getBusinessClassExtra();
        } else {
            Messages.exit();
            return null;
        }
    }

    public void menu() {
        election = sc.nextInt();
        switch (election) {
            case 1: {
                travelInfo = argentinianMenu();
                break;
            }
            case 2: {
                travelInfo = usaMenu();
                break;
            }
            case 3: {
                travelInfo = belarusMenu();
                break;
            }
            default: {
                Messages.exit();
            }
        }
//        int dateSelected = Messages.nextFLightsMessage(travelInfo[1]);
//        travel.setPrice(travel.pricing(travelInfo[0], travelInfo[1]) + fligthClass());
//        logger.info(ticket.passangerNumbers());
    }

//    public void entryPassengersDataMenu() {
//        int i = ticket.passangerNumbers();
//
//    }
}



