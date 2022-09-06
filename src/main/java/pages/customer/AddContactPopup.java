package pages.customer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddContactPopup {

    @FindBy(css = ".icon.photoAddContactPlaceholder") // add Image area
    private WebElement addIconImage;

    @FindBy(css = ".no-margin .phone-type .icon") // open phone type drop down
    private WebElement addPhone;

    @FindBy(css = ".form.no-select.open .dropdown-menu .dropdown-item") // dropdown list in "Phone"
    private List<WebElement> listTypePhone;

    @FindBy(css = "[formcontrolname='phoneNumber'][id='phoneNumberInput']") // Number phone field
    private WebElement addNumPhone;


}
