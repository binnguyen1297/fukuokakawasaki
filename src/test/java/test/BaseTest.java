package test;

import helper.DriverHelper;
import model.InformationDetails;
import model.NewProduct;
import model.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import page.ChooseProduct;
import page.IntroduceProduct;
import page.KawasakiPage;
import page.SearchKawasaki;

public class BaseTest {
    public String URL = "https://www.kawasaki-motors.vn/";
    public WebDriver driver;

    public KawasakiPage kawasakiPage;
    public InformationDetails informationDetails;
    public ChooseProduct chooseProduct;

    public SearchKawasaki searchKawasaki;

    public Product product;

    public NewProduct newProduct;

    public IntroduceProduct introduceProduct;


    @Parameters({"environment"})

    @BeforeMethod
    public void beforeMethod(String env) {
        DriverHelper.createWebDriver();

        driver = DriverHelper.getDriver();

        kawasakiPage = new KawasakiPage();

        chooseProduct = new ChooseProduct();

        searchKawasaki = new SearchKawasaki();
        product = new Product();

    }

    @AfterMethod
    public void afteMethod() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
        }
    }
}
