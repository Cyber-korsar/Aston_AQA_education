import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestStart  {
    WebDriver driver = new ChromeDriver();
   // WebElement f = new WebElement().getWrappedElement().findElement(By.xpath())

//    private final WebElement field = new ChromeDriver().findElement(By.xpath("//h2[contains(.,'Онлайн пополнение без комиссии')]"));
//
//    public String getField() {
//        return field.getTagName();
//    }

    @Test
    public void mtsTestMainPage() throws InterruptedException {
        String field = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2";
        driver.manage().window().maximize();
        driver.get(ConfigureReader.getProperty("site"));Thread.sleep(900);
        driver.findElement(By.xpath(field));
        driver.findElement(By.xpath(field)).getTagName();
        System.out.println(driver.findElement(By.xpath(field)).getText());
        //MainPage mainPage = new MainPage();
        Assert.assertEquals(driver.findElement(By.xpath(field)).getText(),"Онлайн пополнение","Ожидаемый текст");

        // mainPage.getField();


    }
//    @BeforeTest
//    public void BeforeStart() {
//        driver.manage().window().maximize();
//        driver.get(ConfigureReader.getProperty("site"));
//    }
//
    @AfterMethod
    public void close() {
        driver.quit();
    }
}