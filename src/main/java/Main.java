import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("***First***");
        printThreeWords();
        System.out.println(" ");
        System.out.println("***Second***");
        checkSumSing();
        System.out.println(" ");
        System.out.println("***Second***");
        printColor();
        System.out.println(" ");
        System.out.println("***Third***");
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a;
        a = new Random().nextInt();
        int b;
        b = new Random().nextInt();
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        if (c > 0) System.out.println("Сумма положительная");
        if (c < 0) System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value;
        value = new Random().nextInt();
        if (value <= 1) System.out.println("Крассный");
        if (value > 0 && value < 101) System.out.println("Желтый");
        if (value > 100) System.out.println("Зелёный");
    }

    public static void compareNumbers() {
        int a;
        a = new Random().nextInt();
        int b;
        b = new Random().nextInt();
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}