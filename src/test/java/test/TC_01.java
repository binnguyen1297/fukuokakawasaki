package test;

import helper.ExtenReportHelper;
import org.testng.annotations.Test;
import page.ChooseProduct;
import page.SearchKawasaki;

public class TC_01 extends BaseTest {
    @Test
    public void KawasakiShop() {
        ExtenReportHelper.logStepInfo("Negative to website:" + URL);
        driver.get(URL);

        ExtenReportHelper.logStepInfo("Click on EngLish");
        kawasakiPage.clickOptionChangeLanguage();

        ExtenReportHelper.logStepInfo("Choose Product: " + product.getName());
        kawasakiPage.selectProduct(product);

        ExtenReportHelper.logStepInfo("Verify Product: " + product.getName() + "and" + product.getPrice());
        ChooseProduct.verifyProduct(product);

        ExtenReportHelper.logStepInfo("Click option Details");
        ChooseProduct.clickOptionDetails();

        ExtenReportHelper.logStepInfo("Verify Product Information");
        ChooseProduct.verifyProductInformation(informationDetails);

        ExtenReportHelper.logStepInfo("Click button Search");
        ChooseProduct.clickBtnSearch();

        ExtenReportHelper.logStepInfo("View information of new product ");
        SearchKawasaki.viewNewProduct();


    }
}
