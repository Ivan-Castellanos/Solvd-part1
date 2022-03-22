package com.solvd.laba.travelAgency.model;


import com.solvd.laba.travelAgency.model.travel.Airport;
import com.solvd.laba.travelAgency.model.travel.Travel;

import java.awt.*;
import java.util.Scanner;

public class Menu {
    private int election;
    private int origin;
    private static String[] COUNTRIES = {"ARGENTINA", "USA", "BELARUS"};

    Scanner sc = new Scanner(System.in);
    Travel travel = new Travel();
    Tickets ticket = new Tickets();
    Airport ezeizaAirport = new Airport("Ezeiza","EZE" );
    Airport minskAirport = new Airport("Minsk International Airport", "MSQ" );
    Airport miamiAirport = new Airport("Miami International Airport","MIA");

    public static void welcomeScreen(){
        System.out.println("""

                  ______           _                \s
                 /_  __/_  _______(_)___  ___  __  __
                  / / / / / / ___/ / __ \\/ _ \\/ / / /
                 / / / /_/ / /  / / /_/ /  __/ /_/ /\s
                /_/  \\__,_/_/  /_/ .___/\\___/\\__,_/ \s
                                /_/                 \s
                """);
    }

    public static void menuOptions(){
        System.out.println(" Where are you from?\n"+
                "1) "+ COUNTRIES[0]+"\n"+
                "2) "+ COUNTRIES[1]+"\n"+
                "3) "+ COUNTRIES[2]+"\n"+
                "4) Exit");
    }

    private static void countryMenu(int country1, int country2){
        System.out.println(" Where do you want to travel?\n"+
                "1) "+ COUNTRIES[country1]+"\n"+
                "2) "+ COUNTRIES[country2]+"\n"+
                "3) Exit");
    }

    private static int argentinianMenu(){
        countryMenu(1,2);
        return 0; //argentinian tag
    }

    private static int belarusMenu(){
        countryMenu(0,1);
        return 2; //belarus tag
    }

    private static int usaMenu() {
        countryMenu(0,2);
        return 1; //USA tag
    }

    public static void selectionMessage(){
        System.out.println("Select one of the options above: ");
    }

    private void exit() {System.out.println("Exit option selected. Thanks for using Turipeu.");
    }

    private int nextFLightsMessage(int origin, int destination){
        if (origin == 2){
            System.out.println("The next flights to "+ COUNTRIES[destination]+ ": ");
        } else {
            System.out.println("The next flights to "+ COUNTRIES[destination - 1]+ ": ");
        }
        travel.printDates();
        selectionMessage();
        int date = sc.nextInt();
        return date;
    }

    private int destination(int origin){
        int destination = sc.nextInt();
        if (destination == 1 || destination == 2) {
            return nextFLightsMessage(origin, destination);
        } else {
            return 0;
        }
    }

    private void classMessage(){
        System.out.println("""
                Now, please select the flight class that you want for this Trip: 
                1) Economy (regular price)
                2) Business (+$1000)
                """);
    }

    private int fligthClass(){
        classMessage();
        selectionMessage();
        int classELection = sc.nextInt();
        return  classELection;
    }
    public void menu(){
        election = sc.nextInt();
        switch(election){
            case 1:{
                origin = argentinianMenu();
                break;
            }
            case 2: {
                origin = usaMenu();
                break;
            }
            case 3:{
                origin = belarusMenu();
            }
            default:{
                exit();
            }
        }
        selectionMessage();
        int dateSelected = destination(origin);
        if (dateSelected == 0){
            exit();
        } else {
            election = fligthClass();
        }
    }
}
