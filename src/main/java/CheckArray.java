public class CheckArray {
    private static int arrayLineSize = 4;
    private static int arrayRowsSize = 4;

    public static void transformToInt(String[][] array) {
        try {
            if (array.length == arrayLineSize) {
                for (int i = 0; i < arrayRowsSize; i++) {
                    if (array[i].length != arrayRowsSize) throw new MyArraySizeException();
                }
            } else throw new MyArraySizeException();
            int sum = 0;
            for (int line = 0; line < 4; line++) {
                for (int index = 0; index < 4; index++) {
                    try {
                        sum += Integer.parseInt(array[line][index]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("В данном массиве: в строке: " + line + ", в ячейка с индексом: " + index + " лежит не число");
                    }
                }
            }
            System.out.println("Сумма всех чисел массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Расчет не выполнен");
        }
    }
}
