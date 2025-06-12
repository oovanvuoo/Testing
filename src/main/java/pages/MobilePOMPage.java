package pages;

import elements.AppElements;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MobilePOMPage extends BasePage {

    public MobilePOMPage(AppiumDriver driver) {
        super(driver);
    }

    public void tabOnPhoneInput() {
        click.clickItem(AppElements.LOGIN_PHONE);
        // driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_PHONE))).click();
    }

    public void inputUsername(String username){
        input.enterString(AppElements.LOGIN_PHONE, username);
    }

    public void inputPassword(String pwd){
        input.enterString(AppElements.LOGIN_PWD, pwd);
    }

    public void tabOnPasswordInput() {
        click.clickItem(AppElements.LOGIN_PWD);
        // driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_PWD))).click();
    }

    public void tabLoginButton() {
        click.clickItem(AppElements.LOGIN_BUTTON);
        // driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_BUTTON))).click();
    }

    public boolean isLoginPageDisplayed() {
        return check.isDisplayed(AppElements.LOGIN_PHONE) && 
               check.isDisplayed(AppElements.LOGIN_PWD) && 
               check.isDisplayed(AppElements.LOGIN_BUTTON);
    }

    public boolean checkCustomerTabDisplayed() {
        // try {
        //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofMillis(100));
        //     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
        //         By.xpath(pathRegistry.getPath(AppElements.LOGIN_TAB_CUSTOMER))
        //     ));

        //     return element.isDisplayed();
        // } catch (TimeoutException | NoSuchElementException e) {
        //     return false;
        // }
        return check.isDisplayed(AppElements.LOGIN_TAB_CUSTOMER);
    }

    public void checkAccessTabSaler(){
        click.isClickable(AppElements.LOGIN_TAB_SALER);
    }

    public void openTabSaler(){
        click.clickItem(AppElements.LOGIN_TAB_SALER);
    }

    public void closePopupError() {
        check.isDisplayed(AppElements.MSG_CONNECTION_ERR);
        click.clickItem(AppElements.ERR_BUTON_CONFIM);
    }
}
