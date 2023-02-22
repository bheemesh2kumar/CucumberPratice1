package base;

import org.openqa.selenium.WebDriver;

public class DriverContext {
    static WebDriver driver = null;

    static BrowserContext browserContext;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverContext.driver = driver;
    }


    public static BrowserContext getBrowserContext() {
        return browserContext;
    }

    public static void setBrowserContext(BrowserContext browserContext) {
        DriverContext.browserContext = browserContext;
    }


}
