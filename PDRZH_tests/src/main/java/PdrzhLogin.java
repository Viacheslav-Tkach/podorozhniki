import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

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
        driver.findElement(By.id("inputPassw")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue((driver.findElement((By.xpath("//a[.='Logout']"))).isDisplayed()),"Not as expected");
        
    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }

}

