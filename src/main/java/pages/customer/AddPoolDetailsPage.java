package pages.customer;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPoolDetailsPage extends BasePage {
    public AddPoolDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".icon.no_pools") // add Image area in 'Add Pool Details'
    private WebElement iconImage;
    public AddPoolDetailsPage add_image_Customer() {
        click(iconImage);
        iconImage.sendKeys("U:\\Projects New\\QA_MPP_PROJECTS\\Water_SLE\\Normal_Format.png");
        System.out.println("File is Uploaded Successfully");
        return this;
    }

    @FindBy(css = ".left-side .input-row:nth-child(1) .ng-untouched") // open 'Facility' dropdown
    private WebElement facility;

    @FindBy(css = ".left-side .input-row:nth-child(2) .expand-icon") // open 'Pool type' dropdown
    private WebElement typePool;

    @FindBy(css = ".no-margin:nth-child(1) .expand-icon") // open 'Surface' dropdown
    private WebElement surface;

    @FindBy(css = ".no-margin:nth-child(2) .expand-icon") // open 'No. of skimmers' dropdown
    private WebElement number_Skimmers;

    @FindBy(css = ".left-side .input-row:nth-child(3) .ng-untouched") // open 'Use' dropdown
    private WebElement use;

    @FindBy(css = ".right-side .input-row:nth-child(3) .ng-untouched") // open 'Operation' dropdown
    private WebElement operation;

    @FindBy(css = "[formcontrolname='volume']") // Volume field
    private WebElement dimensions_Volume;

    @FindBy(css = "[formcontrolname='width']") // Width field
    private WebElement dimensions_Width;

    @FindBy(css = "[formcontrolname='length']") // Length field
    private WebElement dimensions_Length;

    @FindBy(css = "[formcontrolname='depth']") // Depth field
    private WebElement dimensions_Depth;

    @FindBy(css = "[formcontrolname='pipeDiameter']") // Pipe diameter field
    private WebElement dimensions_Pipe;

    @FindBy(css = ".wrapper .main-image") // add image in 'Add Inline Device'
    private WebElement image_AddInlineDevice;

    @FindBy(css = "[formcontrolname='serialNumber']") // serial number 'Add Inline Device'
    private WebElement serial_Number;

    @FindBy(css = ".inline-data-row:nth-child(1) .datepick-container") // date Installed On in 'Add Inline Device'
    private WebElement date_InstalledOn;

    @FindBy(css = ".inline-data-row:nth-child(2) .datepick-container") // date Last Calibrated On in 'Add Inline Device'
    private WebElement date_LastCalibratedOn;

    @FindBy(css = ".inline-data-row:nth-child(2) .input-wrapper.no-asterisk:nth-child(2) .datepick-container") // date Warranty Until in 'Add Inline Device'
    private WebElement date_WarrantyUntil;

    @FindBy(css = ".mx-textarea.ng-pristine") // field Comments in 'Add Inline Device'
    private WebElement comments_InLineDevice;

    @FindBy(css = ".blue.float-right") // Save button in 'Add Inline Device'
    private WebElement save_InLineDevice;

}
