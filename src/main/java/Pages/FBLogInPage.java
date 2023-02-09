package Pages;

import locators.FbLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FBLogInPage extends Basepage {


    public FBLogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = FbLocators.BtnCreateNewAccount)
    public WebElement BtncreateNewAccount;

    @FindBy(how = How.CSS, using = FbLocators.InputBoxFirstName)
    public WebElement InputBoxFirstName;

    @FindBy(how = How.CSS, using = FbLocators.InputBoxLastName)
    public WebElement InputBoxLastName;


    public void clickOnCreateNewAccount() {
        BtncreateNewAccount.click();
    }


    public void fillSignUpWindow(String Firstname, String lastName) {
        InputBoxFirstName.sendKeys(Firstname);
        //InputBoxLastName.sendKeys(lastName);


    }


}
