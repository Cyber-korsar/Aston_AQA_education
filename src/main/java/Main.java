public class Main {
    public static void main(String[] args) {
    }

    public static boolean summaTwoNumbers(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }

    public static boolean positiveOrNegativeLogic(int a) {
        return a < 0;
    }

    public static void positiveOrNegativePrint(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static void printRows(String text, int count) {
        int i = 1;
        while (i <= count) {
            System.out.println(text);
            i++;
        }
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 && ((year % 100 != 0) || year % 400 == 0);
    }

    public static void invertArray() {
        int[] positiveArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] negativeArray = new int[positiveArray.length];

        int i = 0;
        while (i < positiveArray.length) {
            if (positiveArray[i] == 1) negativeArray[i] = 0;
            else negativeArray[i] = 1;
            i++;
        }
    }

    public static void createArrayNLength(int arrayLength) {
        int[] array = new int[arrayLength];
        int i = 0;
        while (i < arrayLength) {
            array[i] = i + 1;
            i++;
        }
    }

    public static void ifLessThenMultiply() {
        int[] originalArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int scope = 6;
        int i = 0;
        while (i < originalArray.length) {
            if (originalArray[i] < scope) originalArray[i] = originalArray[i] * 2;
            i++;
        }
    }

    public static void ifLessThenMultiply2array() {
        int[] originalArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] modifiedArray = new int[originalArray.length];
        int scope = 6;
        int i = 0;
        while (i < originalArray.length) {
            if (originalArray[i] < scope) modifiedArray[i] = originalArray[i] * 2;
            else modifiedArray[i] = originalArray[i];
            i++;
        }
    }

    public static void twoDimensionalArray(int x) {
        int[][] array = new int[x][x];
        int i = 0;
        int j = x - 1;
        while (i < x) {
            array[i][i] = 1;
            array[i][j] = 1;
            i++;
            j--;
        }
    }

    public static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        int i = 0;
        while (i < len) {
            array[i] = initialValue;
            i++;
        }
        return array;
    }
}