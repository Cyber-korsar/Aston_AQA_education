import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("File.csv", false)) {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}