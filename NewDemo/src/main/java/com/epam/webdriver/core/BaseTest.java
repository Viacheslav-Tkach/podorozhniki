package com.epam.webdriver.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * Created by Oleksandr_Rybkin on 11.03.14.
 */
public class BaseTest {

    @BeforeMethod
    public void init(){
        Driver.init();
    }
    @AfterMethod
    public void cleanup(){
        Driver.teardown();
    }
}
