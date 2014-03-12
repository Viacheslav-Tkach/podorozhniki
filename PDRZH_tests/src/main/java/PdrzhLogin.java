
import java.sql.ResultSet;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class PdrzhLogin {

    // global xpath elements (UI map)

    /* Elements for login page*/
    private String login_field = "//*[@id=\"inputUsername\"]";
    private String password_field = "//*[@id=\"inputPassw\"]";
    private String login_btn = "//*[@class=\"btn btn-primary\" and @name=\"submit\"]";
    private String register_link = "//*[@id=\"clientLogin\"]//a[contains(text(), \"Register\")]";
    /* Elements for main page*/
    private String logout_btn = "//*[@class=\"btn btn-default\" and @href=\"/pdrzh/j_spring_security_logout\"]";
    private String username = "//*[@class=\"col-lg-3\"]/span";
    private String edit_btn = "//*[@class=\"btn btn-primary\" and @href=\"/pdrzh/client/edit_profile\"]";
    /*Elements for new_car page*/
    private String nc_color_field = "//*[@id=\"color\"]";
    private String nc_vendor_field = "//*[@id=\"vendor\"]";
    private String nc_model_field = "//*[@id=\"model\"]";
    private String nc_year_field = "//*[@id=\"year\"]";
    private String nc_number_field = "//*[@id=\"number\"]";
    private String nc_seats_field = "//*[@id=\"seats\"]";
    private String nc_conditioner_check = "//*[@id=\"conditioner1\"]";
    private String nc_radio_check = "//*[@id=\"radio1\"]";
    private String nc_music_player_check = "//*[@id=\"musicPlayer1\"]";
    private String nc_save_btn = "//*[@class=\"btn btn-primary\" and @name=\"idCar\"]";
    private String nc_cancel_btn = "//button[contains(text(),\"Cancel\")]";
    private String nc_back_link = "//a[contains(text(),\"Back\")]";
    /* Elements for edit_profile page */
    private String car_color = "//*[@class=\"table table-striped table-bordered table-hover\"]/tbody/tr[last()]/td[1]";
    private String car_model = "//*[@class=\"table table-striped table-bordered table-hover\"]/tbody/tr[last()]/td[2]";
    private String car_number = "//*[@class=\"table table-striped table-bordered table-hover\"]/tbody/tr[last()]/td[3]";
    private String car_seats = "//*[@class=\"table table-striped table-bordered table-hover\"]/tbody/tr[last()]/td[4]";
    private String car_remove_link = "//*[@class=\"table table-striped table-bordered table-hover\"]/tbody/tr[last()]/td[last()]/a[last()]";
    private String car_register_link = "//*[@class=\"well\"]/a[@href=\"/pdrzh/client/new_car\"]";
    WebDriver driver;

    @Test
    //open start page and login
    public void open_start_page() {
        driver = new FirefoxDriver();
        driver.get("http://evbyminsd7238.minsk.epam.com:8080/pdrzh/main");
        Assert.assertEquals(driver.getTitle(), "EPAM PDRZH", "Title is not as expected");
        System.out.println("[LOG] Start page open");
    }

    public void login(String usr, String passwd) {
        try {

            driver.findElement(By.xpath(login_field));
            driver.findElement(By.xpath(password_field));
            driver.findElement(By.xpath(login_btn));
        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on main page before log in not found");
            return;
        }

        driver.findElement(By.xpath(login_field)).sendKeys(usr);
        driver.findElement(By.xpath(password_field)).sendKeys(passwd);
        driver.findElement(By.xpath(login_btn)).click();

        try {
            driver.findElement(By.xpath(username));
        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on main page not found");
            return;
        }
        //Assert.assertEquals(driver.findElement(By.xpath(username)).getText(), usr, "wrong log in");
        if (!usr.equals(driver.findElement(By.xpath(username)).getText())) {
            System.out.println("[ERROR] Wrong log in");
            return;
        }
        System.out.println("[LOG] Sucessfull log in");
    }
    //open profile page

    public void open_edit_profile() {
        try {
            driver.findElement(By.xpath(edit_btn));
        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on main page not found");
            return;
        }
        driver.findElement(By.xpath(edit_btn)).click();

        if (!driver.getCurrentUrl().equals("http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/edit_profile")) {
            System.out.println("[ERROR] Incorrect page");
            return;
        }
        System.out.println("[LOG] Edit_profile page open");
    }

    public void open_register_car_page() {

        try {
            driver.findElement(By.xpath(car_register_link));
        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on edit page not found");
            return;
        }
        driver.findElement(By.xpath(car_register_link)).click();

        if (!driver.getCurrentUrl().equals("http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/new_car")) {
            System.out.println("[ERROR] Incorrect page");
            return;
        }
        System.out.println("[LOG] New_car page open");
    }

    // input values for new car
    public void input_new_car_value(String color, String vendor, String model, String year, String number, String seats) {
        try {
            driver.findElement(By.xpath(nc_color_field));
            driver.findElement(By.xpath(nc_vendor_field));
            driver.findElement(By.xpath(nc_model_field));
            driver.findElement(By.xpath(nc_year_field));
            driver.findElement(By.xpath(nc_number_field));
            driver.findElement(By.xpath(nc_seats_field));
            driver.findElement(By.xpath(nc_conditioner_check));
            driver.findElement(By.xpath(nc_radio_check));
            driver.findElement(By.xpath(nc_music_player_check));
            //driver.findElement(By.xpath(nc_save_btn));
            driver.findElement(By.xpath(nc_cancel_btn));
            driver.findElement(By.xpath(nc_back_link));
        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on new_car page not found");
            return;
        }
        driver.findElement(By.xpath(nc_color_field)).sendKeys(color);
        driver.findElement(By.xpath(nc_vendor_field)).sendKeys(vendor);
        driver.findElement(By.xpath(nc_model_field)).sendKeys(model);
        driver.findElement(By.xpath(nc_year_field)).sendKeys(year);
        driver.findElement(By.xpath(nc_number_field)).sendKeys(number);
        driver.findElement(By.xpath(nc_seats_field)).sendKeys(seats);
        driver.findElement(By.xpath(nc_conditioner_check)).click();
        driver.findElement(By.xpath(nc_radio_check)).click();
        driver.findElement(By.xpath(nc_music_player_check)).click();
        System.out.println("[LOG] New_car values inputed");
    }
    //click "Save" to registr a car

    public void register_car(String color, String vendor, String model, String year, String number, String seats) throws SQLException {
        try {

            driver.findElement(By.xpath(nc_save_btn));

        } catch (NoSuchElementException e) {
            System.err.println("[ERROR] Element on new_car page not found");
            return;
        }
        driver.findElement(By.xpath(nc_save_btn)).click();
        if (!driver.getCurrentUrl().equals("http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/edit_profile")) {
            System.out.println("[ERROR] Incorrect page");
            return;
        }
        System.out.println("[LOG] New car register");

        //check registration car
        String quer = "SELECT color, vendor, model, year, car_number, seats FROM car WHERE car_number='" + number + "'";
        DBSelector db = new DBSelector();
        ResultSet result = db.queryExec(quer);
        result.next();
        if (!result.getString(1).equals(color)
                && !result.getString(2).equals(vendor)
                && !result.getString(3).equals(model)
                && !result.getString(4).equals(year)
                && !result.getString(5).equals(number)
                && !result.getString(6).equals(seats)) {
            System.out.println("[ERROR] Incorrect value input into DB for new car");
            return;
        }
        System.out.println("[LOG] Correct car register in DB");
        try {
            driver.findElement(By.xpath(car_color));
            driver.findElement(By.xpath(car_model));
            driver.findElement(By.xpath(car_number));
            driver.findElement(By.xpath(car_seats));
            driver.findElement(By.xpath(car_remove_link));
        } catch (NoSuchElementException e) {
            System.out.println("[ERROR] element in car table not found");
            return;
        }
        if (!driver.findElement(By.xpath(car_color)).getText().equals(color)
                && !driver.findElement(By.xpath(car_model)).getText().equals(model)
                && !driver.findElement(By.xpath(car_number)).getText().equals(number)
                && !driver.findElement(By.xpath(car_seats)).getText().equals(seats)) {
            System.out.println("[ERROR] Incorrect value in car table");
        }
        System.out.println("[LOG] Correct car value in car table");
    }
        //remove car

    public void remove_car() {
        try {
            driver.findElement(By.xpath(car_remove_link));
        } catch (NoSuchElementException e) {
            System.out.println("[ERROR] element in car table not found");
            return;
        }
        
            driver.findElement(By.xpath(car_remove_link)).click();
        System.out.println("[LOG] New car sucessfully removed");

    }
    //log out

    public void logout() {
        try{
            driver.findElement(By.xpath(logout_btn));
        }catch (NoSuchElementException e){
            System.out.println("[ERROR] Element on main page not found");
                    
        }
        //Assert.assertTrue((driver.findElement(By.xpath(logout_btn)).isDisplayed()), "Not as expected");
        driver.findElement(By.xpath(logout_btn)).click();
        System.out.println("[LOG] Successfull log out");
    }

    @AfterClass
    public void cleanup() {
        driver.quit();
        System.out.println("[LOG] Web browser closed");
    }
}
