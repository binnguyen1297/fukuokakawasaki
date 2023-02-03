package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    final static int ELEMENT_TIME_OUT = 15;
    static WebDriverWait wait = new WebDriverWait(DriverHelper.getDriver(), Duration.ofSeconds(5));

    public static void waitForElementAppear(By elementLocator) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(elementLocator, 0));
    }
    public static void waitForElementDisappear(By elementLocator){
        wait.until(ExpectedConditions.numberOfElementsToBe(elementLocator, 0));
    }
    public static void waitForElementClickable(By elementLocator){
        wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
