package com.epam.pdrzh.webdriver.tests;

import com.epam.pdrzh.webdriver.core.BaseTest;
import org.testng.annotations.Test;
import ui.EditPage;
import ui.LoginPage;
import ui.MainPage;
import ui.RegisterCarPage;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class NewCarTest extends BaseTest{
    @Test(dataProvider = "carData", dataProviderClass = CarInfoProvider.class)
    public void newCarTest(String color, String vendor, String model, String year, String number, String seatsAmmount, int checkConditioner, int checkRadio, int checkMusic){
        LoginPage logPage = LoginPage.open();
        MainPage mainPage = logPage.login(System.getProperty("test.login"), System.getProperty("test.passw"));
        EditPage editPage = mainPage.enterEditPage();
        RegisterCarPage regCarPage =  editPage.enterRegCarPage();
        regCarPage.fieldsFillIn(color, vendor, model, year, number, seatsAmmount);

    }
}
