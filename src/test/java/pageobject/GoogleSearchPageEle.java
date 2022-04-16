package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.CommonMethods;

public class GoogleSearchPageEle extends CommonMethods{
    WebDriver driver;

    public GoogleSearchPageEle(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//input[@name='q']")
    public WebElement searchBox;

    @FindBy(xpath ="(//input[@name='btnK'])[1]")
    public WebElement search_Btn;

    @FindBy(xpath ="//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")
    public WebElement faceBook_Link;

    public void searchG(){
      searchBox.sendKeys("facebook");
        search_Btn.click();
        faceBook_Link.click();
    }


    // By searchBox = By.xpath("//input[@name = 'q']");
    //By search_Btn = By.xpath("(//input[@name='btnK'])[1]");
    //By faceBook_Link = By.xpath("//a//h3[text()='Facebook - Log In or Sign Up']");

//    public void searchGoogle(String searchInput) {
//        try {
//            driver.findElement(searchBox).sendKeys(searchInput);
//            Thread.sleep(1000);
//            driver.findElement(search_Btn).click();
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println("exception Caught" + e.getMessage());
//        }
//    }
//
//    public void ClickFacebook() {
//        try {
//            driver.findElement(faceBook_Link).click();
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println("exception Caught" + e.getMessage());
//        }
    }

