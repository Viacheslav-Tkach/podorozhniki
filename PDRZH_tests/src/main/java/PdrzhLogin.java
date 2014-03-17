import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandr_Rybkin on 05.03.14.
 */
public class PdrzhLogin {
    WebDriver driver;
    @Test
    public void login(){
        driver = new FirefoxDriver();
        driver.get("http://evbyminsd7238.minsk.epam.com:8080/pdrzh/main");
        Assert.assertEquals(driver.getTitle(), "EPAM PDRZH", "Title is not as expected");
        driver.findElement(By.id("inputUsername")).sendKeys("alex");
        Assert.assertEquals(isElementPresent(By.xpath("//a[.='ugjo']")), true, "Olololo");
        driver.findElement(By.id("inputPassw")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(isElementPresent(By.xpath("//a[.='ugjo']")), true, "Olololo");


    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(locator);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }
}

