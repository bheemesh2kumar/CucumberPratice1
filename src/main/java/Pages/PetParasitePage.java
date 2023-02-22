package Pages;

import locators.FbLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetParasitePage extends Basepage {


    public PetParasitePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By BtncreateNewAccount = By.cssSelector(FbLocators.BtnCreateNewAccount);
    public By InputBoxFirstName = By.cssSelector(FbLocators.InputBoxFirstName);
    public By InputBoxLastName = By.cssSelector(FbLocators.InputBoxLastName);
    public By lablemainFbLoginPage = By.cssSelector(FbLocators.labelFbloginPage);
    public By dropDownDobselector = By.cssSelector(FbLocators.dropDownValuesDob);


}
