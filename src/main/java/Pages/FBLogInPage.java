package Pages;

import locators.FbLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FBLogInPage extends Basepage {


    public FBLogInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By BtncreateNewAccount = By.cssSelector(FbLocators.BtnCreateNewAccount);
    public By InputBoxFirstName = By.cssSelector(FbLocators.InputBoxFirstName);
    public By InputBoxLastName = By.cssSelector(FbLocators.InputBoxLastName);
    public By lablemainFbLoginPage = By.cssSelector(FbLocators.labelFbloginPage);
    public By dropDownDobselector = By.cssSelector(FbLocators.dropDownValuesDob);

    public void doSignUp() {
        doClick(BtncreateNewAccount);
        waitforElement(InputBoxFirstName);
        doSendText(InputBoxFirstName, "Bheemesh");
        doSendText(InputBoxLastName, "manukonda");
    }

    public Boolean isdisplayedFaceBookLableonLonginPage() {
        return isDisplayedElement(lablemainFbLoginPage);
    }


    public Boolean isDropDownValuesareSorting(By locator) {

        List<WebElement> actualist = dogetDropValues(locator);
        List<Integer> actualIntDropValues = new ArrayList<Integer>();
        actualist.forEach(i -> actualIntDropValues.add(Integer.parseInt(i.getText())));
        System.out.println("pritning actual values");
        actualIntDropValues.forEach(i -> System.out.print(i + " "));

        List<Integer> expdropdwnvalues = new ArrayList<Integer>();
        expdropdwnvalues.addAll(actualIntDropValues);
        Collections.sort(expdropdwnvalues);

        System.out.println("\n pritning Expected values values");
        expdropdwnvalues.forEach(i -> System.out.print(i + " "));

        return actualIntDropValues.equals(expdropdwnvalues);

    }


}
