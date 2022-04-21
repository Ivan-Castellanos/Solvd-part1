package com.solvd.laba.payment;

import com.solvd.laba.data.RandomGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public abstract class AbstractCard implements IPayable {
    private static final Logger LOGGER = LogManager.getLogger(AbstractCard.class);
    private String cardNumber;
    private int securityNumber;

    public AbstractCard() {
        LOGGER.info("New card generated");
        this.cardNumber = getDataCardNumber();
        this.securityNumber = getDataSecurityNumber();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }


    @Override
    public void payMe() {
        LOGGER.info("Processing payment...");
        LOGGER.info("payment was successful! ");
    }

    public String getDataCardNumber() {
        LOGGER.info("Enter the card number: ");
        return Arrays.toString(RandomGenerator.generateCard()).replace(", ", "-").replaceAll("[\\[\\]]", "");
    }

    public int getDataSecurityNumber() {
        LOGGER.info("Enter the security code: ");
        return RandomGenerator.generateRandomNumber(100, 999);
    }
}