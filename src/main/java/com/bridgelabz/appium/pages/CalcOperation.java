package com.bridgelabz.appium.operation;

import com.bridgelabz.appium.base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CalcOperation {
    private AndroidDriver<AndroidElement> driver;

    @CacheLookup
    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    public AndroidElement digit1;

    @CacheLookup
    @AndroidFindBy(id = "result")
    public AndroidElement result;

    @CacheLookup
    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    public AndroidElement addBtn;

    @CacheLookup
    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    public AndroidElement clickOneDigit;

    @CacheLookup
    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    public AndroidElement equalBtn;

    public CalcOperation(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void operationOnOnCalculator(){
        digit1.click();
        addBtn.click();
        clickOneDigit.click();
        equalBtn.click();
        String actualResult = result.getText();
        Assert.assertEquals(actualResult, "2");
    }
}
