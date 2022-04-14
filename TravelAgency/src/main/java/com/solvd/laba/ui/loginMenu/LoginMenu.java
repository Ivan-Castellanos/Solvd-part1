package com.solvd.laba.ui.loginMenu;

import com.solvd.laba.exception.NullUser;
import com.solvd.laba.ui.User;
import com.solvd.laba.ui.mainMenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;

public class LoginMenu extends AbstractMenuEnum<LoginMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(LoginMenu.class);

    public LoginMenu() {
        LOGGER.info("Printing Login Menu");
        LoginMenuEnum option = changeOption(LoginMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(LoginMenuEnum result) {
        switch (result) {
            case LOGIN:
                //TODO implement login
                User user = new User("Ivan", "Castellanos", 22, "ivancastellanos@gmal.imn");
                new MainMenu(user);
                break;
                //TODO create user functionality/delete this option/add another
//            case CREATE_USER:
////                new CreateUser();
//                break;
            case EXIT:
                break;
        }
    }
}

