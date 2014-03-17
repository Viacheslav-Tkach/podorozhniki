package com.epam.webdriver.tests;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleksandr_Rybkin on 13.03.14.
 */
public class SearchResultProvider {

    @DataProvider(name = "searchData", parallel=false)
    public static Iterator<Object[]> createData() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"selenium webdriver", "http://docs.seleniumhq.org/"});
        data.add(new Object[]{"EPAM", "http://www.epam-group.ru/"});
        data.add(new Object[]{"asdf", "http://www.asdf.com/"});
        return data.iterator();
    }
}
