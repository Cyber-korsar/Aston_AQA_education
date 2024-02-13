import org.testng.annotations.Test;
import page.MainPage;
import utils.DriverUtilits;

import static org.testng.Assert.assertTrue;

public class MainTest extends BaseTest {

    @Test
    public void startTest() {
        MainPage mainPage = new MainPage();
        DriverUtilits.goTo(DriverUtilits.host());
        assertTrue(mainPage.isDisplay(), "Main page is not open");
        mainPage.hoverAction();
        mainPage.clickButtonChangeCurrency();
        mainPage.clickButtonBYNCurrency();
        mainPage.addToBasket_X_Product(6);
//        try {
//            Thread.sleep(12300004);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}