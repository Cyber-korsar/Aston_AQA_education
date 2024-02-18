import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
