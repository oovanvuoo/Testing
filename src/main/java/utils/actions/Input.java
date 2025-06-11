package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;

public class Input extends BaseAction {

    public Input(AppiumDriver driver) {
        super(driver);
    }
    
    public boolean enterString(String elementCode, String value){
        try {
            WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode))));
            ele.click();
            ele.clear();
            ele.sendKeys(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
