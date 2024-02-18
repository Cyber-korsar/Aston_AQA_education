package page;

import elements.BaseElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverUtilits;

public class BaseForm {
    private final BaseElement element;
    private final String name;
    public final Logger log = Logger.getLogger(BaseForm.class.getName());
    WebDriver driver = DriverUtilits.getDriver();

    public BaseForm(BaseElement element, String name) {
        this.element = element;
        this.name = name;
    }

    public boolean isDisplay() {
        log.info("Check page transition " + name);
        return element.isDisplay();
    }
}