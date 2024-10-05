package com.thetestingacademy.pages.PageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashBoard_POM extends CommonToAllPage {
    DashBoard_POM() {
    }

    By userNameOnDashboard = By.xpath("//h6[text()='Dashboard']");

    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();

    }

}
