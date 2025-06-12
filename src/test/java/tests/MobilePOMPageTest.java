package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
// import elements.AppElements;
import elements.test_data.Account;
import pages.MobilePOMPage;
// import utils.DriverFactory;

public class MobilePOMPageTest extends BaseTest {
    // private AppiumDriver driver;
    
    private MobilePOMPage pomPage;

    @BeforeClass
    public void setUp() {
        // driver = DriverFactory.createDriver(AppElements.ANDROID_Pixel5);
        pomPage = new MobilePOMPage(driver);
    }

    @Test
    public void TestAccessLoginPage() {
        Assert.assertTrue(pomPage.isLoginPageDisplayed(), "Accessibility menu should be visible");
    }

    @Test
    public void CheckCustomerTabDisplayed() {
        Assert.assertTrue(pomPage.checkCustomerTabDisplayed(), "Customer tab should be displayed");
    }
    

    @Test
    public void TestAccessControl() {
        // pomPage.tabOnPhoneInput();
        // pomPage.tabOnPasswordInput();
        pomPage.inputUsername(Account.Acc1.username);

        // Because this application is nolonger available. And It have a logic to get some relevant after username (10 or 11 chars). So, we need to close the error popup
        pomPage.closePopupError();

        pomPage.inputPassword(Account.Acc1.password);
        pomPage.tabLoginButton();
    }

    @Test
    public void TestOpenTabSale(){
        pomPage.openTabSaler();
    }
}
