package PageObjectModel;

import Utilities.Driver;
import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class PreparationPage extends AbstractClass{
    WebDriver driver= Driver.getDriver();
    WebElement myElement;



    public PreparationPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//ul[@id='menu-main-menu']// li)[6]")
    private WebElement education;

    @FindBy(css="a[title='Preparation']")
    private WebElement preparation;

    @FindBy(xpath="//p[@class='vc_custom_heading']")
    private WebElement text;



    public void veryfingUrl(String expectedtext){
        verifyURL(expectedtext);
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
    public void hoveringOvering(){
       hoverOver(education);
    }

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "preparation":
                myElement = preparation;
                break;

//            case "gradeLevel":
//                myElement = gradeLevel;
//                break;

        }

        clickFunction(myElement);
    }

}
