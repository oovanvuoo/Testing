package base;

import io.appium.java_client.AppiumDriver;
import utils.DriverFactory;

import org.testng.annotations.*;
import elements.AppElements;

import java.net.MalformedURLException;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        driver = DriverFactory.createDriver(AppElements.ANDROID_Pixel5);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
