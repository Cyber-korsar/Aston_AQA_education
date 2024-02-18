package elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import page.BaseForm;
import utils.BrowserFactory;
import utils.DriverUtilits;

import java.time.Duration;

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

    public void waitPollingEvery100ms(int seconds){
        Wait<WebDriver> wait = new FluentWait<>(DriverUtilits.getDriver()).withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(DriverUtilits.getDriver().findElement(locator)));

    }
}