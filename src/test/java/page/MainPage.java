package page;

import elements.Button;
import elements.Label;
import elements.Link;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverUtilits;

public class MainPage extends BaseForm {
    private String iFrame = "//iframe[@class='bepaid-iframe']";

    private TextField getTextField = new TextField(By.xpath("//*[@class='pay__wrapper']/h2"), "TextField");

    private Button acceptCookie = new Button(By.xpath("//*[@class='btn btn_black cookie__ok']"), "Click Accept Cookie");

    private Label visa = new Label(By.xpath("//img[@alt='Visa']"), "Visa");

    private Label verifiedVisa = new Label(By.xpath("//img[@alt='Verified By Visa']"), "Verified Visa");
    private Label masterCard = new Label(By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard']"), "Master Card");
    private Label masterCardSecureCode = new Label(By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard Secure Code']"), "MasterCard Secure Code");

    private Link link = new Link(By.xpath("//div[@class='pay__wrapper']//a"), "��������� � �������");
    private Label belcard = new Label(By.xpath("//div[@class='pay__partners']//img[@alt='Белкарт']"), "Белкарт");
    private Label mir = new Label(By.xpath("//div[@class='pay__partners']//img[@alt='МИР']"), "МИР");
    //    private Label belcard = new Label(By.xpath("//img[contains(@src,'design/assets/html/images/pages/index/pay/belkart.svg')]"), "�������");
//    private Label mir = new Label(By.xpath("//img[contains(@src,'design/assets/html/images/pages/index/pay/mir.svg')]"), "���");
    private Label fieldNumber = new Label(By.xpath("//input[@id='connection-phone']"), "Field phone number");
    private TextField fieldAmount = new TextField(By.xpath("//input[@id='connection-sum']"), "Field Amount");
    private Button button = new Button(By.xpath("//form[@class='pay-form opened']//button[@class='button button__default ']"), "Button next");

    private String wrapperXPath = "//div[@class='app-wrapper__content']";

    private String dropDownMenu = "(//p[@class='select__option'])[%s]";
    private Button buttonDropDownMenu = new Button(By.xpath("//button[contains(@class,'select__header')]"), "Button drop down menu");

    public MainPage() {
        super(new TextField(By.xpath("//*[@class='col-6']/h2"), "MainPage"), "Main Page");
    }

    public void clickButtonDropDownMenu() {
        buttonDropDownMenu.click();
    }

    private String dropDownXPathCreator(int number) {

        return String.format(dropDownMenu, number);
    }

    private Label communicationServices() {
        return new Label(By.xpath(dropDownXPathCreator(1)), "Услуги связи");
    }

    public String communicationServicesGetText() {
        return communicationServices().getTextFrom();
    }

    private Label homeInternet() {
        return new Label(By.xpath(dropDownXPathCreator(2)), "Домашний интернет");
    }

    public String homeInternetGetText() {
        return homeInternet().getTextFrom();
    }

    private Label installmentPlan() {
        return new Label(By.xpath(dropDownXPathCreator(3)), "Рассрочка");
    }

    public String installmentPlanGetText() {
        return installmentPlan().getTextFrom();
    }

    private Label debt() {
        return new Label(By.xpath(dropDownXPathCreator(4)), "Задолженность");
    }

    public String debtGetText() {
        return debt().getTextFrom();
    }

    public String getField() {
        return getTextField.getTextFrom();
    }

    public boolean visaIsDisplay() {
        return visa.isDisplay();
    }

    public boolean verifiedVisaIsDisplay() {
        return verifiedVisa.isDisplay();
    }

    public boolean masterCardIsDisplay() {
        return masterCard.isDisplay();
    }

    public boolean masterCardSecureCodeIsDisplay() {
        return masterCardSecureCode.isDisplay();
    }

    public boolean belcardIsDisplay() {
        return belcard.isDisplay();
    }

    public boolean mirIsDisplay() {
        return mir.isDisplay();
    }

    public void goToLink() {
        link.click();
    }

    public void inputNumber(String number) {
        fieldNumber.sendText(number);
    }

    public void inputSum(String sum) {
        fieldAmount.sendText(sum);
    }

    public void clickButtonNext() {
        button.click();
    }

    private WebElement waitIFrame(String iFrame) {
        WebElement iframe = DriverUtilits.waitElement(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath(iFrame)));
        DriverUtilits.getDriver().switchTo().frame(iframe);
        return DriverUtilits.waitElement(5).until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(wrapperXPath)));
    }

    public boolean headerPaymentIsDisplay() {
        return waitIFrame(iFrame).isDisplayed();
    }

    public void clickAcceptCookie() {
        acceptCookie.click();
    }

    public static class PaymentOrder extends BaseForm {
        public PaymentOrder() {
            super(new TextField(By.xpath("//span[@itemprop='item']"), "PaymentOrder"), "Payment Order");
        }
    }
}