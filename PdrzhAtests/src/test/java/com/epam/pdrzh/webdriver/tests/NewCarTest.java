package com.epam.pdrzh.webdriver.tests;

import com.epam.pdrzh.webdriver.core.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ui.EditPage;
import ui.LoginPage;
import ui.MainPage;
import ui.RegisterCarPage;

import java.sql.SQLException;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class NewCarTest extends BaseTest{
    @Test(dataProvider = "carData", dataProviderClass = CarInfoProvider.class)
    public void newCarTest(String color, String vendor, String model, String year, String number, String seats, int chkCond, int chkRadio, int chkMusic) throws SQLException {
        LoginPage logPage = LoginPage.open();
        MainPage mainPage = logPage.login(System.getProperty("test.login"), System.getProperty("test.passw"));
        EditPage editPage = mainPage.enterEditPage();
        RegisterCarPage regCarPage =  editPage.enterRegCarPage();
        regCarPage.fieldsFillIn(color, vendor, model, year, number, seats);
        regCarPage.checks(chkCond, chkRadio, chkMusic);
        regCarPage.saveCar();
        Assert.assertTrue(editPage.carColorCheck(color), "Wrong color info displayed");
        Assert.assertTrue(editPage.carVendorCheck(vendor), "Wrong vendor info displayed");
        Assert.assertTrue(editPage.carNumberCheck(number), "Wrong number info displayed");
        Assert.assertTrue(editPage.carSeatsCheck(seats), "Wrong seats info displayed");
        Assert.assertTrue(editPage.carColorDbCheck(color, number), "Wrong colorDB info displayed");
        Assert.assertTrue(editPage.carVendorDbCheck(vendor, number), "Wrong vendorDB info displayed");
        Assert.assertTrue(editPage.carSeatsDbCheck(seats, number), "Wrong seatsDB info displayed");
        editPage.removeAddedCar();

        Reporter.log("Test Completed");
        Reporter.log("LOL", true);
        Reporter.log("NeLOL", false);
        Reporter.log("LOlLOLOL", 2, true);
        Reporter.log("falseLOlLOLOL", 3, false);
    }

}
