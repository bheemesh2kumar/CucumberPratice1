package com.utilities;

import base.DriverContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

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

    public void moveToActiveElment() {
        DriverContext.getDriver().switchTo().activeElement();
    }

    public void moveToActiveTab() {
        DriverContext.getDriver().switchTo().newWindow(WindowType.TAB);
    }

    public void moveToFrameBasedonIndex(int index) {
        DriverContext.getDriver().switchTo().frame(index);
    }

    public void deleteAllCookies(WebElement ele) {
        DriverContext.getDriver().manage().deleteAllCookies();
    }


}
