package pages.login;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.home.DashboardPage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[placeholder='Username']") // input username field
    private WebElement userName;

    @FindBy(css = "[placeholder='Password']") // input password field
    private WebElement password;

    @FindBy(css = ".mx-button.login.no-select") // login button
    private WebElement login_button;

    @FindBy(css = ".icon.New_login_logo") // logo text
    private WebElement logo;

    @FindBy(css = ".error-text:nth-child(3)") // error email address
    private WebElement error_email;

    @FindBy(css = ".modal-dialog") // error password value
    private WebElement error_pass;

    @FindBy(css = ".mx-button.new.blue.no-select.text-center") // "ok" button in popup
    private WebElement ok_popup;

    public String get_error_email_text (){
        return error_email.getText();
    }

    public String get_error_pass_text () {
        return error_pass.getText();
    }

    @Step("Click on Login button")
    @Description("Login button")
    public DashboardPage click_loginButton () {
        click(login_button);
        return new DashboardPage(driver);
    }

    public LoginPage click_ok () {
        click(ok_popup);
        return this;
    }

    public LoginPage type_userName (String text) {
        type(userName, text);
        return this;
    }

    public LoginPage type_password (String pass) {
        type(password, pass);
        return this;
    }

    @Step("Type {username} / {pass}.")  // entering credential value
    public DashboardPage createLogin(String username, String pass) {
        type_userName(username);
        type_password(pass);
        return new DashboardPage(driver);
    }

    public String get_logo_text () {
        return getText(logo);
    }

}
