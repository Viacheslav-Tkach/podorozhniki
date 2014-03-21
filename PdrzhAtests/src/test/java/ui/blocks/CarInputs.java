package ui.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by Oleksandr_Rybkin on 17.03.14.
 */
public class CarInputs extends HtmlElement {


    @FindBy(xpath = "//td")
    WebElement cell;
    public String getTXT(){
        return cell.getText();
    }
}