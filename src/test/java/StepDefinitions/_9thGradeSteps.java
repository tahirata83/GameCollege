package StepDefinitions;

import PageObjectModel._9thGradePage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _9thGradeSteps {
    WebDriver driver = Driver.getDriver();
    _9thGradePage gp=new _9thGradePage();


    @When("^click (\\d+)th Grade button$")
    public void clickThGradeButton(int arg0) {
        gp.findElementAndClickFunction("_9thGradeButton");
    }

    @And("^take (\\d+)th Grade page title$")
    public void takeThGradePageTitle(int arg0) {
        System.out.println(driver.getTitle());
    }

    @Then("^verify (\\d+)th Grade text$")
    public void verifyThGradeText(int arg0) {
        String msg="Welcome to your first step into the amazing world of game development." +
                " At this grade, we select lectures for both International Baccalaureates and Game Development for our students." +
                " In International Game College we provide lots of lectures not just lectures you can find every other high school like algebra or literature," +
                " also topics for kickstart your game development career like the introduction to game development or history of the game.";
        gp.findElementAndVerifyContainsText("text",msg);
    }

    @Then("^verify (\\d+)th Grade page Url$")
    public void verifyThGradePageUrl(int arg0) {

        gp.veryfingUrl("9-th-grade");

    }
}
