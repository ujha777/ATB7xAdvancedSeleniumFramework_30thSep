package com.thetestingacademy.vwo.LoginTest;

import com.thetestingacademy.basetest.CommonToAllTest;
import com.thetestingacademy.pages.PageObjectModel.DashBoard_POM;
import com.thetestingacademy.pages.PageObjectModel.LoginPage_POM;
import com.thetestingacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginTest extends CommonToAllTest {
    @Test( priority = 1)
    public void testLoginNegative() throws Exception {

        // How to enter the user, pass and go the Dashboard and verify
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURL(PropertyReader.readKey("url"));
      String error_message = pagePom.loginTOrangeHRMNegative();
       Assertions.assertThat(error_message )
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("error_message"));
    }

    @Test(priority = 2)
    public void testLoginPositive() throws Exception {

        // How to enter the user, pass and go the Dashboard and verify
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURL(PropertyReader.readKey("url"));
        DashBoard_POM dashboardPagePom = pagePom.loginTOrangeHRMPositive().afterLogin();
        String expected_username = dashboardPagePom.loggedInUserName();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));

    }
}
