package utilites;


import TestBase.testClass;

import org.openqa.selenium.WebElement;

public class CommonMethods extends testClass {

        public void sendText(WebElement element, String text){
                element.clear();
                element.sendKeys(text);


        }

        }










