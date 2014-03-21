package com.epam.pdrzh.webdriver.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
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
