package model;

import helper.ExtenReportHelper;
import helper.SoftHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InformationDetails {
    String Dimensions;
    String Wheelbase;
    String RoadClearance;
    String SeatHeight;
    String CurbMass;
    String FuelTankCapacity;
    String FuelConsumption;
    String Warranty;



    public void verifyInformationProduct(InformationDetails actualInfo){
        ExtenReportHelper.logInfo("Verify information Of Dimensions");
        SoftHelper.assertEquals(actualInfo.getDimensions(),this.Dimensions);

        ExtenReportHelper.logInfo("Verify information Of Wheelbase");
        SoftHelper.assertEquals(actualInfo.getWheelbase(),this.Wheelbase);

        ExtenReportHelper.logInfo("Verify information Of RoadClearance");
        SoftHelper.assertEquals(actualInfo.getRoadClearance(),this.RoadClearance);

        ExtenReportHelper.logInfo("Verify information Of SeatHeight");
        SoftHelper.assertEquals(actualInfo.getSeatHeight(),this.SeatHeight);

        ExtenReportHelper.logInfo("Verify information Of CurbMass");
        SoftHelper.assertEquals(actualInfo.getCurbMass(),this.CurbMass);

        ExtenReportHelper.logInfo("Verify information Of FuelTankCapacity");
        SoftHelper.assertEquals(actualInfo.getFuelTankCapacity(),this.FuelTankCapacity);

        ExtenReportHelper.logInfo("Verify information Of FuelConsumption");
        SoftHelper.assertEquals(actualInfo.getFuelConsumption(),this.FuelConsumption);

        ExtenReportHelper.logInfo("Verify information Of Warranty");
        SoftHelper.assertEquals(actualInfo.getWarranty(),this.Warranty);
    }


}


