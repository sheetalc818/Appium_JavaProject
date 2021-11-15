package com.bridgelabz.appium.pages;

import com.bridgelabz.appium.base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class Calc extends Base {

    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    @CacheLookup
    private AndroidElement btn1;

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
        btn1.click();
        plusBtn.click();
        btn2.click();
    }
}

