package com.utilities;

import base.DriverContext;
import org.openqa.selenium.Alert;

public class AppUtilities {


    public static void moveToAlert() {

        DriverContext.getDriver().switchTo().alert();

    }
    
     public void moveToFrame(WebElement ele) {
        DriverContext.getDriver().switchTo().frame(ele);
    }


}
