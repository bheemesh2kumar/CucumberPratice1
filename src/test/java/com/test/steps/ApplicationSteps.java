package com.test.steps;

import base.BrowserContext;
import base.DriverContext;
import base.FrameWorkInit;
import com.utilities.PropertyReaderUtil;
import enums.BrowserNames;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class ApplicationSteps {

    @Given("user is already on FacebookLogin Page")
    public void user_is_already_on_facebook_login_page() {

        FrameWorkInit frameWorkInit = new FrameWorkInit();
        frameWorkInit.browserInit(PropertyReaderUtil.getPropertryValue("browser.name"));
        DriverContext.getBrowserContext().launchUrl("https://www.facebook.com/");
        DriverContext.getBrowserContext().maxiMizeBrowser();


    }

    @When("facebook login  title page is {string}")
    public void facebook_login_title_page_is(String string) {

        String pageTitle = DriverContext.getBrowserContext().getPageTitle();
        System.out.println(pageTitle);
    }

    @Then("user checks Facebook logo on login Page")
    public void user_checks_facebook_logo_on_login_page() {

        System.out.println("logo is displayed");
        DriverContext.getBrowserContext().quitDriver();

    }


}
