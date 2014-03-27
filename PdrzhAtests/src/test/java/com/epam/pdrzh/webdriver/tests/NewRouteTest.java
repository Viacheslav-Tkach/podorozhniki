package com.epam.pdrzh.webdriver.tests;

import com.epam.pdrzh.webdriver.core.BaseTest;
import org.testng.annotations.Test;
import ui.AddRoutePage;
import ui.LoginPage;
import ui.MainPage;
import ui.MyRoutesPage;

/**
 * Created by Oleksandr_Rybkin on 24.03.14.
 */
public class NewRouteTest extends BaseTest {
    @Test(dataProvider = "carData", dataProviderClass = CarInfoProvider.class)
    public void newRoute(String from, String to){
        LoginPage logPage = LoginPage.open();
        MainPage mainPage = logPage.login(System.getProperty("test.login"),System.getProperty("test.passw"));
        MyRoutesPage myRoutesPage = mainPage.enterMyTrips();
        MyRoutesPage asDriverPage = myRoutesPage.asDriverTab();
        AddRoutePage addNewTrip = asDriverPage.goToAddTrip();


    }
}
