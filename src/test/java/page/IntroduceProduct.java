package page;

import helper.DriverHelper;
import helper.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IntroduceProduct {
    public IntroduceProduct(WebElement txtMOTORCYCLE) {
        this.txtMOTORCYCLE = txtMOTORCYCLE;
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    @FindBy(id = "cat-1")
    private WebElement txtMOTORCYCLE;

    @FindBy(id = "nav-tab-16")
    private List <WebElement> txtZ;

    @FindBy(xpath = "(//img)[25]")
    private WebElement txtZ650ABS;

    @FindBy(css = "a[aria-label='VIEW SPECS & DETAILS for 2021 Z650 ABS']")
    private  WebElement btnVIEWSPECS;

    @FindBy(xpath = "(//*[name()=\'svg\'][@class=\'svg-inline--fa fa-facebook-f fa-w-9\'])[1]")
    private  WebElement txtFaceBook;
  public  void clickViewAll(){
      ElementHelper.waitForElementAppear((By) btnVIEWSPECS);
      ElementHelper.waitForElementClickable((By) btnVIEWSPECS);
      btnVIEWSPECS.click();
  }
  public void shopKawasaki(){
      
      ElementHelper.waitForElementAppear((By) txtMOTORCYCLE);
      ElementHelper.waitForElementClickable((By) txtMOTORCYCLE);
      txtMOTORCYCLE.click();
  }

    public void setTxtFaceBook(WebElement txtFaceBook) {
        this.txtFaceBook = txtFaceBook;
    }

    public void setTxtZ650ABS(WebElement txtZ650ABS) {
        this.txtZ650ABS = txtZ650ABS;
    }

}
