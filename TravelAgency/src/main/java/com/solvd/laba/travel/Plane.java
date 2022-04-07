package com.solvd.laba.travel;

public class Plane extends Vehicle {

    public Plane(int passengerCapacity, int topSpeed, String model, String serialNumber) {
        super(passengerCapacity, topSpeed, model, serialNumber);
    }

    private static void takeOff() {
        System.out.print("The plane take off.\n");
    }

    private static void landing() {
        System.out.print("The plane has landed.\n");
    }

    public void travel() {
        takeOff();
        rechargeFuel();
        landing();
    }

}
