import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500},
                {456, 781, 237},
                {186, 172, 941}
        };
        AppData appData = new AppData(header, data);
        Writer.writeData(appData);
        AppData newAppData = Reader.readData();
        System.out.println(Arrays.toString(newAppData.getHeader()) + "\n");
        for (int i = 0; i < newAppData.getData().length; i++) {
            System.out.println(Arrays.toString(newAppData.getData()[i]));
        }
    }
}