package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.CommonMethods;


public class AddnewCustomer extends CommonMethods {
    @FindBy(linkText = "New Customer")
    public WebElement newCustomer;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement FiledName;

    @FindBy(xpath = "//input[@value='f']")
    public WebElement redioBton;

    @FindBy(id = "dob")
    public WebElement calenderdate;

    @FindBy(xpath = "//*[@name='addr']")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@name='city']")
    public WebElement City;

    @FindBy(xpath = "//*[@name='state']")
    public WebElement State;

    @FindBy(xpath = "//*[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//*[@name='telephoneno']")
    public WebElement Telephone;

    @FindBy(xpath = "//*[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement EmailPasswrod;

    @FindBy(xpath = "//input[@name='sub']")
    public WebElement subBTN;


    public AddnewCustomer() {

        PageFactory.initElements(driver, this);
    }


public void openCustomerPage() {
    newCustomer.click();
    sendText(FiledName, "khadija");
    redioBton.click();
    sendText(calenderdate, "0312/2019");
    sendText(addressBox, "13545 Princedale Drive zip 22193");
    sendText(City, "Woodbrige");
    sendText(State, "VA");
    sendText(pin, "23091");
    sendText(Telephone, "617-652-1234");
    sendText(email, "khadija.rhabbibi@gmail.com");
    sendText(EmailPasswrod, "Khadija123");
    subBTN.click();

}
}

