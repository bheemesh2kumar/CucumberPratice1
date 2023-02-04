package base;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserContext {

    WebDriver driver = null;


    public BrowserContext(WebDriver driver) {

        this.driver = driver;
    }


    public void launchUrl(String url) {
        driver.navigate().to(url);
    }


    public void maxiMizeBrowser() {
        driver.manage().window().maximize();
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


    public String getPageTitle() {
        return driver.getTitle();
    }


    public void pageLoadTimeout(long secs) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secs));
    }


    public void quitDriver() {
        driver.quit();
    }


}
