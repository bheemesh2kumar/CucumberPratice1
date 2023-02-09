package com.utilities;

import base.DriverContext;
import org.openqa.selenium.Alert;

public class AppUtilities {


    public static void moveToAlert() {

        DriverContext.getDriver().switchTo().alert();

    }


}
