package pages.customer;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NewCustomerPage extends BasePage {

    public NewCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[formcontrolname='customerStatus'][value='newCustomer']") // radio-button "New Customer"
    private WebElement newCustomer;
    public NewCustomerPage new_Customer () {
        click(newCustomer);
        System.out.println("select New Customer option");
        return this;
    }

    @FindBy(css = "[formcontrolname='customerStatus'][value='existingCustomer']") // radio-button "Existing Customer"
    private WebElement existCustomer;
    public void exist_Customer () {click(existCustomer);}

    @FindBy(css = "[ng-reflect-name='customerType'] .icon") // open dropdown Customer type in New Customer screen
    private WebElement typeCustomer;
    public NewCustomerPage customerType () {
        click(typeCustomer);
        return this;
    }

    @FindBy(css = "[formcontrolname='customerType'] .dropdown-table-row") // dropdown list in "Customer type"
    private List<WebElement> listTypeCustomer;

    @FindBy(css = ".open .dropdown-menu .ng-star-inserted:nth-child(1)") // customer type - Residential
    private WebElement typeResidential;
    public NewCustomerPage residentialType () {
        click(typeResidential);
        return this;
    }

    @FindBy(css = ".open .dropdown-menu .ng-star-inserted:nth-child(2)") // customer type - Commercial
    private WebElement typeCommercial;
    public NewCustomerPage commercialType () {
        click(typeCommercial);
        return this;
    }

    @FindBy(css = "[placeholder='First name']") // first name
    private WebElement firstName;
    public NewCustomerPage type_firstName (String text) {
        type(firstName, text);
        return this;
    }

    @FindBy(css = ".bigger-margin .error-handler") // error password value
    private WebElement required_firstName;

    @FindBy(css = "[placeholder='Last name']") // last name
    private WebElement lastName;
    public NewCustomerPage type_lastName (String text) {
        type(lastName, text);
        return this;
    }

    @FindBy(css = "[ng-reflect-name='isPremium'] .mx-checkbox .box") // checkbox Premium
    private WebElement boxPremium;
    public NewCustomerPage click_boxPremium () {
        click(boxPremium);
        return this;
    }

    @FindBy(css = ".phone-type.ng-untouched.ng-pristine.ng-valid .icon") // open dropdown in Phone
    private WebElement typePhone;
    public NewCustomerPage typePhone () {
        click(typePhone);
        return this;
    }

    @FindBy(css = "[formcontrolname='phoneNumber'] [type='text']") // phone number field
    private WebElement numPhone;
    public NewCustomerPage type_PhoneNumber (String text) {
        type(numPhone, text);
        return this;
    }

    @FindBy(css = ".icon.add") // add phone number
    private WebElement addPhone;
    public NewCustomerPage addPhone () {
        click(addPhone);
        return this;
    }

    @FindBy(css = ".line-break .box") // checkbox Consent
    private WebElement boxConsent;
    public NewCustomerPage click_boxConsent () {
        click(boxConsent);
        return this;
    }

    @FindBy(css = "[formcontrolname='title'] .expand-icon") // open Title dropdown
    private WebElement title;
    public NewCustomerPage typeTitle () {
        click(title);
        return this;
    }

    @FindBy(css = "[formcontrolname='title'] .dropdown-menu .ng-star-inserted") // dropdown list in "Title"
    private List<WebElement> listTitle;

    @FindBy(css = ".open .ng-star-inserted:nth-child(3)") // select "Mx" from Title dropdown
    private WebElement titleMx;
    public NewCustomerPage type_TitleMx () {
        click(titleMx);
        return this;
    }

    @FindBy(css = "[ng-reflect-name='role']") // Role field
    private WebElement role;
    public NewCustomerPage role_Text (String text) {
        type(role, text);
        return this;
    }

    @FindBy(css = ".input-row:nth-child(5) .error-handler") // error email address
    private WebElement error_EmailAddress;
    public String get_error_email_text (){ return error_EmailAddress.getText(); }

    @FindBy(css = "[placeholder='Name@mail.com']") // e-mail field
    private WebElement mail;
    public NewCustomerPage email_address (String text) {
        type(mail, text);
        return this;
    }

    @FindBy(css = "[formcontrolname='allowSendEmails'] .box") // checkbox send email
    private WebElement boxEmail;
    public NewCustomerPage click_boxEmail () {
        click(boxEmail);
        return this;
    }

    @FindBy(css = ".icon.Calendar.hover.pressed") // icon of "date pick"
    private WebElement iconCalendar;
    public NewCustomerPage click_Calendar () {
        double_click(iconCalendar);
        return this;
    }

    @FindBy(css = ".datepicker-header .datepick-container") // field Date picker
    private WebElement textCalendar;
    public NewCustomerPage type_Today_date () {
        String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        System.out.println("type_date: "+ timeStamp);
        type(textCalendar, timeStamp );
        return this;
    }

    @FindBy(css = ".mx-textarea.ng-untouched") // field Comments in Customer sector
    private WebElement commentsCustomer;
    public NewCustomerPage comments_Customer (String text) {
        type(commentsCustomer, text);
        return this;
    }

    @FindBy(css = ".icon.no_pools") // add Image area
    private WebElement iconImage;
    public NewCustomerPage add_image_Customer() {
        click(iconImage);
        iconImage.sendKeys("U:\\Projects New\\QA_MPP_PROJECTS\\Water_SLE\\Normal_Format.png");
        System.out.println("File is Uploaded Successfully");
        return this;
    }

    @FindBy(css = ".box.details-box.property-box.ng-star-inserted .box-title") // Property title
    private WebElement titleProperty;
    public NewCustomerPage title_Property_Area () {
        scrollToElement(titleProperty);
        return this;
    }

    @FindBy(css = ".clickable-error-hanlder.ng-star-inserted:nth-child(4) div:nth-child(1)") // "continue anyway" tooltip
    private WebElement continueAnyway;
    public NewCustomerPage continue_Anyway () {
        click(continueAnyway);
        return this;
    }
    @FindBy(css = ".mx-button.new.blue.no-select.text-center") // confirm on "continue anyway" popup
    private WebElement confirmContinueAnyway;


    public String is_displayLink() {return getText(continueAnyway);}

    @FindBy(css = "[formcontrolname='address']") // Property address field
    private WebElement addressProperty;
    public NewCustomerPage type_Address_Property (String text) {
        type(addressProperty, text);
            while (is_displayLink()!=null) {
                click(continueAnyway);
                System.out.println("link for continue anyway");
                sleep(100);
                click(confirmContinueAnyway);
            }
        return this;
    }

    @FindBy(css = "[placeholder='Property name'].mx-input") // Property name field
    private WebElement nameProperty;
    public NewCustomerPage type_NameProperty (String text) {
        type(nameProperty, text);
        return this;
    }

    @FindBy(css = ".open .expand-icon") // open Contract type dropdown
    private WebElement contractTypeProperty;
    public NewCustomerPage contractType_Property() {
        click(contractTypeProperty);
        return this;
    }

    @FindBy(css = ".open .expand-icon") // dropdown list in "Contract type"
    private List<WebElement> listContractType;

    @FindBy(css = ".open .dropdown-menu .ng-star-inserted:nth-child(1)") // select value "service&maintenance" from dropdown
    private WebElement service_maintenance;
    public NewCustomerPage serviceMaintenance () {
        click(service_maintenance);
        return this;
    }

    @FindBy(css = "[formcontrolname='serviceFrequency'] .expand-icon") // open Service Frequency dropdown
    private WebElement serviceProperty;

    @FindBy(css = "[formcontrolname='serviceFrequency'] .dropdown-menu .dropdown-item") // dropdown list in "Service Frequency"
    private List<WebElement> listService;

    @FindBy(css = ".mx-textarea.ng-touched") // field Comments in Property sector
    private WebElement commentsProperty;
    public NewCustomerPage comments_Property (String text) {
        type(commentsProperty, text);
        return this;
    }

    @FindBy(css = ".wrapper .header") // scroll to the Contact List
    private WebElement contactList_Header;
    public NewCustomerPage header_ContactList () {
        scrollToElement(contactList_Header);
        return this;
    }

    @FindBy(css = ".add-contact .icon") // Add Contact button in Contact List
    private WebElement addContact;
    public NewCustomerPage add_Contact () {
        click(addContact);
        return this;
    }

    @FindBy(css = ".icon.photoAddContactPlaceholder") // add Image area in 'Add Contact'
    private WebElement iconImageContact;
    public NewCustomerPage add_image_Contact() {
        click(iconImage);
        iconImage.sendKeys("U:\\Projects New\\QA_MPP_PROJECTS\\Water_SLE\\Normal_Format.png");
        System.out.println("File is Uploaded Successfully");
        return this;
    }

    @FindBy(css = ".open .dropdown-header") // open dropdown in Phone in 'Add Contact'
    private WebElement typePhoneContact;
    public NewCustomerPage typePhone_Contact () {
        click(typePhone);
        return this;
    }

    @FindBy(css = ".no-margin .phone-number") // phone number field in 'Add Contact'
    private WebElement numPhoneContact;
    public NewCustomerPage type_numPhoneContact (String text) {
        type(numPhoneContact, text);
        return this;
    }

    @FindBy(css = ".checkbox-error .box") // checkbox Consent in 'Add Contact'
    private WebElement boxConsentContact;
    public NewCustomerPage click_boxConsentContact () {
        click(boxConsent);
        return this;
    }

    @FindBy(css = "[placeholder='First Name']") // first name in 'Add Contact'
    private WebElement firstNameContact;
    public NewCustomerPage type_firstNameContact (String text) {
        type(firstNameContact, text);
        return this;
    }

    @FindBy(css = "[placeholder='Last Name']") // last name in 'Add Contact'
    private WebElement lastNameContact;
    public NewCustomerPage type_lastNameContact (String text) {
        type(lastNameContact, text);
        return this;
    }

    @FindBy(css = ".blue.float-right") // click on Save button in 'Add Contact'
    private WebElement saveContact;
    public NewCustomerPage save_ContactButton () {
        click(saveContact);
        return this;
    }

    @FindBy(css = ".blue.wide") // click on Continue button in 'Add Contact'
    private WebElement continueNewCustomer;
    public NewCustomerPage continue_NewCustomer () {
        click(saveContact);
        return this;
    }


    public NewCustomerPage remove_FirstNameText () { // remove any text from the field
        removeText(firstName);
        return this;
    }
    public void remove_LastNameText () { // remove any text from the field
        removeText(lastName);
    }

    public String get_required_text () {return required_firstName.getText();}

    @FindBy(css = ".nofitication-body.ng-star-inserted") // phone number already exists
    private WebElement exist_PhoneNumber;
    public String get_notify_exist_phone () {
        return exist_PhoneNumber.getText();
    }

    @FindBy(css = ".phone-number error-handler:nth-child(2) .error-handler")
    private WebElement inValid_Phone_Number;

    public String is_displayTab() {return getText(inValid_Phone_Number);}


    public void type_phone_number () {

        // to generate a random between 1 to 7
        double number7 = Math.floor((Math.random()*10000000)+1);
        // to generate a random between 1 to 8
        double number8 = Math.floor((Math.random()*100000000)+1);
        // convert double to string
        double number9 = Math.floor((Math.random()*1000000000)+1);
        // convert double to string


        //randomNum = minimum + (int)(Math.random() * maximum);

        String number_phone7 = Double.toString(number7);
        String number_phone8 = Double.toString(number8);
        String number_phone9 = Double.toString(number9);

        ArrayList<String> num_phones = new ArrayList<String>(); // Create an ArrayList object
            num_phones.add(number_phone7);
            num_phones.add(number_phone8);
            num_phones.add(number_phone9);



        for (int i = 0; i < num_phones.size(); i++) {
            System.out.println("valid phone number is: " + number_phone7);
            type_PhoneNumber(num_phones.get(i));
            if (!is_displayTab().equals(inValid_Phone_Number)) {
                type_PhoneNumber(num_phones.get(i+1));
            } else if (!is_displayTab().equals(inValid_Phone_Number)){
                type_PhoneNumber(num_phones.get(i+2));
            } else {
                System.out.println("get the next step");
            }
//
////                 (is_displayTab().equals(inValid_Phone_Number)) {
////                    type_PhoneNumber(number_phone9);
////                    break;
//                }

        }
    }



}
