package Pages;

import locators.FbLocators;
import locators.GoogleSearchLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoogleSearchPage extends Basepage {


    public GoogleSearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By googleAutoSugValues = By.xpath(GoogleSearchLocators.AutoSuggoogleSearch);
    public By inputBoxGoogleSearch = By.cssSelector(GoogleSearchLocators.InputBoxgoogleSearch);


    public void getGoogleSearchAutoSegValues() {
        waitforElement(googleAutoSugValues);
        List<WebElement> autoSugValues = getLIstofItemsfindElements(googleAutoSugValues);
        autoSugValues.forEach(i -> System.out.println(i.getText()));
    }

    public Boolean IsAutoSugValuepPresentinDropDown(String ExpText) {

        Boolean flag = false;
        waitforElement(googleAutoSugValues);
        List<WebElement> autoSugValues = getLIstofItemsfindElements(googleAutoSugValues);

        Long textCountValue = autoSugValues.stream().filter(i -> i.getText().equals(ExpText)).count();

        if (textCountValue == 1) {
            flag = true;
        }

        return flag;
    }


    public void enterValueinGooglesarch(String inputVlaue) {

        doSendText(inputBoxGoogleSearch, inputVlaue);

    }


}
