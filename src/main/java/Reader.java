import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static AppData readData() {
        //чтение
        try (Scanner scanner = new Scanner(new File("File.csv"))){
        String header = scanner.nextLine();
        String[] header_result = header.split(";");
        ArrayList<String> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }
        int[][] data_result = new int[data.size()][header_result.length];
        for (int i = 0; i < data_result.length; i++) {
            String[] data_string = data.get(i).split(";");
            for (int j = 0; j < data_string.length; j++) {
                data_result[i][j] = Integer.parseInt(data_string[j]);
            }
        }
        scanner.close();
        return new AppData(header_result, data_result);} catch (IOException ex) {
            System.out.println(ex.getMessage());
        }return null;
    }
}