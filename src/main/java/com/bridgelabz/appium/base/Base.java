package com.bridgelabz.appium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AndroidDriver driver;
    @BeforeTest (description="Setup Android Webdriver")
    public void setUp() throws InterruptedException, MalformedURLException
    {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("appPackage","com.android.calculator2");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");

        Thread.sleep(2000);

        // RemoteWebDriver is a class that implements the WebDriver interface on the remote server.
        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Test passed Application lunched sucessfully");
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
