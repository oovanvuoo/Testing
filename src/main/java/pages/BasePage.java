package pages;

import elements.PathRegistry;
import io.appium.java_client.AppiumDriver;
import utils.actions.Check;
import utils.actions.Click;
import utils.actions.Get;
import utils.actions.Input;

public class BasePage {
    protected final AppiumDriver driver;
    protected final Click click;
    protected final Check check;
    protected final Get get;
    protected final Input input;
    protected final PathRegistry pathRegistry;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.click = new Click(driver);
        this.check = new Check(driver) ;
        this.get = new Get(driver);
        this.input = new Input(driver) ;
        this.pathRegistry = new PathRegistry(driver);
    }
}
