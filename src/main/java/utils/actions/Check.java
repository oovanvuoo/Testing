package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.AppiumDriver;

public class Check extends BaseAction {
    public Check(AppiumDriver driver) {
        super(driver);
    }

    public boolean isClickable(String elementCode) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pathRegistry.getPath(elementCode))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDisplayed(String elementCode) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode)))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isEnabled(String elementCode) {
        try {
            return wait.until(ExpectedConditions.elementToBeSelected(By.xpath(pathRegistry.getPath(elementCode))));
            // return true;
        } catch (Exception e) {
            return false;
        }
    }
}
