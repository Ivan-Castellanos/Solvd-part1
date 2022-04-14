package com.solvd.laba.travel;

import com.solvd.laba.ui.countriesMenu.CountriesMenuEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Travel implements ITravel {
    private final static Logger LOGGER = LogManager.getLogger(Travel.class);
    private static final float PRICE = 0.25f;
    private static final int AVERAGE_VELOCITY = 900;
    private CountriesMenuEnum from;
    private CountriesMenuEnum destination;
    private int travelTime;
    private int distance;
    private float price;

    public Travel(CountriesMenuEnum from, CountriesMenuEnum destination) {
        this.from = from;
        this.destination = destination;
        calculateDistance(from, destination);
        calculatePrice(distance);
        calculateTime(distance);
    }

    public Travel() {
    }

    public CountriesMenuEnum getFrom() {
        return from;
    }

    public void setFrom(CountriesMenuEnum from) {
        this.from = from;
    }

    public CountriesMenuEnum getDestination() {
        return destination;
    }

    public void setDestination(CountriesMenuEnum destination) {
        this.destination = destination;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void calculateDistance(CountriesMenuEnum origin, CountriesMenuEnum destination) {
        //TODO avoid hardcoding
        switch (origin) {
            case ARGENTINA -> distance = destination == CountriesMenuEnum.USA ? 7112 : 12822;
            case USA -> distance = destination == CountriesMenuEnum.ARGENTINA ? 7112 : 8788;
            case BELARUS -> distance = destination == CountriesMenuEnum.ARGENTINA ? 12822 : 8788;
        }
        LOGGER.info("The distance is: " + distance + " km.");
    }

    @Override
    public void calculatePrice(int distance) {
        price = distance * PRICE;
        LOGGER.info("The price is: $" + price + "0.");
    }

    @Override
    public void calculateTime(int distance) {
        travelTime = distance / AVERAGE_VELOCITY;
        LOGGER.info("The travel time is: " + travelTime + " hs.");
    }

    @Override
    public String toString() {
        return "\nYou will depart from " + from +
                " to " + destination +
                ",the travel time will be of: " + travelTime +
                "hs. The distance will be of: " + distance +
                "km and you have to pay: $" + price +
                '.';
    }
}
