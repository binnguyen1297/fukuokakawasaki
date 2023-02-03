package test;

import helper.ExtenReportHelper;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.ChooseProduct;
import page.KawasakiPage;

import java.net.InetAddress;

import static com.google.gson.internal.bind.TypeAdapters.URL;

public class TC_02 extends BaseTest {
    @Test
    public void verifyProduct() {
        ExtenReportHelper.logStepInfo("Negative to website:" + URL);
        driver.get(URL);

        ExtenReportHelper.logStepInfo("Click MotoCycle");
        introduceProduct.shopKawasaki();

        ExtenReportHelper.logStepInfo("Choose Product: " + product.getName());
        kawasakiPage.selectProduct(product);

        ExtenReportHelper.logStepInfo("fd");
        introduceProduct.setTxtFaceBook();
    }

}
