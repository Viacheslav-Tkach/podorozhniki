package com.epam.webdriver.ui;

import com.epam.webdriver.core.Driver;
import com.epam.webdriver.ui.blocks.SearchResult;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

/**
 * Created by Oleksandr_Rybkin on 12.03.14.
 */
public class ResultsPage {

    public ResultsPage(){
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
    @FindBy(xpath = "//div[@class='b-body-items b-body-items_type_main']/ol/li")
    private List<SearchResult> searchResults;

    public boolean isLinkInResults(String link) {
        for (SearchResult result : searchResults) {
            if (result.getURL().equals(link)) {
                System.out.println(result.getURL());
                return true;
            }
        }
        return false;
    }

}
