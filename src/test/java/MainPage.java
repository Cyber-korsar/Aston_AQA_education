import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.CropImageFilter;

public class MainPage{
//    @FindBy(id = "wpLoginAttempt")
//    WebElement loginButton;
    private final WebElement button = new ChromeDriver().findElement(By.xpath("(//button[@type='submit'])[3]"));
private final WebElement field= new ChromeDriver().findElement(By.xpath("//h2[contains(.,'Онлайн пополнение без комиссии')]"));

    public String getField() {
    return     field.getTagName();
    }
//    private final IButton trimButton = getElementFactory().getButton(By.xpath("//a[@data-linkname='mmyt-trim-compare']"), "Trim");
//    private final ILabel style = getElementFactory().getLabel(By.xpath("//th[contains(.,'Style')]/following::td[1]"), "Style");
//    private final ILabel transmission = getElementFactory().getLabel(By.xpath("//th[contains(.,'Transmission')]/following::td[1]"), "Transmission");
//    private final ILabel engine = getElementFactory().getLabel(By.xpath("//th[contains(.,'Engine')]/following::td[1]"), "Engine");
//    private final IButton trimLabelButton = getElementFactory().getButton(By.xpath("//button[contains(@aria-controls,'research-compare-trim-0-panel1')]"), "Trim");

}
