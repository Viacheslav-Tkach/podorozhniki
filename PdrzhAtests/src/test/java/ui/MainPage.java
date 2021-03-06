package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class MainPage {
   /* public MainPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }*/
    public MainPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//a[.='Edit']")
    WebElement editButton;

//NavigationBar
    @FindBy(linkText = "Find trip")
    WebElement findTripButton;
    @FindBy(linkText = "My trips")
    WebElement myTripsButton;
//NavigationBar

//FindRoute Form
    @FindBy(id = "geoStart")
    WebElement fromField;
    @FindBy(id = "geoFinish")
    WebElement toField;
    @FindBy(id="isanydate")
    WebElement checkIsAnyDate;
    @FindBy(id="isregular")
    WebElement checkIsRegular;
    @FindBy(id="startdatepicker")
    WebElement startDateField;
    @FindBy(id="starttimepicker")
    WebElement startTimeField;
    @FindBy(xpath = "//div[@id='startdatepickerform']/img[@title = 'Calendar']")
    WebElement startDatetimeCalendar;
    @FindBy(xpath = "//div[@id='startdatepickerform']/img[@tite = 'Time']")
    WebElement startDateTime;
    @FindBy(id="enddatepicker")
    WebElement endDateField;
    @FindBy(id="endtimepicker")
    WebElement endTimeField;
    @FindBy(xpath = "//div[@id='enddatepickerform']/img[@title = 'Calendar']")
    WebElement endDatetimeCalendar;
    @FindBy(xpath = "//div[@id='enddatepickerform']/img[@tite = 'Time']")
    WebElement endDateTime;
    @FindBy(id="seats")
    WebElement seatsField;
    @FindBy(className = "ui-icon ui-icon-triangle-1-n")
    WebElement seatsPlus;
    @FindBy(className = "ui-icon ui-icon-triangle-1-s")
    WebElement seatsMinus;
    @FindBy(xpath = "//input[@value='Find route']")
    WebElement findRouteButton;
    @FindBy(xpath = "//input[@value='Clear']")
    WebElement clearRouteButton;
//FindRoute Form

    public EditPage enterEditPage(){
    this.editButton.click();
    return new EditPage();
    }

    public MainPage findRoute(String from, String to, int isAnyDate, int isRegular, String seats) {
        this.fromField.sendKeys(from);
        this.toField.sendKeys(to);
        if (isAnyDate == 1)
            this.checkIsAnyDate.click();
        if (isRegular == 1)
            this.checkIsRegular.click();
        this.seatsField.sendKeys(seats);
        this.findRouteButton.click();
        return new MainPage();
    }

    public MyRoutesPage enterMyTrips(){
        this.myTripsButton.click();
        return new MyRoutesPage();
    }

}
