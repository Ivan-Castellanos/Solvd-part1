package com.solvd.laba.travel;

public abstract class Vehicle {
    private int fuel;
    private int passengerCapacity;
    private int topSpeed;
    private String engineState;
    private String model;
    private String serialNumber;

    public Vehicle(int fuel, int passengerCapacity, int topSpeed, String engineState, String model, String serialNumber) {
        this.fuel = fuel;
        this.passengerCapacity = passengerCapacity;
        this.topSpeed = topSpeed;
        this.engineState = engineState;
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

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
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

    public void turnEngine(String engineState) {
        System.out.print("The engine get turned " + engineState + ". \n");
        this.engineState = engineState;
    }

    public void rechargeFuel() {
        this.setFuel(100);
    }

    void consumeFuel() {
        int fuel = this.getFuel();
        this.setFuel(fuel - 40);
    }
}