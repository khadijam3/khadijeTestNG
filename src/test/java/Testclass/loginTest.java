package Testclass;


import TestBase.testClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.AddnewCustomer;
import pageobject.Guru99LoginWithPageFactory;

public class loginTest{

  @BeforeTest
    public void Login() {
      testClass.setUp();
      testClass.SetWithSpecificURL("http://www.demo.guru99.com/V4/");
        Guru99LoginWithPageFactory ObjectPageMethed = new Guru99LoginWithPageFactory();
        ObjectPageMethed.Guru99page();
    }
        @Test
        public void Customer() {
            AddnewCustomer addnewCustomer = new AddnewCustomer();
            addnewCustomer.openCustomerPage();

        }
            @AfterTest
            public void quiteBrowser() {
            testClass.Teardown();
   }}


