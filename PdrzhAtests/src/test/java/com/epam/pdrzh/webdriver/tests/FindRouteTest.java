package com.epam.pdrzh.webdriver.tests;

import com.epam.pdrzh.webdriver.core.BaseTest;
import com.epam.pdrzh.webdriver.core.Driver;
import com.epam.pdrzh.webdriver.core.ScrShotTaker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ui.LoginPage;
import ui.MainPage;

/**
 * Created by Oleksandr_Rybkin on 24.03.2014.
 */
public class FindRouteTest extends BaseTest {
    @Test(dataProvider = "routeData", dataProviderClass = RouteInfoProvider.class)
    public void findRouteTest(String from, String to, int isAnyTime, int isRegular, String seats){
        LoginPage logpage = LoginPage.open();
        MainPage mainPage = logpage.login(System.getProperty("test.login"), System.getProperty("test.passw"));
        mainPage.findRoute(from, to, isAnyTime, isRegular, seats);
        Driver.get().findElement(By.className("ymaps-glass-pane"));
        ScrShotTaker scr = new ScrShotTaker();
        scr.createScreenCaptureJPEG("asd.jpeg");
    }
}
