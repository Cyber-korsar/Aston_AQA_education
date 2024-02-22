package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.Driver;

public class BaseTest {
   public AndroidDriver driver = new Driver().getDriver();
//    @BeforeTest
    public AndroidDriver init(){
        return new Driver().getDriver();
    }

}
