package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;

public class Get extends BaseAction {
    public Get(AppiumDriver driver){
        super(driver);
    }

    public String strValue(String elementCode){
        return elementCode.trim().isBlank() ? "" : wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode)))).getText();
    }
}
