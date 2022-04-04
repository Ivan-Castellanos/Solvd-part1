package com.solvd.laba.travel;

public class Bus extends Vehicle {

    public Bus(int fuel, int passengerCapacity, int topSpeed, String engineState, String model, String serialNumber) {
        super(fuel, passengerCapacity, topSpeed, engineState, model, serialNumber);
    }

    public static void departing() {
        System.out.print("The bus take leaves the station.\n");
    }

    private static void arrive() {
        System.out.print("The bus just arrive at the station.\n");
    }


}
