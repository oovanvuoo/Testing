package utils;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import elements.AppElements;
import elements.devices.TestDevices;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;

public class DriverFactory {
    // private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    @SuppressWarnings("deprecation")
    public static AppiumDriver createDriver(String deviceCode) {
        AppiumDriver driver = null;

        try {
            // DesiredCapabilities capabilities = new DesiredCapabilities();
            TestDevices devices = new TestDevices();
            DesiredCapabilities usingDevice = devices.profile(deviceCode);
            
            // capabilities.setCapability("automationName", "UiAutomator2");
            if(usingDevice.getPlatformName().toString().equalsIgnoreCase(AppElements.PLATFORM_ANDROID)){
                usingDevice.setCapability("app", System.getProperty("user.dir") + "/apps/disty.apk");
                // usingDevice.setCapability("app",  "/Users/vanvu/Downloads/disty.apk");
                driver = new AndroidDriver(new URL(APPIUM_SERVER_URL), usingDevice);

            }else {
                usingDevice.setCapability("app", System.getProperty("user.dir") + "/apps/app-ios.app");
                driver = new IOSDriver(new URL(APPIUM_SERVER_URL), usingDevice);
            }

            System.out.println("Device created "+deviceCode);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.err.println("Invalid Appium server URL");
        }

        return driver;
    }
}
