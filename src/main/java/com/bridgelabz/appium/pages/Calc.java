package com.bridgelabz.appium.pages;

import com.bridgelabz.appium.base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Calc extends Base {

    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    @CacheLookup
    private AndroidElement btn1;

    @AndroidFindBy(id = "result")
    private  AndroidElement result;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='+']")
    @CacheLookup
    private AndroidElement plusBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    @CacheLookup
    private AndroidElement btn2;

    public Calc() {}

    public Calc(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void add() {
        driver.findElement(By.xpath("//android.widget.Button[@index='3']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='3']")).click();
//        btn1.click();
//        plusBtn.click();
//        btn2.click();
        result.getText();
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "8");
        Boolean flag = driver.findElement((By.xpath(""))).isDisplayed();
        Assert.assertTrue(flag);
    }

    public void sub(){

    }
}

