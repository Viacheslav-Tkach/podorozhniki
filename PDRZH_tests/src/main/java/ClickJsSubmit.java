import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Oleksandr_Rybkin on 25.02.14.
 */
public class ClickJsSubmit {
    WebDriver driver;
    @Test
    public void clickJsSubmit(){
    driver = new FirefoxDriver();
    driver.get("http://twitter.com");
    Assert.assertEquals(driver.getTitle(), "Twitter", "Title is not as expected");
    driver.findElement(By.id("signin-email")).sendKeys("test");
    driver.findElement(By.id("signin-password")).sendKeys("testpass");
    driver.findElement(By.className("js-submit")).click();
    Assert.assertEquals(driver.findElement(By.xpath("//span[@class='message-text']")).getText(),
            "Wrong Username/Email and password combination.",
            "Error text is not as expected");
    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }

}
