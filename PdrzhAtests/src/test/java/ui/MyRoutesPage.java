package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksandr_Rybkin on 24.03.2014.
 */
public class MyRoutesPage {
    public MyRoutesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='#passenger']")
    WebElement passengerTab;
    @FindBy(xpath = "//a[@href='#passenger']")
    WebElement driverTab;
    @FindBy(xpath = "//a[.='Add a trip']")
    WebElement addTripButton;

    public MyRoutesPage asDriverTab(){
        this.driverTab.click();
        return new MyRoutesPage();
    }

    public AddRoutePage goToAddTrip(){
        this.addTripButton.click();
        return new AddRoutePage();

    }

}
