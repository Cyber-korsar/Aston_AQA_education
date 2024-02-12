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
    private final String iFrame = "//iframe[@class='bepaid-iframe']";
    private final TextField getTextField = new TextField(By.xpath("//*[@class='pay__wrapper']/h2"), "TextField");
    private final Button acceptCookie = new Button(By.xpath("//button[@class='btn btn_black cookie__ok']"), "Click Accept Cookie");
    private final Label visa = new Label(By.xpath("//img[@alt='Visa']"), "Visa");
    private final Label verifiedVisa = new Label(By.xpath("//img[@alt='Verified By Visa']"), "Verified Visa");
    private final Label masterCard = new Label(By.xpath("(//div[@class='pay__partners'])//li[3]"), "Master Card");
    private final Label masterCardSecureCode = new Label(By.xpath("(//div[@class='pay__partners'])//li[4]"), "MasterCard Secure Code");
    private final Link link = new Link(By.xpath("//div[@class='pay__wrapper']//a"), "Подробнее о сервисе");
    private final Label belcard = new Label(By.xpath("(//div[@class='pay__partners'])//li[5]"), "Белкарт");
    private final Label mir = new Label(By.xpath("//div[@class='pay__partners']//img[@alt='МИР']"), "МИР");
    private final Label fieldNumber = new Label(By.xpath("//input[@id='connection-phone']"), "Field phone number");
    private final TextField fieldAmount = new TextField(By.xpath("//input[@id='connection-sum']"), "Field Amount");
    private final Button button = new Button(By.xpath("(//button[@class='button button__default '])[1]"), "Button next");
    private final String wrapperXPath = "//div[@class='app-wrapper__content']";
    private final String dropDownMenu = "(//p[@class='select__option'])[%s]";
    private final Button buttonDropDownMenu = new Button(By.xpath("//button[contains(@class,'select__header')]"), "Button drop down menu");
    private final Label iFrameSum = new Label(By.xpath("//p[@class='header__payment-amount']"), "Sum in iFrame");
    private final Label iFrameSumOnButton = new Label(By.xpath("//button[@class='colored disabled ng-star-inserted']"), "Sum in iFrame on button");
    private final Label iFrameNumber = new Label(By.xpath("//p[@class='header__payment-info']"), "Number in iFrame");
    private final Label iFrameCardNumber = new Label(By.xpath("//label[@class='ng-tns-c47-1 ng-star-inserted']"), "Card Number");
    private final Label iFrameCardValidity = new Label(By.xpath("//label[@class='ng-tns-c47-4 ng-star-inserted']"), "Validity");
    private final Label iFrameCardCVC = new Label(By.xpath("//label[@class='ng-tns-c47-5 ng-star-inserted']"), "Card CVC");
    private final Label iFrameCardName = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "Card Name");
    private final Label iFrameMasterCard = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameMasterCard");
    private final Label iFrameVisa = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameVisa");
    private final Label iFrameBelcard = new Label(By.xpath("//label[@class='ng-tns-c47-3 ng-star-inserted']"), "iFrameBelcard");
    // private String iFrameMIR = "//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']";
    private final Label iFrameMaestro = new Label(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']"), "iFrameMaestro");
    private final Label iFrameMIR = new Label(By.xpath("(//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg'])[1]"), "iFrameMIR");

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
        DriverUtilits.waitElements();
        return iFrameMIR.isDisplay();
    }

    public boolean iFrameMaestroIsDisplay() {
        DriverUtilits.waitElements();
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