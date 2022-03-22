package com.solvd.laba.travelAgency.model;


import java.util.Scanner;

public class Menu {
    int election;

    Scanner sc = new Scanner(System.in);

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
        System.out.println("""
                Where are you from?
                1) Argentina
                2) USA
                3) Belarus
                4) Exit""");
    }

    private static void argentinianMenu(){
        System.out.println("""
                Where do you want to travel?
                1) USA
                2) Belarus
                3) Exit""");
    }

    private static void belarusMenu(){
        System.out.println("""
                Where do you want to travel?
                1) USA
                2) Argentina
                3) Exit""");
    }

    private static void usaMenu() {
        System.out.println("""
                Where do you want to travel?
                1) Argentina 
                2) Belarus
                3) Exit""");
    }

    public static void selectionMessage(){
        System.out.println("Select one of the options above: ");
    }

    private void exit() {System.out.println("Exit option selected. Thanks for using Turipeu.");
    }

    public void menu(){
        election = sc.nextInt();
        switch(election){
            case 1:{
                argentinianMenu();
                selectionMessage();
                break;
            }
            case 2: {
                usaMenu();
                selectionMessage();
                break;
            }
            case 3:{
                belarusMenu();
                selectionMessage();
                break;
            }
            default:{
                exit();
            }
        }
    }

}
