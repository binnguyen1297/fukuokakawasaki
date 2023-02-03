package page;

import helper.DriverHelper;
import helper.SoftHelper;
import model.NewProduct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchKawasaki {  public SearchKawasaki() {
    PageFactory.initElements(DriverHelper.getDriver(), this);
}
    @FindBy(xpath = "//div[contains(text(),'Kawasaki Ninja ]")
    private static WebElement linkNameNewProduct;
    public void verifyNewProduct(NewProduct newProduct){
        String actualNewProductName = linkNameNewProduct.getText();
        String expectedNewProductName = newProduct.getNameNewProduct();
        SoftHelper.assertEquals(actualNewProductName, expectedNewProductName);
    }
    public static void viewNewProduct(){
        linkNameNewProduct.click();
    }
}
