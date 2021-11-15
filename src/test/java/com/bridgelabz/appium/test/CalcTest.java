package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.Base;
import com.bridgelabz.appium.pages.Calc;
import org.testng.annotations.Test;

public class CalcTest extends Base {

    @Test(priority=0, description="Doing Calc operations")
    public void additionOperation() throws InterruptedException {
        Calc cal = new Calc(driver);
        cal.add();
    }
}

