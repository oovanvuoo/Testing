package utils;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import config.Config;
import elements.AppElements;
import elements.devices.TestDevices;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;

public class DriverFactory {
    @SuppressWarnings("deprecation")
    public static AppiumDriver createDriver(String deviceCode) {
        System.out.println("APPIUM_SERVER_URL: " + Config.APPIUM_SERVER_URL);
        AppiumDriver driver = null;

        try {
            // DesiredCapabilities capabilities = new DesiredCapabilities();
            TestDevices devices = new TestDevices();
            DesiredCapabilities usingDevice = devices.profile(deviceCode);
            
            if(usingDevice.getPlatformName().toString().equalsIgnoreCase(AppElements.PLATFORM_ANDROID)){
                usingDevice.setCapability("app", System.getProperty("user.dir") + "/apps/disty.apk");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), usingDevice);

            }else {
                usingDevice.setCapability("app", System.getProperty("user.dir") + "/apps/app-ios.app");
                driver = new IOSDriver(new URL(Config.APPIUM_SERVER_URL), usingDevice);
            }

            System.out.println("Device created "+deviceCode);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.err.println("Invalid Appium server URL");
        }

        return driver;
    }
}
