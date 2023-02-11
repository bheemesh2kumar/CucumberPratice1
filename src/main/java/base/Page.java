package base;

import Pages.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {


    public WebDriver driver = null;
    public WebDriverWait wait = null;

    public Page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public <Tpage extends Basepage> Tpage getInstance(Class<Tpage> page) {
        try {
            return page.getDeclaredConstructor(WebDriver.class, WebDriverWait.class)
                    .newInstance(this.driver, this.wait);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


}
