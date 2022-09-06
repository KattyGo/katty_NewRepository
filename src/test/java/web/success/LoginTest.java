package web.success;

import base.BaseTest;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.home.DashboardPage;
import pages.login.LoginPage;

import static java.lang.Thread.sleep;

public class LoginTest  extends BaseTest {

    @Epic("Login")
    @Test (testName = "login", description = "Login with valid data")
    public void login_test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver()); // instance of login page
        DashboardPage dashboardPage = new DashboardPage(getDriver()); // instance of dashboard page

 //       loginPage.type_userName("Shoval.Ziman@comm-it.com");
 //       loginPage.type_password("123456");
        loginPage.createLogin("Shoval.Ziman@comm-it.com", "123456");
        System.out.println(loginPage.get_logo_text());
        loginPage.click_loginButton();
        System.out.println(dashboardPage.is_displayTab());

        dashboardPage.scroll_pattern();

        sleep(5000);

    }

}
