package com.test.steps;

import Pages.FBLogInPage;
import base.DriverContext;
import base.FrameWorkInit;
import com.utilities.AppUtilities;
import com.utilities.Emp;
import com.utilities.PropertyReaderUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ApplicationSteps {
    Emp emp = new Emp(1, "tom");
    FrameWorkInit frameWorkInit = new FrameWorkInit();
    FBLogInPage fbLogInPage = null;


    @Before
    public void browserSetUP() {
        frameWorkInit.browserInit(PropertyReaderUtil.getConfigValuesFromMap("browser.name"));
        fbLogInPage = new FBLogInPage(DriverContext.getDriver());

    }


    @Given("user is already on FacebookLogin Page")
    public void userIsOnLoginPage() {
        DriverContext.getBrowserContext().launchUrl("https://www.facebook.com/");
        DriverContext.getBrowserContext().maxiMizeBrowser();
    }

    @When("facebook login  title page is {string}")
    public void getFacebookLoginpageTitle(String string) {
        String pageTitle = DriverContext.getBrowserContext().getPageTitle();
        System.out.println(pageTitle);
    }

    @Then("user checks Facebook logo on login Page")
    public void user_checks_facebook_logo_on_login_page() {

        System.out.println("logo is displayed");
        DriverContext.getBrowserContext().quitDriver();

    }


    @And("user clicks on CreateNewAccountButton")
    public void userClicksOnCreateNewAccountButton() {

        fbLogInPage.clickOnCreateNewAccount();

    }

    @Then("user checks if enters Firstname and LastName {string} and {string}")
    public void userChecksIfEntersFirstnameAndLastNameAnd(String Fn, String Ln) throws Exception {

        // DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().
        //    findElement(By.cssSelector("form#reg")));
        Thread.sleep(4000);
        fbLogInPage.fillSignUpWindow(Fn, Ln);

    }
}
