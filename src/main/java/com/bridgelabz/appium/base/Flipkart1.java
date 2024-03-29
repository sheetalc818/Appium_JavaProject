package com.bridgelabz.appium.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//http://appium.io/docs/en/writing-running-appium/tutorial/swipe/android-layout-direction/

public class Flipkart1 {
    public static AndroidDriver driver;

    @Test(description = "Setup Android Webdriver")
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("app", "C:\\Users\\dell\\Documents\\QADevPrograms\\AppiumMavenIntelij\\src\\main\\resources\\Flipkart-7.18.apk");
        cap.setCapability("appPackage", "com.flipkart.android");
        cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");

        // RemoteWebDriver is a class that implements the WebDriver interface on the remote server.
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Test passed Application lunched sucessfully");
        scroll();
    }

    public static void scroll(){
        ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"English\"))").click();

        driver.findElement(By.id("com.flipkart.android:id/select_btn")).click();
        //*[@text='Malayalam' and @id='com.flipkart.android:id/iv_checkbox']
    }
}