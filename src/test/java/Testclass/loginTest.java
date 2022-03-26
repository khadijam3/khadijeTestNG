package Testclass;


import TestBase.testClass;
import org.testng.annotations.Test;
import pageobject.AddnewCustomer;
import pageobject.Guru99LoginWithPageFactory;

public class loginTest{
    @Test
    public void test2() {
        testClass.SetWithSpecificURL("http://www.demo.guru99.com/V4/");
        Guru99LoginWithPageFactory ObjectPageMethed =new Guru99LoginWithPageFactory();
        ObjectPageMethed.userName.sendKeys( "mngr392551");
        ObjectPageMethed.password.sendKeys("sYdEtah");
        ObjectPageMethed.loginBtn.click();
        AddnewCustomer ACustomer =new AddnewCustomer();
        ACustomer.newCustomer.click();
        ACustomer.FiledName.sendKeys("khadija");
        ACustomer.redioBton.click();
        ACustomer.calenderdate.sendKeys("0312/2019");
        ACustomer.addressBox.sendKeys("13545 Princedale Drive zip 22193");
        ACustomer.City.sendKeys("Woodbrige");
        ACustomer.State.sendKeys("VA");
        ACustomer.pin.sendKeys("23091");
        ACustomer.Telephone.sendKeys("617-652-1234");
        ACustomer.email.sendKeys("khadija.rhabbibi@gmail.com");
        ACustomer.EmailPasswrod.sendKeys("Khadija123");
        ACustomer.subBTN.click();
        testClass.Teardown();}


    }


