package ui;

import com.epam.pdrzh.webdriver.core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksandr_Rybkin on 14.03.14.
 */
public class LoginPage {
    @FindBy(id = "inputUsername")
    WebElement inputLogin;
    @FindBy(id = "inputPassw")
    WebElement inputPassword;
    @FindBy(xpath = "//div[@class='form-group']//*[@name='submit']")
    WebElement button;

   public LoginPage(){
       PageFactory.initElements(Driver.get(), this);
   }
   public MainPage login(String login, String passw){
       this.inputLogin.sendKeys(login);
       this.inputPassword.sendKeys(passw);
       this.button.click();
       return new MainPage();
   }

   public static LoginPage open(){
        Driver.get().get(System.getProperty("test.baseURL"));
        return new LoginPage();
    }
}
