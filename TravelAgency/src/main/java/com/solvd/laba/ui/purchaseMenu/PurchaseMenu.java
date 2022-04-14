package com.solvd.laba.ui.purchaseMenu;

import com.solvd.laba.exception.NullTravel;
import com.solvd.laba.data.User;
import com.solvd.laba.ui.AbstractMenuEnum;
import com.solvd.laba.ui.mainMenu.MainMenu;
import com.solvd.laba.ui.paymentMenu.PaymentMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PurchaseMenu extends AbstractMenuEnum<PurchaseMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final User user;

    public PurchaseMenu(User user) {
        this.user = user;
        LOGGER.info("Printing User Menu");
        PurchaseMenuEnum option = changeOption(PurchaseMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(PurchaseMenuEnum result) {
        switch (result) {
            case SHOW_TRAVEL:
                try {
                    if (user.getTravel() == null) {
                        throw new NullTravel();
                    } else {
                        LOGGER.info(user.toString());
                    }
                } catch (NullTravel e) {
                    LOGGER.error(e);
                } finally {
                    new PurchaseMenu(user);
                    break;
                }
            case EXECUTE_PAYMENT:
                //TODO Payment menu
                new PaymentMenu(user);
                break;
            case GO_BACK:
                new MainMenu(user);
            case EXIT:
                break;
        }
    }
}
