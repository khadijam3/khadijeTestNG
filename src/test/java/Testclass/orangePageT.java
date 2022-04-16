package Testclass;

import TestBase.testClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.orangePage;

public class orangePageT {

public static orangePage OPage;
@BeforeTest
    public void openPage(){

       testClass.setUp();
       testClass.SetWithSpecificURL("https://opensource-demo.orangehrmlive.com");
    }
    @Test
    public void loginOrangePage() {
       OPage=new orangePage();
       OPage.HRMsLogin();
       OPage.welcomeMassageValidation();
       OPage.titleValidation();
    }
    @Test
    public void validateWelcome() {

    OPage.welcomeMassageValidation();
    }
    @Test
    public void validTitle() {

    OPage.titleValidation();
    }
    @AfterTest
    public void quiteBrowser() {

    testClass.Teardown();
    }
}