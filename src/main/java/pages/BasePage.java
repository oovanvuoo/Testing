package pages;

import elements.PathRegistry;
import io.appium.java_client.AppiumDriver;
import utils.actions.Check;
import utils.actions.Click;

public class BasePage {
    protected final AppiumDriver driver;
    protected final Click click;
    protected final Check check;
    protected final PathRegistry pathRegistry;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.click = new Click(driver);
        this.check = new Check(driver) ;
        this.pathRegistry = new PathRegistry(driver);
    }
}
