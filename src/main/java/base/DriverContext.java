package base;

public class DriverContext {

    static BrowserContext browserContext;

    public static BrowserContext getBrowserContext() {
        return browserContext;
    }

    public static void setBrowserContext(BrowserContext browserContext) {
        DriverContext.browserContext = browserContext;
    }


}
