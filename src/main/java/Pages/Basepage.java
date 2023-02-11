package Pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Basepage extends Page {


    public Basepage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void doClick(By locator) {
        driver.findElement(locator).click();
    }

    public void doSendText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }


    public List<WebElement> dogetDropValues(By locator) {
        return new Select(driver.findElement(locator)).getOptions();
    }


    public Boolean IsSelectRadioBUtton(By locator) {
        return driver.findElement(locator).isSelected();
    }


    public Boolean isDisplayedElement(By locator) {
        return driver.findElement(locator).isDisplayed();
    }


    public void waitforElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }


    public String getAttributeValue(By locator, String attName) {
        return driver.findElement(locator).getAttribute(attName);
    }


}
