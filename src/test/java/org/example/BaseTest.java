package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public AndroidDriver driver = new Driver().getDriver();
@BeforeTest
    public AndroidDriver init() {
        return new Driver().getDriver();
    }
//    public void setUp() {
//        EventFiringWebDriver driver = new
//                EventFiringWebDriver(new ChromeDriver());
//        driver.register(new CustomEventListener());
//    }

}