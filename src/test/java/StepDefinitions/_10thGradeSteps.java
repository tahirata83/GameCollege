package StepDefinitions;


import PageObjectModel._10thGradePage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _10thGradeSteps {
    WebDriver driver = Driver.getDriver();
    _10thGradePage gp=new _10thGradePage();
    @When("^click _(\\d+)th Grade button$")
    public void click_ThGradeButton(int arg0) {
        gp.findElementAndClickFunction("_10thGradeButton");
    }

    @And("^take _(\\d+)th Grade page title$")
    public void take_ThGradePageTitle(int arg0) {
        System.out.println(driver.getTitle());
    }

    @Then("^verify _(\\d+)th Grade text$")
    public void verify_ThGradeText(int arg0) {
        String msg="At this grade, we take our students one step further." +
                " While providing lectures for preparing our students for higher education" +
                " we also provide more in-depth topics such as programming and graphics design.";
        gp.findElementAndVerifyContainsText("text",msg);
    }

    @Then("^verify _(\\d+)th Grade page Url$")
    public void verify_ThGradePageUrl(int arg0) {
        gp.veryfingUrl("10th-grade");
    }
}
