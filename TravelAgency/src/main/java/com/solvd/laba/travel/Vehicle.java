package com.solvd.laba.travel;

import java.util.Random;

public abstract class Vehicle {
    Random random = new Random();
    private int fuel;
    private int passengerCapacity;
    private int topSpeed;
    private String model;
    private String serialNumber;

    public Vehicle(int passengerCapacity, int topSpeed, String model, String serialNumber) {
        this.fuel = 0;
        this.passengerCapacity = passengerCapacity;
        this.topSpeed = topSpeed;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void rechargeFuel() {
        this.setFuel(random.nextInt(100));
    }
}