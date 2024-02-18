package page;

import elements.Button;
import elements.Label;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MainPage extends BaseForm {
    public MainPage() {
        super(new TextField(By.xpath("//div[contains(@class,'main-page__banner banner')]"), "Banner on Main Page"), "Main Page");
    }

    private List<String> products;
    private List<String> prices;
    private final Label productTable = new Label(By.xpath("//div[@class='main-page__content']"), "Product table");
    private static final By ADD_TO_BASKET = By.xpath("(//a[@class='product-card__add-basket j-add-to-basket btn-main'])");
    private static final By PRICE = By.xpath("(//ins[@class='price__lower-price'])");
    private static final By NAME = By.xpath("//span[@class='product-card__name']");
    private final Button alwaysFirstSize = new Button(By.xpath("(//ul[@class='sizes-list j-quick-order-sizes'])//li[1]"), "Always first size");
    private final Button buttonBasket = new Button(By.xpath("//a[@data-wba-header-name='Cart']"), "Button cart");
    private static final By AUTHORIZATION = By.xpath("//span[contains(@class,'navbar-pc__icon navbar-pc__icon--profile')]");
    private static Button aut = new Button(By.xpath("//span[contains(@class,'navbar-pc__icon navbar-pc__icon--profile')]"), "Button authorization");
    private final Button changeCurrency = new Button(By.xpath("//button[contains(@data-wba-header-name,'Country')]"), "Change Currency");
    private final Button currencyBYN = new Button(By.xpath("//span[contains(.,'BYN')]"), "BYN Currency");

    public int getCountProduct() {
        return products.size();
    }

    public String getProductName(int index) {
        return products.get(index);
    }

    public double getSum() {
        return prices.stream().mapToDouble(Double::parseDouble).sum();
    }

    public Double getProductPrice(int index) {
        return Double.parseDouble(prices.get(index));
    }

    public void clickButtonChangeCurrency() {
        changeCurrency.waitPollingEvery100ms(5);
        changeCurrency.click();
    }

    public boolean changeCurrencyIsDisplay() {
        return changeCurrency.isDisplay();
    }

    public void clickButtonBYNCurrency() {
        currencyBYN.waitPollingEvery100ms(5);
        currencyBYN.click();
    }

    public boolean buttonBYNCurrencyIsDisplay() {
        return currencyBYN.isDisplay();
    }

    public void hoverAction() {
        Actions actions = new Actions(BrowserFactory.getInstance());
        actions.moveToElement(driver.findElement(AUTHORIZATION)).build().perform();
    }

    public boolean authorizationIsDistlay() {
        return driver.findElement(AUTHORIZATION).isDisplayed();
    }

    public void clickBasketButton() {
        buttonBasket.click();
    }

    public boolean buttonBasketIsDisplay() {
        return buttonBasket.isDisplay();
    }

    public MainPage addToBasketManyProducts(int count) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        products = driver.findElements(NAME).stream()
                .limit(count)
                .map(p -> p.getText()
                        .split("/")[0].trim())
                .collect(Collectors.toList());
        List<WebElement> price = driver.findElements(PRICE);
        prices = price.stream()
                .limit(count)
                .map(p -> p.getText()
                        .split("р.")[0].replaceAll(",", "."))
                .collect(Collectors.toList());
        driver.findElements(ADD_TO_BASKET)
                .stream()
                .limit(count)
                .forEach(this::clickAddToBasket);
        log.info("Products added to cart");
        return this;
    }

    private void clickAddToBasket(WebElement button) {
        button.click();
        try {
            alwaysFirstSize.click();
        } catch (NoSuchElementException ignored) {
        }
    }
}