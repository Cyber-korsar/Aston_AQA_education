package page;

import elements.BaseElement;
import org.apache.log4j.Logger;

public class BaseForm {
    private final BaseElement element;
    private final String name;
    public final Logger log = Logger.getLogger(BaseForm.class.getName());

    public BaseForm(BaseElement element, String name) {
        this.element = element;
        this.name = name;
    }

    public boolean isDisplay() {
        log.info("Сheck page transition");
        return element.isDisplay();
    }
}