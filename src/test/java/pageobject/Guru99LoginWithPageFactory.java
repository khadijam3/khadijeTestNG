package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.CommonMethods;


public class Guru99LoginWithPageFactory extends CommonMethods {

    @FindBy(css = "[name='uid']")
    public WebElement userName;

    @FindBy(css = "[name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public Guru99LoginWithPageFactory() {
        PageFactory.initElements(driver, this);
    }

}
