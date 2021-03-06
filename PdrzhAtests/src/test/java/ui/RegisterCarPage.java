package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class RegisterCarPage {
    public RegisterCarPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }

    @FindBy(id = "color")
    WebElement fieldColor;
    @FindBy(id = "vendor")
    WebElement fieldVendor;
    @FindBy(id = "model")
    WebElement fieldModel;
    @FindBy(id = "year")
    WebElement fieldYear;
    @FindBy(id = "number")
    WebElement fieldNumber;
    @FindBy(id = "seats")
    WebElement fieldSeats;
    @FindBy(id = "conditioner1")
    WebElement checkConditioner;
    @FindBy(id = "radio1")
    WebElement checkRedio;
    @FindBy(id = "musicPlayer1")
    WebElement checkMusic;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSave;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement buttonCancel;

    public RegisterCarPage fieldsFillIn(String color, String vendor, String model,String year,String number,String seats){
    this.fieldColor.sendKeys(color);
    this.fieldVendor.sendKeys(vendor);
    this.fieldModel.sendKeys(model);
    this.fieldYear.sendKeys(year);
    this.fieldNumber.sendKeys(number);
    this.fieldSeats.sendKeys(seats);
    return new RegisterCarPage();
    }

    public RegisterCarPage checks(int chkCond, int chkRadio, int chkMusic){

        if (chkCond==1){
            this.checkConditioner.click();}
        if (chkRadio==1){
            this.checkRedio.click();}
        if (chkMusic==1){
            this.checkMusic.click();}
        return new RegisterCarPage();
    }
    public EditPage saveCar(){
        this.buttonSave.click();
        return new EditPage();

    }

}
