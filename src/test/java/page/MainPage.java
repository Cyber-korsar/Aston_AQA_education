package page;

import elements.Button;
import elements.Label;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BrowserFactory;
import utils.DriverUtilits;

public class MainPage extends BaseForm {

    public MainPage() {
        super(new TextField(By.xpath("//div[contains(@class,'main-page__banner banner')]"), "Banner on Main Page"), "Main Page");
    }

    private final Label mainPageBanner = new Label(By.xpath("//div[contains(@class,'main-page__banner banner')]"), "Banner on Main Page");
    private String addToBasket_X = "(//a[@class='product-card__add-basket j-add-to-basket btn-main'])[%s]";
    private String nameProduct_X = "(//span[@class='product-card__name'])[%s]";
    private String priceProduct_X = "(//ins[@class='price__lower-price wallet-price'])[%s]";
    private final Button alwaysFirstSize = new Button(By.xpath("(//ul[@class='sizes-list j-quick-order-sizes'])//li[1]"), "Always first size");
    private final Button buttonBasket = new Button(By.xpath("//a[@data-wba-header-name='Cart']"), "Button cart");
    private String authorization = "//span[contains(@class,'navbar-pc__icon navbar-pc__icon--profile')]";
    private final Button changeCurrency = new Button(By.xpath("//button[contains(@class,'profile-menu__link profile-menu__link--currency j-wba-header-user-item j-currency-show-popup')]"), "Change Currency");
    private final Button currencyBYN = new Button(By.xpath("//span[contains(.,'BYN')]"), "BYN Currency");

    private static Label generateXPAthProductCard(String XPath, int count, String name) {
        return new Label(By.xpath(String.format(XPath, count)), name);
    }

    private static Button generateXPAthProductButton(String XPath, int count, String name) {
        return new Button(By.xpath(String.format(XPath, count)), name);
    }

    public void clickButtonAddToBasket_X(int number) {
        generateXPAthProductButton(addToBasket_X, number, "Add to basket").click();
    }

    public String getNameProduct(int number) {
        return generateXPAthProductCard(nameProduct_X, number, "Name product").getTextFrom();
    }

    public String getPriceProduct(int number) {
        return generateXPAthProductCard(priceProduct_X, number, "Price product").getTextFrom();
    }

    public void clickButtonChangeCurrency() {
        changeCurrency.click();
    }

    public void clickButtonBYNCurrency() {
        currencyBYN.click();
    }

    public void hoverAction() {
        Actions actions = new Actions(BrowserFactory.getInstance());
        actions.moveToElement(DriverUtilits.findXPathElement(authorization)).build().perform();
    }

    public void addToBasket_X_Product(int count){
                try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int i = 1;
        while (i <= count) {

            clickButtonAddToBasket_X(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (alwaysFirstSize.isDisplay()){alwaysFirstSize.click();}
                        i++;
        }
    }

}