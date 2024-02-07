package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserFactory {
    private static BrowserFactory instDriver;
    private static WebDriver driver;

    private BrowserFactory() {
    }

    public static WebDriver getInstance() {
        if (instDriver == null)
            instDriver = new BrowserFactory();
        return instDriver.initBrows();
    }

    private WebDriver initBrows() {
        String language = Config.getProperty("lang");
        if (driver == null) {
            switch (BrowserName.valueOf(Config.getProperty("browser").toUpperCase())) {
                case CHROME:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--lang=" + language);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;
                case FIREFOX:
                    FirefoxOptions optionsFirerox = new FirefoxOptions();
                    FirefoxProfile profile = new FirefoxProfile();
                    profile.setPreference("intl.accert_languages", language);
                    optionsFirerox.setProfile(profile);
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(optionsFirerox);
                    break;
                default:
                    throw new IllegalArgumentException("Browser not found");
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
}