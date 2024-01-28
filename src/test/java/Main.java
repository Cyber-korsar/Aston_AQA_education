import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial.getFactorial(20));
    }
    @Test
    public static void run (){
        System.out.println(Factorial.getFactorial(20));
        Factorial.getFactorial(20);

    }
    @DisplayName("Слово является палиндромом")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
            public void isPalindromeTest(int value){
        Assertions.assertEquals(Factorial.getFactorial(value),value);
    }
}