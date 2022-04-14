package com.solvd.laba.ui.countrieslMenu;

import com.solvd.laba.travel.Travel;
import com.solvd.laba.ui.User;
import com.solvd.laba.ui.destinationMenu.DestinationMenu;
import com.solvd.laba.ui.loginMenu.AbstractMenuEnum;
import com.solvd.laba.ui.mainMenu.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountriesMenu extends AbstractMenuEnum<CountriesMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(CountriesMenu.class);
    private final User user;

    public CountriesMenu(User user) {
        this.user = user;
        LOGGER.info("Printing Countries Menu");
        CountriesMenuEnum option = changeOption(CountriesMenuEnum.class);
        manageCases(option);
        MainMenu mainMenu = new MainMenu(user);
    }

    public void manageCases(CountriesMenuEnum result) {
        DestinationMenu destinationMenu = new DestinationMenu();
        CountriesMenuEnum destination = destinationMenu.initDestinationMenu(result);
        Travel travel = destinationMenu.initTravel(result, destination);
        user.setTravel(travel);
    }
}
