package elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import page.BaseForm;
import utils.BrowserFactory;

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
        log.info("Check element isDisplay");
        return bool;
    }

    public void click() {
        BrowserFactory.getInstance().findElement(locator).click();
    }


    public String getTextFrom() {
        return BrowserFactory.getInstance().findElement(locator).getText();
    }

    public void sendText(String text) {
        BrowserFactory.getInstance().findElement(locator).sendKeys(text);
    }
}