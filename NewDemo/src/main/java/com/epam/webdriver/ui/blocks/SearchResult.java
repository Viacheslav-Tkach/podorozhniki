package com.epam.webdriver.ui.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by Oleksandr_Rybkin on 12.03.14.
 */
public class SearchResult extends HtmlElement {

    @FindBy(className = "b-serp-item__title-link")
    Link mainLink;
    public String getURL(){
        return mainLink.getReference();
    }
}
