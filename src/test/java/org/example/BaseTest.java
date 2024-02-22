package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.Driver;

public class BaseTest {
    public AndroidDriver driver = new Driver().getDriver();

    public AndroidDriver init() {
        return new Driver().getDriver();
    }
}