package com.epam.pdrzh.webdriver.tests;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleksandr_Rybkin on 24.03.14.
 */
public class RouteInfoProvider {
    @DataProvider(name="routeData", parallel=false)
    public static Iterator<Object[]> createData(){

        List<Object[]> data = new ArrayList<>();
//String from, String to, int isAnyTime, int isRegular, String seats
        data.add(new Object[]{"Kyiv", "Minsk", 1,1,"5"});
        return data.iterator();

    }

}
