public class CheckArray {
    private static final int arrayLineSize = 4;
    private static final int arrayColumnsSize = 4;

    public static void checkSizeArrayAndSumArray(String[][] array) {
        try {
            int i = 0;
            if (array.length == arrayLineSize && array[i].length == arrayColumnsSize) {
                System.out.println("Массив верного размера");
            } else throw new MyArraySizeException();
            int sum = getSum(array);
            System.out.println("Сумма всех чисел массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Расчет не выполнен");
        }
    }

    private static int getSum(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int line = 0; line < arrayLineSize; line++) {
            for (int columns = 0; columns < arrayColumnsSize; columns++) {
                try {
                    sum += Integer.parseInt(array[line][columns]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В данном массиве: в строке: " + line + ", в колонке: " + columns + " лежит не число");
                }
            }
        }
        return sum;
    }
}