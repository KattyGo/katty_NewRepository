package pages.home;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.customer.NewCustomerPage;

import java.util.logging.Logger;

public class DashboardPage extends BasePage {

    @FindBy(css = ".main-menu-btn-label")
    private WebElement next_tab;

    @FindBy(css = ".next-visit-lbl")
    private WebElement scroll_pattern;

    @FindBy(css = ".icon.add_white.pointer") // "+ Add Customer, Property & Pool" icon
    private WebElement addNewCustomer;

    @FindBy(css = ".icon.contract_full_service")
    private WebElement full_service_icon;



    public NewCustomerPage click_addNewCustomer () {
        wait.until(ExpectedConditions.visibilityOf(full_service_icon));
        click(addNewCustomer);
        System.out.println("User moved to Add Customer&Property screen successfully");
        return new NewCustomerPage(driver);
    }

    @FindBy(css = "[formcontrolname='customerStatus'][value='existingCustomer']") // radio-button "Existing Customer"
    private WebElement existCustomer;
    public void click_existingCustomer () { click(existCustomer); }


    public DashboardPage (WebDriver driver) {super(driver);}

    public String is_displayTab() {return getText(next_tab);}

    public void scroll_pattern(){scrollToElement(scroll_pattern);}


}
