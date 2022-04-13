package com.solvd.laba.ui.countrieslMenu;

import com.solvd.laba.ui.AbstractMenu;
import com.solvd.laba.ui.countrieslMenu.CountriesMenu;
import com.solvd.laba.ui.countrieslMenu.CountriesMenuEnum;
import com.solvd.laba.ui.destinationMenu.DestinationMenu;
import com.solvd.laba.ui.userMenu.AbtractMenuEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountriesMenu extends AbtractMenuEnum<CountriesMenuEnum> {
    private final static Logger LOGGER = LogManager.getLogger(CountriesMenu.class);

    public CountriesMenu() {
        LOGGER.info("Printing User Menu");
        CountriesMenuEnum option = changeOption(CountriesMenuEnum.class);
        manageCases(option);
    }

    public void manageCases(CountriesMenuEnum result) {
        new DestinationMenu(result);
    }
}
