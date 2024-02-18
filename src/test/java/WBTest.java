import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.BasketPage;
import page.MainPage;
import utils.DriverUtilits;

import static org.testng.Assert.assertTrue;


public class WBTest extends BaseTest {
    private final int COUNT = 4;

    @Test
    public void startTest() {
        MainPage mainPage = new MainPage();
        SoftAssert softAssert = new SoftAssert();
        DriverUtilits.goTo(DriverUtilits.host());
        assertTrue(mainPage.isDisplay(), "Main page is not open / banner is not displayed");
        assertTrue(mainPage.authorizationIsDistlay(), "Login button is not displayed");
        mainPage.hoverAction();//прицеливание на кнопку авторизации, для появления следующей кнопки
        assertTrue(mainPage.changeCurrencyIsDisplay(), "The currency selection button is not displayed");
        mainPage.clickButtonChangeCurrency();
        assertTrue(mainPage.buttonBYNCurrencyIsDisplay(), "Currency button not showing");
        mainPage.clickButtonBYNCurrency();
        assertTrue(mainPage.isDisplay(), "Main page is not open");
        mainPage.addToBasketManyProducts(COUNT);
        assertTrue(mainPage.buttonBasketIsDisplay(),"Basket button not showing");
        mainPage.clickBasketButton();
        BasketPage basketPage = new BasketPage();
        assertTrue(basketPage.isDisplay(), "Basket page is not open");
        Assert.assertNotNull(basketPage.checkBasket(), "Basket is empty");
        basketPage.checkItemsInBasket(COUNT, basketPage, mainPage);
        Assert.assertEquals(basketPage.getCount(), mainPage.getCountProduct(), "Not all items are in the cart");
        softAssert.assertEquals(basketPage.getSum(), mainPage.getSum(), "Sum do not match");
    }
}