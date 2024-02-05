import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.MainPage;
import utils.DriverUtilits;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Main extends BaseTest {
    @Test
    public void startTest() {
        MainPage mainPage = new MainPage();
        DriverUtilits.goTo(DriverUtilits.host());
        assertTrue(mainPage.isDisplay(), "Main page is not open");
        mainPage.clickAcceptCookie();
        assertEquals("Онлайн пополнение\nбез комиссии", mainPage.getField());
        //Проверить наличие логотипов платёжных систем;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.visaIsDisplay(),"Logo Visa is not display");
        softAssert.assertTrue(mainPage.verifiedVisaIsDisplay(),"Logo Verified Visa is not display");
        softAssert.assertTrue(mainPage.masterCardIsDisplay(),"Logo Master Card is not display");
        softAssert.assertTrue(mainPage.masterCardSecureCodeIsDisplay(),"Logo Master Card Secure Code is not display");
        softAssert.assertTrue(mainPage.belcardIsDisplay(),"Logo belcard is not display");
        softAssert.assertTrue(mainPage.mirIsDisplay(),"Logo mir is not display");
        //Проверить работу ссылки «Подробнее о сервисе»;
        mainPage.goToLink();
        //проверить загрузку страницы
        MainPage.PaymentOrder paymentOrder = new MainPage.PaymentOrder();
        assertTrue(paymentOrder.isDisplay(), "Payment Order page is not open");
        DriverUtilits.goBack();
        assertTrue(mainPage.isDisplay(), "Main page is not open");
        //Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)
        mainPage.inputNumber("297777777");
        mainPage.inputSum("10");
        mainPage.clickButtonNext();
        softAssert.assertTrue(mainPage.headerPaymentIsDisplay());
    }
}