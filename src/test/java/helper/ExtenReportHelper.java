package helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExtenReportHelper {
    static ExtentReports reports;
    static ExtentSparkReporter spark;
    static ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();
    static ThreadLocal<CountHelper> threadCount = new ThreadLocal<>();
    public static void initReport() {
        reports = new ExtentReports();
        spark = new ExtentSparkReporter("src/test/java/exercise/report/Report.html");
        reports.attachReporter(spark);
    }
    public static void createTestCase(String testCaseName) {
        ExtentTest test  = reports.createTest(testCaseName);
        threadLocal.set(test);
        CountHelper step = new CountHelper();
        threadCount.set(step);
    }
    public static void saveReport() {
        reports.flush();
    }
    public static void logStepInfo(String message) {
        String step = String.format("%s. %s", threadCount.get().getStep(), message);
        threadLocal.get().log(Status.INFO,step);
    }
    public static void logInfo(String message) {
        threadLocal.get().log(Status.INFO,"+ " + message);
    }
    public static void logPassStep(String message){
        threadLocal.get().log(Status.PASS, formatVerifyMessage(message));
    }
    public static void addScreenShotImage(Status status, String message) {
        String base64Image = "data:image/png;base64,"
                + ((TakesScreenshot) DriverHelper.getDriver()).getScreenshotAs(OutputType.BASE64);
        threadLocal.get().log(status,formatVerifyMessage(message), MediaEntityBuilder.createScreenCaptureFromPath(base64Image).build());
    }
    public static void logStepFail(String message){
        threadLocal.get().log(Status.FAIL, formatVerifyMessage(message));
    }
    private static String formatVerifyMessage(final String message){
        return String.format("&nbsp&nbsp&nbsp&nbsp+%s", message);
    }
}
