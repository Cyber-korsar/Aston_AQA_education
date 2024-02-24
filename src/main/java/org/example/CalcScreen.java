package org.example;

import org.example.utils.Driver;
import org.openqa.selenium.By;

public class CalcScreen {
    String basePath = "com.google.android.calculator:id/%s";
    String digitPath = "com.google.android.calculator:id/digit_%d";
    private final By MULTIPLY = By.id(String.format(basePath, "op_mul"));

    private final By DIVIDE = By.id(String.format(basePath, "op_div"));
    private final By MINUS = By.id(String.format(basePath, "op_sub"));
    private final By PLUS = By.id(String.format(basePath, "op_add"));
    private final By EQUALS = By.id(String.format(basePath, "eq"));
    private final By CLEAR = By.id(String.format(basePath, "clr"));
    private final By RESULT_FINAL = By.id(String.format(basePath, "result_final"));
    private final By DEC_POINT = By.id(String.format(basePath, "dec_point"));

    public void clickDigit(int number) {
        String n = Integer.toString(number);
        char[] charArray = n.toCharArray();
        //List<Integer> cia = new ArrayList<Integer>();
        for (int i = 0; i < charArray.length; i++) {
            int digit = Character.getNumericValue(charArray[i]);
            //   cia.add(digit);
            Driver.getDriver().findElementById(String.format(digitPath, digit)).click();
        }
    }

    public void clickMultiply() {
        Driver.getDriver().findElement(MULTIPLY).click();
    }

    public void clickDivide() {
        Driver.getDriver().findElement(DIVIDE).click();
    }

    public void clickMinus() {
        Driver.getDriver().findElement(MINUS).click();
    }

    public void clickPlus() {
        Driver.getDriver().findElement(PLUS).click();
    }

    public void clickEquals() {
        Driver.getDriver().findElement(EQUALS).click();
    }

    public Double getEquals() {
        Driver.getDriver().findElement(RESULT_FINAL).getText();
        return Double.parseDouble(Driver.getDriver().findElement(RESULT_FINAL).getText());
    }

    public String getEqualsText() {
        return Driver.getDriver().findElement(RESULT_FINAL).getText();
    }

    public void clickClear() {
        Driver.getDriver().findElement(CLEAR).click();
    }

    public void clickDecPoint() {
        Driver.getDriver().findElement(DEC_POINT).click();
    }
}