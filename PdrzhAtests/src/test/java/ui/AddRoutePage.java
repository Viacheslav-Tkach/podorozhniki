package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by Oleksandr_Rybkin on 25.03.2014.
 */
public class AddRoutePage {
    public AddRoutePage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
    @FindBy(id = "geoStart")
    WebElement fromField;
    @FindBy(id = "geoFinish")
    WebElement toField;
    @FindBy(linkText = "Build on map")
    WebElement buildOnMapButton;
    @FindBy(linkText = "Clear route")
    WebElement clearRouteButton;
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
    @FindBy(id = "carSelector")
    WebElement carSelector;
    @FindBy(className = "ui-icon ui-icon-triangle-1-n")
    WebElement seatsPlus;
    @FindBy(className = "ui-icon ui-icon-triangle-1-s")
    WebElement seatsMinus;
    @FindBy(linkText = "Create trip")
    WebElement createTripButton;
    @FindBy(linkText = "Back to my trips")
    WebElement backToTripsButton;

    @FindBy(id = "geoName")
    WebElement locationField;
    @FindBy(linkText = "Change")
    WebElement changeButton;
    @FindBy(id = "map")
    WebElement map;

//    public void

}
