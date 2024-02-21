package org.example.utils;


import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    AndroidDriver driver;
    public void initialize() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");

        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url,capabilities);
            driver.manage().timeouts().implicitlyWait(10,
                    TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

//        try {
//            driver = new AndroidDriver<>(new
//                    URL("http://127.0.0.0:4723/wd/hub"), capabilities);
//            driver.manage().timeouts().implicitlyWait(10,
//                    TimeUnit.SECONDS);
//        } catch (MalformedURLException e) {
//            System.out.println(e.getMessage());
//        }
        driver.findElementById("com.google.android.calculator:id/digit_3").click();
    }

}