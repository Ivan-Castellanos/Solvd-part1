package com.solvd.laba.travelAgency.model;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        Menu.welcomeScreen();
        menu.menuOptions();
        menu.selectionMessage();
        menu.menu();
    }
}
