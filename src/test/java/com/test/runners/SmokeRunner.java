package com.test.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/FaceBookLoginPage.feature",
        glue = {"com.test.steps"},
        dryRun = false
)
public class SmokeRunner {
}
