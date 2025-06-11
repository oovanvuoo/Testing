package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.AppiumDriver;

public class Click extends BaseAction {

    public Click(AppiumDriver driver) {
        super(driver);
    }

    public void clickItem(String elementCode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode)))).click();
    }

    public boolean isClickable(String elementCode) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pathRegistry.getPath(elementCode))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
