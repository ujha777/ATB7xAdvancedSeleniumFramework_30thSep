package com.thetestingacademy.basetest;

import com.thetestingacademy.drivers.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class CommonToAllTest {
    // To call the Start the Webdriver
    // Down the WebDriver

    // Who will start the Webdriver?
    @BeforeMethod
    protected void setUp() throws MalformedURLException {
     DriverManagerTL.init();
    }

    // Who will close the Webdriver
    @AfterMethod
    protected void tearDown(){
      DriverManagerTL.down();
    }
}
