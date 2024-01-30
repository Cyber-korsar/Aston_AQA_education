public class ConfigureReader {
    private static String URLFile = "src/test/resources/config.properties";

    public static String getProperty(String key) {
        return ConfigReader.getProperty(URLFile, key);
    }
}