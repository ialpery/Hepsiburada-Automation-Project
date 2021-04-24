package ObjectModel;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public abstract class abstractClass {

    private final WebDriver driver= Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver,5);

    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement,String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);

    }

    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expected);

        System.out.println("The message : " + actual.getText());
    }

}