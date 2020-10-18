package StepDefinitions;

import PageObjectModel.AbstractClass;
import PageObjectModel.PreparationPage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PreparationSteps  {
    WebDriver driver = Driver.getDriver();
    PreparationPage prp=new PreparationPage();

    @Given("^navigate to website$")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.get("https://igamecollege.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^over hover the Education button$")
    public void overHoverTheEducationButton() {
       prp.hoveringOvering();
    }

    @When("^click Preparation button$")
    public void clickPreparationButton() {
        prp.findElementAndClickFunction("preparation");
    }

    @Then("^verify Preparation text$")
    public void verifyPreparationText() {
        String msg="In International Game College we value language and communication skills.In today's game development world," +
                " English is an essential skill to have. And we provide the best English learning platform" +
                " with personalized curriculum and tons of practice chance for our students.";
        prp.findElementAndVerifyContainsText("text",msg);
    }

    @Then("^verify Url$")
    public void verifyUrl() {
        prp.verifyURL("preparation");
    }
}
