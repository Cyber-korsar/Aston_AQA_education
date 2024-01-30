
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties PROPERTIES;

    public static void configReader(String URLFile) {
        try (FileInputStream fileInputStream = new FileInputStream(URLFile)) {
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String URLFile, String key) {
        configReader(URLFile);
        return PROPERTIES.getProperty(key);
    }
}