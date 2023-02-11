package com.test.steps;

import Pages.FBLogInPage;
import base.DriverContext;
import base.FrameWorkInit;
import base.Page;
import com.utilities.AppUtilities;
import com.utilities.Emp;
import com.utilities.PropertyReaderUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ApplicationSteps {

    FrameWorkInit frameWorkInit = new FrameWorkInit();
    Page page = null;
    FBLogInPage fbLogInPage = null;

    @Before
    public void browserSetUP() {
        frameWorkInit.browserInit(PropertyReaderUtil.getConfigValuesFromMap("browser.name"));
        page = new Page(DriverContext.getDriver(),
                new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(10)));
        DriverContext.getBrowserContext().launchUrl("https://www.facebook.com/");
        DriverContext.getBrowserContext().maxiMizeBrowser();

    }

    @After
    public void tearDown() {

        DriverContext.getDriver().quit();

    }

    @Given("user is already on Facebook login page")
    public void user_is_already_on_facebook_login_page() {
        fbLogInPage = page.getInstance(FBLogInPage.class);
        Boolean falg = fbLogInPage.isdisplayedFaceBookLableonLonginPage();
        System.out.println("is FB lable on Login page" + " " + falg);
        Assert.assertTrue(falg, "user is not navigated to FB login page");


    }

    @Given("facebook login page has facebook lable as {string}")
    public void facebook_login_page_has_facebook_lable_as(String facebookExpValue) {
        String fbLableName = fbLogInPage.getAttributeValue(fbLogInPage.lablemainFbLoginPage, "alt");

        Boolean flag = fbLableName.equalsIgnoreCase(facebookExpValue);
        Assert.assertTrue(flag, "user is not navigated to fab home page");


    }

    @Then("check if user is able to enter details on signup page")
    public void check_if_user_is_able_to_enter_details_on_signup_page() {
        FBLogInPage fbLogInPage = page.getInstance(FBLogInPage.class);
        fbLogInPage.doSignUp();
    }


    @Then("check if dob details are sorted in order")
    public void checkIfDobDetailsAreSortedInOrder() {

        Boolean flag = fbLogInPage.isDropDownValuesareSorting(fbLogInPage.dropDownDobselector);
        Assert.assertTrue(flag, "dop elemment are not sorted");


    }
}
