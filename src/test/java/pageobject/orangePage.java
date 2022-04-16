package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.CommonMethods;

import java.util.concurrent.TimeUnit;

public class orangePage extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(id = "welcome")
    public WebElement welcomeAttribute;
    public orangePage() {

        PageFactory.initElements(driver, this);
    }

    public void HRMsLogin() {
        sendText(userName, "Admin");
        sendText(password, "admin123");
        loginBtn.click();
    }
    public void welcomeMassageValidation() {
        welcomeAttribute.isDisplayed();
        if (welcomeAttribute.isDisplayed()) {
            System.out.println("Test is valid and Passed");
        } else {
            System.out.println("Test is failed");
        }
    }

        public void titleValidation(){
            String expectedTitle = "OrangeHRM";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(expectedTitle, actualTitle);
            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Title is same passed");
            } else {
                System.out.println("Test is failed");
            }
        }
        }




