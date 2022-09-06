package web.success;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.customer.NewCustomerPage;
import pages.home.DashboardPage;
import pages.login.LoginPage;

import static java.lang.Thread.sleep;

public class CreateNewCustomerTest extends BaseTest {

    @Test (testName = "New Customer", description = "Create new Customer")
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
                    .residentialType()
                    .type_firstName("any_text")
                    .remove_FirstNameText();
                        Assert.assertEquals(newCustomerPage.get_required_text(), "Required");
                        newCustomerPage.type_firstName("John")
                        .type_lastName("Wick")
                        .click_boxPremium()
                        .typePhone()
                        .type_PhoneNumber("1234569")
                        .addPhone()
                        .click_boxConsent()
                        .typeTitle()
                        .type_TitleMx()
                        .role_Text("Role In Property")
                        .email_address("testPro@mail.com")
                        .click_boxEmail()
                        .click_Calendar()
                        .type_Today_date()
                        .comments_Customer("comments for the Customer")
                        .add_image_Customer()
                            .title_Property_Area()
                            .type_Address_Property("345, Yarkon st., Ramat Gan, 263612")
                            .type_NameProperty("name of Property")
                            .contractType_Property()
                            .serviceMaintenance()
                            .comments_Property("comments for the Property")
                                .header_ContactList()
                                .add_Contact()
                                .add_image_Contact()
                                .typePhone_Contact()
                                .type_numPhoneContact("1234570")
                                .type_firstNameContact("Leon")
                                .type_lastNameContact("Blum")
                                .save_ContactButton();

        sleep(300);

    }

}
