package elements.devices;

import org.openqa.selenium.remote.DesiredCapabilities;
import elements.AppElements;

public class TestDevices extends DeviceDesire {
    public TestDevices(){
        // Android
        deviceCapabilities.put(AppElements.ANDROID_REALME9, setProfile(AppElements.PLATFORM_ANDROID, AppElements.ANDROID_REALME9, "14.0", "UiAutomator2"));
        deviceCapabilities.put(AppElements.ANDROID_Pixel5, setProfile(AppElements.PLATFORM_ANDROID, AppElements.ANDROID_Pixel5, "11.0", "UiAutomator2"));
        
        // iOS
        deviceCapabilities.put(AppElements.IOS_QQ, setProfile(AppElements.PLATFORM_IOS, AppElements.IOS_QQ, "16.0", "XCUITest"));

        //Add other test device here
    }

    public DesiredCapabilities setProfile(String platformName, String deviceName, String platformVersion, String automationName) {
        DesiredCapabilities profile = new DesiredCapabilities();
        profile.setCapability("platformName", platformName);
        profile.setCapability("deviceName", deviceName);
        profile.setCapability("platformVersion", platformVersion);
        profile.setCapability("automationName", automationName);
        return profile;
    }
}
