package pageobject;

import TestBase.testClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.CommonMethods;

import static org.testng.AssertJUnit.assertEquals;

public class facbooksearchPageElement extends CommonMethods {
    WebDriver driver;

    public facbooksearchPageElement(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
//    By UserName_editbox = By.id("email");
//    By Password_editbox = By.id("pass");
//    By Login_Btn = By.name("login");

    @FindBy(id = "email")
    public WebElement userName;

    @FindBy(id= "pass")
    public WebElement password;

    @FindBy(id = "login")
    public WebElement loginBtn;

    public void EnterUserName() {
        userName.sendKeys("khadija.rhabibi@gmail.com");
    }
    public void EnterPassword() {

        password.sendKeys("khadija123");
        }
    public void verifyLogin() {
            String title=testClass.driver.getTitle();
            System.out.println(title);
            Assert.assertEquals(title, "Facebook - log in or sign up");
            if(title.equalsIgnoreCase("Facebook - log In or Sign Up")){
            System.out.println("test pass");

        }else{
                System.out.println("test fails");
            }

        }


        }

