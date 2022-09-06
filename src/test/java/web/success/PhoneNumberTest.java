package web.success;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.customer.NewCustomerPage;
import pages.home.DashboardPage;
import pages.login.LoginPage;

import java.util.Random;

import static base.BaseTest.getDriver;

public class PhoneNumberTest extends BaseTest {


    @Test(testName = "Phone number", description = "Type Phone number correct")
    public void new_customer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver()); // instance of login page
        DashboardPage dashboardPage = new DashboardPage(getDriver()); // instance of dashboard page
        NewCustomerPage newCustomerPage = new NewCustomerPage(getDriver());

        loginPage.type_userName("Shoval.Ziman@comm-it.com")
                .type_password("123456")
                .click_loginButton()
                .click_addNewCustomer()
                .new_Customer()
                .customerType()
                .type_phone_number();

    }

}
