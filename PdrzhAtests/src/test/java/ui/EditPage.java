package ui;

import org.testng.Reporter;
import utils.DBSelector;
import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class EditPage {
    public EditPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
    @FindBy(xpath = "//div[@class='well']//tr[last()]/td[1]")
    WebElement colorInfo;
    @FindBy(xpath = "//div[@class='well']//tr[last()]/td[2]")
    WebElement vendorInfo;
    @FindBy(xpath = "//div[@class='well']//tr[last()]/td[3]")
    WebElement numberInfo;
    @FindBy(xpath = "//div[@class='well']//tr[last()]/td[4]")
    WebElement seatsInfo;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement carRegLink;
    @FindBy(xpath = "//tr[last()]//a[contains(text(),'Remove')]")
    WebElement deleteCarButton;


    public RegisterCarPage enterRegCarPage(){
        this.carRegLink.click();
        return new RegisterCarPage();
    }

    public boolean carColorCheck(String enteredColor){
        if (this.colorInfo.getText().equals(enteredColor)){
            return true;}
        else {
                return false;}
        }
    public boolean carVendorCheck(String enteredVendor){
        if (this.vendorInfo.getText().equals(enteredVendor)){
            return true;}
        else {
            return false;}
    }
    public boolean carNumberCheck(String enteredNumber){
        if (this.numberInfo.getText().equals(enteredNumber)){
            return true;}
        else {
            return false;}
    }
    public boolean carSeatsCheck(String enteredSeats){
        if (this.seatsInfo.getText().equals(enteredSeats)){
            return true;}
        else {
            return false;}
    }
    public boolean carColorDbCheck(String enteredColor, String carNumber) throws SQLException {
        DBSelector DBSelect = new DBSelector();
        String quer ="SELECT car.color FROM public.car WHERE car_number='" + carNumber + "'";
        ResultSet result = DBSelect.queryExec(quer);
        result.next();
        if (result.getString(1).equals(enteredColor)){
            return true;}
        else {
            return false;}

    }
    public boolean carVendorDbCheck(String enteredVendor, String carNumber) throws SQLException {
        DBSelector DBSelect = new DBSelector();
        String quer ="SELECT car.vendor FROM public.car WHERE car_number='" + carNumber + "'";
        ResultSet result = DBSelect.queryExec(quer);
        result.next();
        if (result.getString(1).equals(enteredVendor)){
            return true;}
        else {
            return false;}

    }
    public boolean carSeatsDbCheck(String enteredSeats, String carNumber) throws SQLException {
        DBSelector DBSelect = new DBSelector();
        String quer ="SELECT car.seats FROM public.car WHERE car_number='" + carNumber + "'";
        ResultSet result = DBSelect.queryExec(quer);
        result.next();
        if (result.getString(1).equals(enteredSeats)){
            return true;}
        else {
            return false;}
    }

    public EditPage removeAddedCar(){
        this.deleteCarButton.click();
        return new EditPage();
    }

    }


