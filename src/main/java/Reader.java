import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static AppData readData() {
        try (Scanner scanner = new Scanner(new File("File.csv"))) {
            String header = scanner.nextLine();
            String[] headerResult = header.split(";");
            ArrayList<String> data = new ArrayList<>();
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
            int[][] dataInput = new int[data.size()][headerResult.length];
            for (int i = 0; i < dataInput.length; i++) {
                String[] dataString = data.get(i).split(";");
                for (int j = 0; j < dataString.length; j++) {
                    dataInput[i][j] = Integer.parseInt(dataString[j]);
                }
            }
            scanner.close();
            return new AppData(headerResult, dataInput);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}