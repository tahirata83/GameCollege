package StepDefinitions;


import PageObjectModel._12thGradePage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _12thGradeSteps {
    WebDriver driver = Driver.getDriver();
    _12thGradePage gp=new _12thGradePage();


    @When("^click (\\d+)\\.th Grade button$")
    public void clickThGradeButton(int arg0) {
        gp.findElementAndClickFunction("_12thGradeButton");
    }

    @And("^take (\\d+)\\.th Grade page title$")
    public void takeThGradePageTitle(int arg0) {
        System.out.println(driver.getTitle());
    }

    @Then("^verify (\\d+)\\.th Grade text$")
    public void verifyThGradeText(int arg0) {
        String msg="This grade focuses on expertise levels of areas of game development also" +
                " contains marketing strategies and enterprising courses." +
                " After this grade, our students will be ready to go outside world and explore," +
                " start a new business or join their dream teams to create their dream projects.";
        gp.findElementAndVerifyContainsText("text",msg);
    }

    @Then("^verify (\\d+)\\.th Grade page Url$")
    public void verifyThGradePageUrl(int arg0) {

        gp.veryfingUrl("12th-grade");
    }
}
