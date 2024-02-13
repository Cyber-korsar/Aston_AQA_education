package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverUtilits {
    private static final Logger log = Logger.getLogger(DriverUtilits.class.getName());
    private static final String http = Config.getProperty("http");
    private static final String site_url = Config.getProperty("site");

    public static String host() {
        return http + site_url;
    }

    public static void goTo(String url) {
        log.info("Go to page " + url);
        BrowserFactory.getInstance().get(url);
    }

    public static WebDriver getDriver() {
        return BrowserFactory.getInstance();
    }

    public static void goBack() {
        BrowserFactory.getInstance().navigate().back();
    }

    public static void waitElements() {
        getDriver().manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
    }
    public static WebElement findXPathElement(String xpath) {
        return BrowserFactory.getInstance().findElement(By.xpath(xpath));
    }
    public static WebDriverWait waitElement(int serconds) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(serconds));
    }
}