package com.utilities;

import base.DriverContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class AppUtilities {


    public static void moveToAlert() {

        DriverContext.getDriver().switchTo().alert();

    }
    
     public void moveToFrame(WebElement ele) {
        DriverContext.getDriver().switchTo().frame(ele);
    }
    
     public void moveTodefaultContent(WebElement ele) {
        DriverContext.getDriver().switchTo().defaultContent();
    }
    
     public void moveToWindowID(String windowID) {
        DriverContext.getDriver().switchTo().window(windowID);
    }


}
