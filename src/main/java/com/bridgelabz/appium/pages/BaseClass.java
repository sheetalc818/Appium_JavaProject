package com.bridgelabz.appium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AndroidDriver driver = null;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9.0");
        //cap.setCapability("app","C:\\Users\\dell\\Documents\\QADevPrograms\\CFP_216Appium\\src\\main\\resources\\Flipkart-7.18.apk");
        cap.setCapability("appPackage","com.android.calculator2");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        System.out.println("Calculator Launch!!");
    }
}
