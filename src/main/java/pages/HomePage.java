package pages;

import elements.AppElements;
import elements.PathRegistry;
import io.appium.java_client.AppiumDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class HomePage {
    private final AppiumDriver driver;
    private final PathRegistry pathRegistry;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        this.pathRegistry = new PathRegistry(driver);
    }

    public void tabOnPhoneInput() {
        driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_PHONE))).click();
    }

    public void tabOnPasswordInput() {
        driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_PWD))).click();
    }

    public void tabLoginButton() {
        driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_BUTTON))).click();
    }

    public boolean isLoginPageDisplayed() {
        try {
            System.out.println("TTTT1");
            return driver.findElement(By.xpath(pathRegistry.getPath(AppElements.LOGIN_TAB_CUSTOMER))).isDisplayed();
        } catch (Exception e) {
            System.out.println("RRRR1");
            return false;
        }
        // throw new UnsupportedOperationException("Unimplemented method 'isHomePageDisplayed'");
    }

    public boolean checkCustomerTabDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofMillis(100));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(pathRegistry.getPath(AppElements.LOGIN_TAB_CUSTOMER))
            ));
            System.out.println("TTTT");

            return element.isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("RRRR");

            return false;
        }
    }

    public void openTabSaler(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofMillis(100));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(pathRegistry.getPath(AppElements.LOGIN_TAB_SALER))
            ));
            element.click();
        } catch (Exception e) {
            //Nothing
        }
    }
}
