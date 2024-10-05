package com.thetestingacademy.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {
    static WebDriver driver;

    @BeforeMethod
    public static void init(){
        if(driver ==null)
            driver = new ChromeDriver();
    }
  public   static WebDriver getDriver(){
        return driver;
    }
    @AfterMethod
   public static void down(){
        if(driver !=null){
            driver.quit();
            driver = null;
        }
    }
}
