package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

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
}