package com.bridgelabz.appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchCalc {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9.0");
        //cap.setCapability("app","C:\\Users\\dell\\Documents\\QADevPrograms\\CFP_216Appium\\src\\main\\resources\\Flipkart-7.18.apk");
        cap.setCapability("chromedriverExecutable","C:\\Users\\dell\\Documents\\QADevPrograms\\CFP_216Appium\\src\\main\\resources\\chromedriver.exe");
        cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        //cap.setCapability("appPackage","com.android.calculator2");
        //cap.setCapability("appActivity","com.android.calculator2.Calculator");


        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("nav-search-keywords")).sendKeys("Iphone13");

//        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//        System.out.println("Result : "+result);
    }
}
