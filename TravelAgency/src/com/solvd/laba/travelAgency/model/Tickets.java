package com.solvd.laba.travelAgency.model;

public class Tickets {
    private int ticketNumber;
    private String passengerName;
    private int seatNumber;
    private String ticketClass;
    private int value;

    public Tickets(int ticketNumber, String passengerName, int seatNumber, String ticketClass, int value) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.ticketClass = ticketClass;
        this.value = value;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
