package page;

import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.stream.Collectors;

public class BasketPage extends BaseForm {
    private List<String> names;
    private List<String> prices;

    public BasketPage() {
        super(new TextField(By.xpath("//div[@class='basket-form__basket-section basket-section']"), "Table on Basket Page"), "Basket Page");
    }

    private static final By NAME = By.xpath("//span[@class='good-info__good-name']");
    private static final By PRICE = By.xpath("//div[@class='list-item__price-new']");
    private static final By SUM = By.xpath("(//p[@class='b-top__total line'])/span[2]");

    public BasketPage checkBasket() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }//без паузы не работает, ожидание элемента не помогает, неверные цифры приходят, которых даже нет на странице
        names = driver.findElements(NAME)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        prices = driver.findElements(PRICE)
                .stream()
                .map(p -> p.getText()
                        .split("р.")[0].replaceAll(",", "."))
                .collect(Collectors.toList());
        log.info("Checking items in the cart");
        return this;
    }

    public int getCount() {
        return names.size();
    }

    public String getName(int number) {
        return names.get(number);
    }

    public double getPrice(int number) {
        return Double.parseDouble(prices.get(number));
    }

    public double getSum() {
        return Double.parseDouble(driver.findElement(SUM)
                .getText()
                .split("р.")[0]
                .replaceAll(",", "."));

    }

    public void checkItemsInBasket(int COUNT, BasketPage object1, MainPage object2) {
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < COUNT; i++) {
            softAssert.assertEquals(
                    object1.getName(COUNT - i - 1),
                    object2.getProductName(i),
                    "Various names"
            );
            softAssert.assertEquals(
                    object1.getPrice(COUNT - i - 1),
                    object2.getProductPrice(i),
                    "Various prices"
            );
        }
    }
}