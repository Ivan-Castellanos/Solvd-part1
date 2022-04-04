package com.solvd.laba.travel;

public class Plane extends Vehicle {

    public Plane(int fuel, int passengerCapacity, int topSpeed, String engineState, String model, String serialNumber) {
        super(fuel, passengerCapacity, topSpeed, engineState, model, serialNumber);
    }

    private static void takeOff() {
        System.out.print("The plane take off.\n");
    }

    private static void landing() {
        System.out.print("The plane has landed.\n");
    }

    public void travel() {
        takeOff();
        consumeFuel();
        landing();
    }

}
