package StepDefinitions;


import PageObjectModel._11thGradePage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _11thGradeSteps {
    WebDriver driver = Driver.getDriver();
    _11thGradePage gp=new _11thGradePage();


    @When("^click _(\\d+)_th Grade button$")
    public void click__thGradeButton(int arg0) {
        gp.findElementAndClickFunction("_11thGradeButton");
    }

    @And("^take _(\\d+)_th Grade page title$")
    public void take__thGradePageTitle(int arg0) {
        System.out.println(driver.getTitle());
    }

    @Then("^verify _(\\d+)_th Grade text$")
    public void verify__thGradeText(int arg0) {
        String msg="11th grade is probably the most important grade of International Game College," +
                " At this grade, students take advanced courses like Advanced Programming Techniques," +
                " Network Structures and Game Programming Patterns. After successful completion of this grade, " +
                "our students can say that they are a professional.";
        gp.findElementAndVerifyContainsText("text",msg);
    }

    @Then("^verify _(\\d+)_th Grade page Url$")
    public void verify__thGradePageUrl(int arg0) {
        gp.veryfingUrl("11th-grade");
    }
}
