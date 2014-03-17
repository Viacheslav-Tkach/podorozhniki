package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class EditPage {
    public EditPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement carRegLink;

    public RegisterCarPage enterRegCarPage(){
        this.carRegLink.click();
        return new RegisterCarPage();
    }

}
