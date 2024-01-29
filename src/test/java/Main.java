import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Main {
    @Test
    @DisplayName("Проверка расчёта факториала")
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "6,3", "24,4", "120,5", "720,6", "5040,7"})
    public void factorialTest(int expectedValue, int actualValue) {
        Factorial factorial = new Factorial();
        Assertions.assertEquals(expectedValue, factorial.getFactorial(actualValue));
    }
}