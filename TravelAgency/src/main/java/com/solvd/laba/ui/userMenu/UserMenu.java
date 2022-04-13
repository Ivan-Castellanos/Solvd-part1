package com.solvd.laba.ui.userMenu;

import com.solvd.laba.ui.AbstractMenu;
import com.solvd.laba.ui.Menu;
import com.solvd.laba.ui.countrieslMenu.CountriesMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserMenu extends AbtractMenuEnum<UserMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(UserMenu.class);

    public UserMenu() {
        LOGGER.info("Printing User Menu");
        UserMenuEnum option = changeOption(UserMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(UserMenuEnum result) {
        switch (result) {
            case LOGIN:
                //TODO implement login
                new CountriesMenu();
                break;
//            case CREATE_USER:
////                new CreateUser();
//                break;
            case EXIT:
                break;
        }
    }
}

