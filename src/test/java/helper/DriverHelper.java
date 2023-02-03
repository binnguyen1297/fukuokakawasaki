package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverHelper {
    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
    public static void createWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        threadLocal.set(driver);
    }
    public static WebDriver getDriver() {
        return threadLocal.get();
    }
}
