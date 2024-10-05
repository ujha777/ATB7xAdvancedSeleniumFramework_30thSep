package com.thetestingacademy.pages.PageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.drivers.DriverManagerTL;
import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends CommonToAllPage {
    public LoginPage_POM(){
        super();
    }

    // Page Locators
    By username = By.xpath("//input[@placeholder='username']");
    By password = By.xpath("//input[@type='password']");
    By signButton = By.xpath("//button[@type='submit']");
    By error_message = By.xpath("//p[text()='Invalid credentials']");

    // Page Actions

    public LoginPage_POM loginTOrangeHRMPositive() throws Exception {
        implicitWait();
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        //DriverManager.getDriver().findElement(password).click();
        // Pass the control the DashboardPage
        return this;
    }
    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
    }

    public String loginTOrangeHRMNegative() throws Exception {
        implicitWait();
        enterInput(username, "ggj");
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        // error String
       visibilityOfElement(error_message);
       return getElement(error_message).getText();

    }

    public DashBoard_POM afterLogin(){
        return  new DashBoard_POM();
    }


}
