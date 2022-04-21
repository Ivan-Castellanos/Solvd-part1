package com.solvd.laba.ui.paymentMenu;

import com.solvd.laba.data.User;
import com.solvd.laba.payment.Credit;
import com.solvd.laba.payment.Debit;
import com.solvd.laba.ui.AbstractMenuEnum;
import com.solvd.laba.ui.purchaseMenu.PurchaseMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaymentMenu extends AbstractMenuEnum<PaymentMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(com.solvd.laba.ui.mainMenu.MainMenu.class);
    private final User user;

    public PaymentMenu(User user) {
        this.user = user;
        LOGGER.info("Printing Payment Menu");
        PaymentMenuEnum option = changeOption(PaymentMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(PaymentMenuEnum result) {
        switch (result) {
            case DEBIT:
                //TODO implement debit payment
                Debit newDebit = new Debit();
                LOGGER.info("Debit card Number " + newDebit.getCardNumber());
                LOGGER.info("Debit card security Number " + newDebit.getSecurityNumber());
                break;
            case CREDIT:
                //TODO implement credit payment
                Credit newCredit = new Credit();
                LOGGER.info("Credit card Number: " + newCredit.getCardNumber());
                LOGGER.info("Credit card security Number: " + newCredit.getSecurityNumber());
                new CreditOptionMenu(user);
                break;
            case GO_BACK:
                new PurchaseMenu(user);
            case EXIT:
                break;
        }
    }
}