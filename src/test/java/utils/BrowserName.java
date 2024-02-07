package utils;
public enum BrowserName {
    CHROME("CHROME"),
    FIREFOX("firefox");
    private String browserName;

    BrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }
    @Override
    public String toString() {
        return browserName;
    }
}