package page;

import helper.DriverHelper;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KawasakiPage {
    public KawasakiPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(),'ENGLISH')]")
    private WebElement optionEnglish;
    public void clickOptionChangeLanguage() {
        optionEnglish.click();
    }
    public void selectProduct(Product product) {
        String productLocator = String.format("//div[text()='%s']", product.getName());
        DriverHelper.getDriver().findElement((By.xpath(productLocator))).click();
    }
}
