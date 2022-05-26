package com.bridgelabz.appium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Amazon1 {
    public static AndroidDriver driver;
    @Test(description="Setup Android Webdriver")
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("app","C:\\Users\\dell\\Documents\\QADevPrograms\\AppiumMavenIntelij\\src\\main\\resources\\amazon-shopping-22-21-2-100.apk");
        //cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
        //cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

        // RemoteWebDriver is a class that implements the WebDriver interface on the remote server.
        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Test passed Application lunched sucessfully");
    }
}

