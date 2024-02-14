package elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.BaseForm;
import utils.BrowserFactory;
import utils.DriverUtilits;

public class BaseElement {

    final By locator;
    final String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public final Logger log = Logger.getLogger(BaseForm.class.getName());

    public boolean isDisplay() {
        boolean bool = BrowserFactory.getInstance().findElement(locator).isDisplayed();
        log.info("Check element isDisplay " + name);
        return bool;
    }

    public void click() {
        BrowserFactory.getInstance().findElement(locator).click();
    }


    public String getTextFrom() {
        String text = BrowserFactory.getInstance().findElement(locator).getText();
        log.info("Get text element \n" + text);
        return text;
    }

    public void sendText(String text) {
        log.info("Input text '" + text + "'");
        BrowserFactory.getInstance().findElement(locator).sendKeys(text);
    }

    public void hoverAction() {
        Actions actions = new Actions(DriverUtilits.getDriver());
        actions.moveToElement((WebElement) locator);
    }
}