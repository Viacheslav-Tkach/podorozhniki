/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Viacheslav_Tkach
 */
public class PdrzhLoginNGTest {
    
    public PdrzhLoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of open_start_page method, of class PdrzhLogin.
     */
    @Test
    public void testOpen_start_page() {
        System.out.println("open_start_page");
        PdrzhLogin instance = new PdrzhLogin();
        instance.open_start_page();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class PdrzhLogin.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String usr = "";
        String passwd = "";
        PdrzhLogin instance = new PdrzhLogin();
        instance.login(usr, passwd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open_edit_profile method, of class PdrzhLogin.
     */
    @Test
    public void testOpen_edit_profile() {
        System.out.println("open_edit_profile");
        PdrzhLogin instance = new PdrzhLogin();
        instance.open_edit_profile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open_register_car_page method, of class PdrzhLogin.
     */
    @Test
    public void testOpen_register_car_page() {
        System.out.println("open_register_car_page");
        PdrzhLogin instance = new PdrzhLogin();
        instance.open_register_car_page();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of input_new_car_value method, of class PdrzhLogin.
     */
    @Test
    public void testInput_new_car_value() {
        System.out.println("input_new_car_value");
        String color = "";
        String vendor = "";
        String model = "";
        String year = "";
        String number = "";
        String seats = "";
        PdrzhLogin instance = new PdrzhLogin();
        instance.input_new_car_value(color, vendor, model, year, number, seats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register_car method, of class PdrzhLogin.
     */
    @Test
    public void testRegister_car() throws Exception {
        System.out.println("register_car");
        String color = "";
        String vendor = "";
        String model = "";
        String year = "";
        String number = "";
        String seats = "";
        PdrzhLogin instance = new PdrzhLogin();
        instance.register_car(color, vendor, model, year, number, seats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove_car method, of class PdrzhLogin.
     */
    @Test
    public void testRemove_car() {
        System.out.println("remove_car");
        PdrzhLogin instance = new PdrzhLogin();
        instance.remove_car();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class PdrzhLogin.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        PdrzhLogin instance = new PdrzhLogin();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class PdrzhLogin.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        PdrzhLogin instance = new PdrzhLogin();
        instance.cleanup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}