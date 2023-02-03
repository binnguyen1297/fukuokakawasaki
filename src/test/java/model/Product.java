package model;

import helper.ExtenReportHelper;
import helper.SoftHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
    public String name;
    public String price;

    public Product() {

    }

    public void verifyProduct(Product actual){
        ExtenReportHelper.logInfo("Verify product name");
        SoftHelper.assertEquals(actual.getName(),this.name);

        ExtenReportHelper.logInfo("Verify product price");
        SoftHelper.assertEquals(actual.getPrice(),this.price);
    }
}
