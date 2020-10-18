package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _11thGradePage extends AbstractClass {


    WebDriver driver= Driver.getDriver();
    WebElement myElement;



    public _11thGradePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//a[@title='11th Grade'])[1]")
    private WebElement _11thGradeButton;

    @FindBy(xpath = "//p[contains(text(),'11th grade')]")
    private WebElement text;



    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "_11thGradeButton":
                myElement = _11thGradeButton;
                break;

//            case "gradeLevel":
//                myElement = gradeLevel;
//                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "text":
                myElement = text;
                break;

//            case "ErrorMessage":
//                myElement = ErrorMessage;
//                break;
        }

        verifyElementContainsText(myElement, msg);
    }

    public void veryfingUrl(String expectedtext){
        verifyURL(expectedtext);
    }
}
