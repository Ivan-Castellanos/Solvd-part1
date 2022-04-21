package com.solvd.laba.ui.paymentMenu;

import com.solvd.laba.data.User;
import com.solvd.laba.ui.AbstractMenuEnum;
import com.solvd.laba.ui.purchaseMenu.PurchaseMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreditOptionMenu extends AbstractMenuEnum<CreditOptionsEnum> {
    private final static Logger LOGGER = LogManager.getLogger(com.solvd.laba.ui.mainMenu.MainMenu.class);
    private final User user;

    public CreditOptionMenu(User user) {
        this.user = user;
        LOGGER.info("Printing Credit Menu");
        CreditOptionsEnum option = changeOption(CreditOptionsEnum.class);
        manageCases(option);
    }

    public void manageCases(CreditOptionsEnum result) {
        switch (result) {
            case ONE:
                LOGGER.info("The price will be: " + user.getTravel().getPrice());
                break;
            case THREE:
                LOGGER.info("The price will be three installments of: $" + (user.getTravel().getPrice() / 3 + " each."));
                break;
            case SIX:
                LOGGER.info("The price will be three installments of: $" + (user.getTravel().getPrice() / 6 + " each."));
            case GO_BACK:
                new PurchaseMenu(user);
            case EXIT:
                break;
        }
    }
}
