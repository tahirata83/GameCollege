package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilities.Driver;

import java.util.List;
import java.util.Random;

public abstract  class AbstractClass {

    private WebDriver driver = Driver.getDriver();


    WebDriverWait wait = new WebDriverWait(driver, 60);


//    WebDriver driver;
//    WebDriverWait wait;
//
//    public AbstractClass() {
//        driver = Driver.getDriver();
//        wait=new WebDriverWait(driver,10);
//    }



    public void clickFunction(WebElement clickElement) {

    wait.until(ExpectedConditions.elementToBeClickable(clickElement));
    clickElement.click();

    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);


    }

    public void verifyCreated(List<WebElement> tableList, String value) {

        boolean result = false;

        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {

                result = true;
                System.out.println(value + " is displayed.");
                break;
            }
        }
        if (!result) {
            Assert.fail();
        }
    }

    public void waitUntilList(List<WebElement> list) throws InterruptedException {
        Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfAllElements(list));


    }

    public void deleteFunctionality(List<WebElement> name, List<WebElement> deleteButton, String value, WebElement buttonYes) throws InterruptedException {
        Thread.sleep(1000);


    for (int i = 0; i < name.size(); i++) {

        if (name.get(i).getText().equals(value)) {

            clickFunction(deleteButton.get(i));
            clickFunction(buttonYes);
        }
    }



    }


    public void verifyDeletedAbstractClass(List<WebElement> tableList, String value) throws InterruptedException {
        Thread.sleep(1000);
        boolean result = false;
        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                result = true;
                break;
            }
        }
        if (result) {
            Assert.fail();
        } else {
            System.out.println(value + " is not displayed");
        }
    }

    public void clickDeleteAndYesForSpesificElement(WebElement deleteButton, WebElement yesButton2) throws InterruptedException {
Thread.sleep(2000);
deleteButton.click();
        Thread.sleep(1000);
        yesButton2.click();

    }

    public int randomGenerator(int max){

        Random random = new Random();
        int randomNum= random.nextInt(max);

        return randomNum;
    }


    public void handleDropdown(WebElement dropdown, List<WebElement> dropdownOptions){

        clickFunction(dropdown);

        int randomNum =randomGenerator(dropdownOptions.size());

        clickFunction(dropdownOptions.get(randomNum));
    }


    public void Assertion(WebElement actual,String expected){


        Assert.assertEquals(actual.getText(),expected);

        System.out.println("My Message =  " + actual.getText());
    }

    public void URLAssertion(String expectedUrl){


        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
        System.out.println("My current url:  " + driver.getCurrentUrl());

    }


    public void sleep(int num){

        try {
            Thread.sleep( num * 1000 );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void hoverOver(WebElement hoveroverElement){
        Actions actions = new Actions( driver );
        actions.moveToElement( hoveroverElement ).build().perform();
        sleep( 5 );
    }


    public void DragAndDrop(WebDriver driver,WebElement element1,WebElement element2){
        Actions action=new Actions(driver);
        action.dragAndDrop(element1,element2).perform();
    }


    public void verifyElementContainsText(WebElement element, String text){
        // waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));

        System.out.println(element.getText());
        System.out.println(text);

        Assert.assertTrue(element.getText().equals(text));


    }



    public void verifyURL(String expectedResult){

        sleep( 5 );
        String URL = driver.getCurrentUrl();

        Assert.assertTrue(URL.contains( expectedResult )  );

    }
}





