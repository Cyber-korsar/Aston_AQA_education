
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.BrowserFactory;


public class BaseTest {
    @BeforeClass
    public void beforeStart() {
        BrowserFactory.getInstance();
    }
    @AfterClass
    public void afterStart() {
        BrowserFactory.getInstance().quit();
    }
}
