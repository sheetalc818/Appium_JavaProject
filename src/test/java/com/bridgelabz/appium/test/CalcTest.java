package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.BaseClass;
import com.bridgelabz.appium.operation.CalcOperation;
import org.testng.annotations.Test;

public class CalcTest extends BaseClass {
    @Test
    public void performOperationsOnCalc(){
        CalcOperation calc = new CalcOperation(driver);
        calc.operationOnOnCalculator();
    }
}
