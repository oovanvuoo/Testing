package elements.devices;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class DeviceDesire {
    protected final Map<String, DesiredCapabilities> deviceCapabilities = new HashMap<>();

    public DesiredCapabilities profile(String deviceCode) {
        if (deviceCode == null || deviceCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Device code must not be null or empty.");
        }

        DesiredCapabilities caps = deviceCapabilities.get(deviceCode);
        if (caps == null) {
            throw new IllegalArgumentException("Device code not found: " + deviceCode);
        }

        return caps;
    }
}

