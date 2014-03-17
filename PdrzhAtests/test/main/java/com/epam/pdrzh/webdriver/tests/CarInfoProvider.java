package com.epam.pdrzh.webdriver.tests;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class CarInfoProvider {
    @DataProvider(name="carData", parallel=false)
    public static Iterator<Object[]> createData(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1","1","1","1","1","1",1,1,1});
        return data.iterator();
    }
}
