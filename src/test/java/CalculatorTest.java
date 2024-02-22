import org.example.BaseTest;
import org.example.CalcScreen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();
    CalcScreen calcScreen = new CalcScreen();

    @Test
    public void testBasicArithmeticOperations() {

        calcScreen.clickDigit(2);
        calcScreen.clickPlus();
        calcScreen.clickDigit(2);
        calcScreen.clickDecPoint();
        calcScreen.clickDigit(5);
        calcScreen.clickMinus();
        calcScreen.clickDigit(3);
        calcScreen.clickDecPoint();
        calcScreen.clickDigit(4);
        calcScreen.clickMultiply();
        calcScreen.clickDigit(6);
        calcScreen.clickDecPoint();
        calcScreen.clickDigit(8);
        calcScreen.clickDivide();
        calcScreen.clickDigit(2);
        calcScreen.clickEquals();
        softAssert.assertEquals(calcScreen.getEqualsText(), "-7.06", "Values do not match");
        System.out.println(calcScreen.getEqualsText());
        calcScreen.clickClear();
    }

    @Test
    public void multiDigitNumbersMultiply() {
        calcScreen.clickDigit(123456789);
        calcScreen.clickMultiply();
        calcScreen.clickDigit(987654321);
        calcScreen.clickEquals();
        softAssert.assertEquals(calcScreen.getEqualsText(), "1.219326311E17", "Values do not match");
    }

    @Test
    public void multiDigitNumbersSum() {
        calcScreen.clickDigit(123456789);
        calcScreen.clickPlus();
        calcScreen.clickDigit(987654321);
        calcScreen.clickEquals();
        softAssert.assertEquals(calcScreen.getEquals(), 111111110, "Values do not match");
    }
}
