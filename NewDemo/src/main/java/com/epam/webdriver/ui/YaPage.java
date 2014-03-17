package com.epam.webdriver.ui;

import com.epam.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksandr_Rybkin on 12.03.14.
 */
public class YaPage {
    @FindBy(id="text")
    WebElement input;

    @FindBy(className = "b-form-button__input")
    WebElement button;
    public YaPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    public ResultsPage performSearch(String input) {
        this.input.sendKeys(input);
        this.button.click();
        return new ResultsPage();
    }

    public static YaPage open() {
        Driver.get().get(System.getProperty("test.baseURL"));
        return new YaPage();
    }

}
