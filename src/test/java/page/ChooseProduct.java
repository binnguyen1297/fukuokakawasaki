package page;

import helper.DriverHelper;
import model.InformationDetails;
import model.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseProduct {
    public ChooseProduct() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(),'DETAILS')]")
    private static WebElement optionDetails;
    @FindBy(xpath = "//h2[normalize-space()='Z900 ABS']")
    private static WebElement productName;

    @FindBy(xpath = "//div[@class='services ']//div[@class='row']")
    private static WebElement productPrice;

    @FindBy(xpath = "//td[text()='2,130 x 825 x 1,080 mm']")
    private static WebElement infoDimensions;

    @FindBy(xpath = "//td[text()='1,455 mm']")
    private static WebElement infoWheelbase;

    @FindBy(xpath = "//td[text()='145 mm']")
    private static WebElement infoRoadClearance;

    @FindBy(xpath = "//td[text()='800 mm']")
    private static WebElement infoSeatHeight;

    @FindBy(xpath = "//td[text()='212 kg']")
    private static WebElement infoCurbMass;

    @FindBy(xpath = "//td[text()='17 litres']")
    private static WebElement infoFuelTankCapacity;

    @FindBy(xpath = "//td[text()='6.3 l/100km']")
    private static WebElement infoFuelConsumption;

    @FindBy(xpath = "//td[text()='2 years']")
    private static WebElement infoWarranty;

    @FindBy(xpath = "//input[@class='form-control pTwo navigation-search-input']")
    private WebElement txtSearch;

    @FindBy(xpath = "//button[@aria-label='activate global search']//i[@class='fa fa-search']")
    private WebElement iconSearch;

    public static void clickOptionDetails() {
        optionDetails.click();
    }

    public static void verifyProduct(Product expected) {
        Product actual = new Product(productName.getText(), productPrice.getText());
        expected.verifyProduct(actual);
    }

    public static void verifyProductInformation(InformationDetails expectedInfo) {
        InformationDetails actualInfo = new InformationDetails(infoDimensions.getText(),
                infoWheelbase.getText(), infoRoadClearance.getText(), infoSeatHeight.getText()
                , infoCurbMass.getText(), infoFuelTankCapacity.getText(), infoFuelConsumption.getText(),
                infoWarranty.getText());
        expectedInfo.verifyInformationProduct(actualInfo);
    }


    public static void clickBtnSearch() {
    }
}

