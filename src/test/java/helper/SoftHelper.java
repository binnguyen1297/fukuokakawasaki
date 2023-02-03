package helper;

import com.aventstack.extentreports.Status;

public class SoftHelper {
    public static void assertEquals(String actual, String expected){
        if (actual.equals(expected)){
            ExtenReportHelper.logPassStep("Verify" + " " + expected + " " + "correct");
        }
        else {
            ExtenReportHelper.addScreenShotImage(Status.FAIL,"Verify" + " " + actual + " " +"incorrect" );
        }
    }
}
