package elements;

import elements.xpath.AndroidXPath;
import elements.xpath.BaseXPath;
import elements.xpath.IOSXPath;
import io.appium.java_client.AppiumDriver;

public class PathRegistry {
    private final BaseXPath provider;

    public PathRegistry(AppiumDriver driver) {
      String p = driver.getCapabilities().getCapability("platformName").toString();
        if (AppElements.PLATFORM_ANDROID.equalsIgnoreCase(p)) {
          provider = new AndroidXPath();
        } else {
          provider = new IOSXPath();
        }
    }

  public String getPath(String code) {
    return provider.getPath(code);
  }
}
