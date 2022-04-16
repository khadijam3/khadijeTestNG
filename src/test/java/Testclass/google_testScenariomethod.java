package Testclass;

import TestBase.testClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.GoogleSearchPageEle;
import pageobject.facbooksearchPageElement;
import utilites.CommonMethods;

public class google_testScenariomethod extends CommonMethods {
    @BeforeTest
    public void beforeTest() {
        testClass.setUp();
        testClass.SetWithSpecificURL("https://www.google.com");
    }

    @Test
    public void search() {
        GoogleSearchPageEle googlePage = new GoogleSearchPageEle(driver);
        googlePage.searchG();
    }
@Test
    public void verifyLogin() {
        facbooksearchPageElement facebookPage = new facbooksearchPageElement(driver);
        facebookPage.EnterUserName();
        facebookPage.EnterPassword();
        facebookPage.verifyLogin();
        testClass.Teardown();
    }
}