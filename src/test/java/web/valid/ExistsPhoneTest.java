package web.valid;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.customer.NewCustomerPage;
import pages.home.DashboardPage;
import pages.login.LoginPage;

public class ExistsPhoneTest extends BaseTest {
    @Test(testName = "NewCustomer", description = "Notification - Phone number already exists")
    public void login_test() throws InterruptedException {

            LoginPage loginPage = new LoginPage(getDriver()); // instance of login page
            DashboardPage dashboardPage = new DashboardPage(getDriver()); // instance of dashboard page
            NewCustomerPage newCustomerPage = new NewCustomerPage(getDriver());

            loginPage.type_userName("Shoval.Ziman@comm-it.com")
                    .type_password("123456")
                    .click_loginButton()
                    .click_addNewCustomer()
                    .new_Customer()
                    .customerType()
                    .typePhone()
                    .type_PhoneNumber("1234567")
                    .typePhone();

            Assert.assertEquals(newCustomerPage.get_notify_exist_phone(), "There is already a customer with this phone number in the system.");

        }

    }

