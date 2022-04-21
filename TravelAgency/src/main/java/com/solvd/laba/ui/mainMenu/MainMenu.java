package com.solvd.laba.ui.mainMenu;

import com.solvd.laba.data.User;
import com.solvd.laba.ui.AbstractMenuEnum;
import com.solvd.laba.ui.countriesMenu.CountriesMenu;
import com.solvd.laba.ui.purchaseMenu.PurchaseMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMenu extends AbstractMenuEnum<MainMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(MainMenu.class);
    private final User user;

    public MainMenu(User user) {
        this.user = user;
        LOGGER.info("Printing User Menu");
        MainMenuEnum option = changeOption(MainMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(MainMenuEnum result) {
        switch (result) {
            case CHECK_FLIGHTS:
                new CountriesMenu(user);
                break;
            case PURCHASE:
                new PurchaseMenu(user);
                break;
            case EXIT:
                break;
        }
    }
}
