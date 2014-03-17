package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class MainPage {
    public MainPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
    @FindBy(xpath = "//a[.='Edit']")
    WebElement editButton;
    public EditPage enterEditPage(){
    this.editButton.click();
    return new EditPage();
    }
}
