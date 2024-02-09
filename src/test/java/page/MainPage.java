package page;

import elements.Button;
import elements.Label;
import elements.Link;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverUtilits;
import utils.StringUtils;

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

    private Label iFrameSum = new Label(By.xpath("//p[@class='header__payment-amount']"), "Sum in iFrame");
    private Label iFrameSumOnButton = new Label(By.xpath("//button[@class='colored disabled ng-star-inserted']"), "Sum in iFrame on button");
    private Label iFrameNumber = new Label(By.xpath("//p[@class='header__payment-info']"), "Number in iFrame");
    private Label iFrameCardNumber = new Label(By.xpath("//label[@class='ng-tns-c47-1 ng-star-inserted']"), "Card Number");
    private Label iFrameCardValidity = new Label(By.xpath("//label[@class='ng-tns-c47-4 ng-star-inserted']"), "Validity");
    private Label iFrameCardCVC = new Label(By.xpath("//label[@class='ng-tns-c47-5 ng-star-inserted']"), "Card CVC");
    private Label iFrameCardName = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "Card Name");
    private Label iFrameMasterCard = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameMasterCard");
    private Label iFrameVisa = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameVisa");
    private Label iFrameBelcard = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameBelcard");
    private String iFrameMIR = "//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']";
    private Label iFrameMaestro = new Label(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']"), "iFrameMIR");


    public MainPage() {
        super(new TextField(By.xpath("//*[@class='col-6']/h2"), "MainPage"), "Main Page");
    }

    public String getTextIFrameCardCVC() {
        return iFrameCardCVC.getTextFrom();
    }

    public String getTextIFrameCardName() {
        return iFrameCardName.getTextFrom();
    }

    public String getTextIFrameCardNumber() {
        return iFrameCardNumber.getTextFrom();
    }

    public String getTextIFrameCardValidity() {
        return iFrameCardValidity.getTextFrom();
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

    public String getIFrameSum() {
        return StringUtils.deleteChars(iFrameSum.getTextFrom());
    }

    public String getIFrameSumOnButton() {
        return StringUtils.deleteFirstChars(StringUtils.deleteChars(iFrameSumOnButton.getTextFrom()));
    }

    public String getIFrameNumber() {
        return StringUtils.getNumber(iFrameNumber.getTextFrom());
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

    public boolean iFrameVisaIsDisplay() {
        return iFrameVisa.isDisplay();
    }

    public boolean iFrameMasterCardIsDisplay() {
        return iFrameMasterCard.isDisplay();
    }

    public boolean iFrameBelcardIsDisplay() {
        return iFrameBelcard.isDisplay();
    }

    public boolean iFrameMIRIsDisplay() {
        WebElement iframe = DriverUtilits.waitElement(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath(iFrame)));
        DriverUtilits.getDriver().switchTo().frame(iframe);
        return DriverUtilits.waitElement(5).until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(iFrameMIR))).isDisplayed();
    }

    public boolean iFrameMaestroIsDisplay() {
        DriverUtilits.waitElements();
//        DriverUtilits.waitElement(5).until(ExpectedConditions.visibilityOfElementLocated(iFrameMaestro));
        return iFrameMaestro.isDisplay();
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