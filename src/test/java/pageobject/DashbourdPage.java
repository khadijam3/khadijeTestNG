package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.CommonMethods;

import java.util.List;

public class DashbourdPage extends CommonMethods {
    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimOPtion;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeButton;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    @FindBy(xpath = "//div[@class='menu']/ul/li")
    public List<WebElement> dashboardtabs;


    public DashbourdPage() {

        PageFactory.initElements(driver, this);
    }
}





