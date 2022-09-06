package web.valid;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login.LoginPage;

public class ErrorPassTest extends BaseTest {

    @Test(testName = "login", description = "Login - invalid password")
    public void login_test() throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver()); // instance of login page

        loginPage.type_userName("Shoval.Ziman@comm-it.com");
        loginPage.type_password("111111");
        System.out.println(loginPage.get_logo_text());
        loginPage.click_loginButton();

        Assert.assertEquals(loginPage.get_error_pass_text(), "The username or password you had entered are incorrect, please enter your credentials and try again");

        loginPage.click_ok();

    }
}
