package com.epam.pdrzh.webdriver.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandr_Rybkin on 11.03.14.
 */
public class Driver {
    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver get(){
        return driver;
    }

    public boolean isElementPresent(By locator){
        get().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = get().findElements(locator);
        get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }
    public static void set(WebDriver driverInput){
        driver = driverInput;
    }

    public static void init() {
        Properties properties = new Properties();
        FileInputStream propFile;
        try {
            propFile = new FileInputStream("test.properties");
            properties.load(propFile);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        @SuppressWarnings("unchecked")
        Enumeration<String> e = (Enumeration<String>) properties.propertyNames();
        while (e.hasMoreElements()){
            String key = e.nextElement();
            System.setProperty(key, properties.getProperty(key));
            Reporter.log(key + " - " + properties.getProperty(key), 2, true);
        }
        WebDriver driverInput = new FirefoxDriver();
        driverInput.manage().timeouts().implicitlyWait(
                Integer.parseInt(System.getProperty("test.timeout")),
                TimeUnit.SECONDS
        );
        Driver.set(driverInput);
    }



    public static void teardown() {
        Driver.get().quit();
    }

}


