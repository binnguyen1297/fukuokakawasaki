package listener;

import com.aventstack.extentreports.Status;
import helper.ExtenReportHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ExtenReportHelper.createTestCase(result.getMethod().getMethodName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ExtenReportHelper.addScreenShotImage(Status.FAIL, "");
    }
    @Override
    public void onStart(ITestContext context) {
        ExtenReportHelper.initReport();
    }
    @Override
    public void onFinish(ITestContext context) {
        ExtenReportHelper.saveReport();
    }
}


