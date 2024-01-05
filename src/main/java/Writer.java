import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void writeData(AppData appData) {
        try (FileWriter writer = new FileWriter("File.csv")){
        for (int i = 0; i < appData.getHeader().length; i++) {
            if (i <= appData.getHeader().length - 2) {
                writer.write(appData.getHeader()[i] + ";");
            } else
                writer.write(appData.getHeader()[i] + "\n");
        }
        for (int i = 0; i < appData.getData().length; i++) {
            for (int j = 0; j < appData.getData()[0].length; j++) {
                if (j <= appData.getData()[0].length - 2) {
                    writer.write(appData.getData()[i][j] + ";");
                } else {
                    writer.write(appData.getData()[i][j] + "\n");
                }
            }
        }
        writer.close();} catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}