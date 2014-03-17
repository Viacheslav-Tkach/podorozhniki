package com.epam.webdriver.tests;

import com.epam.webdriver.core.BaseTest;
import com.epam.webdriver.ui.ResultsPage;
import com.epam.webdriver.ui.YaPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by Oleksandr_Rybkin on 11.03.14.
 */
public class YaTest extends BaseTest {

    @Test(dataProvider = "searchData", dataProviderClass = SearchResultProvider.class)
    public void searchTest(String input, String expectedResult) {
        YaPage homePage = YaPage.open();
        ResultsPage resultPage = homePage.performSearch(input);
        Assert.assertTrue(resultPage.isLinkInResults(expectedResult), "Result is not in List");
        Reporter.log("done, 2, true");
    }

}
