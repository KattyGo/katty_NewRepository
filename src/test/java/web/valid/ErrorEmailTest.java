package web.valid;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login.LoginPage;

import static base.BaseTest.getDriver;

public class ErrorEmailTest extends BaseTest {

    @Test(testName = "login", description = "Login - invalid email address")
    public void login_test() throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver()); // instance of login page

        loginPage.type_userName("errorEmail.com");
        loginPage.type_password("123456");
        System.out.println(loginPage.get_logo_text());
        loginPage.click_loginButton();

        Assert.assertEquals(loginPage.get_error_email_text(), "Please enter a valid email address");

    }
}
