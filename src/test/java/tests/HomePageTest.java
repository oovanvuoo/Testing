package tests;

import io.appium.java_client.AppiumDriver;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import base.BaseTest;
import elements.AppElements;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageTest extends BaseTest {
    private AppiumDriver driver;
    private HomePage homePage;

    @Before
    public void setUp() {
        driver = DriverFactory.createDriver(AppElements.ANDROID_Pixel5);
        homePage = new HomePage(driver);
    }

    // @Test
    public void TestAccessLoginPage() {
        Assert.assertTrue(homePage.isLoginPageDisplayed(), "Accessibility menu should be visible");

        // try {
        //
        // } catch (Exception e) {
        //     fail("Page not found");
        // }
    }

    @Test
    public void CheckCustomerTabDisplayed() {
        homePage.checkCustomerTabDisplayed();
    }
    

    // @Test
    public void TestAccessControl() {
        homePage.tabOnPhoneInput();
        homePage.tabOnPasswordInput();
        homePage.tabLoginButton();
    }

    @Test
    public void TestOpenTabSale(){
        homePage.openTabSaler();
    }
}
