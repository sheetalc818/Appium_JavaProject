package com.bridgelabz.appium.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Amazon {
    public static AndroidDriver driver;
    @Test(description="Setup Android Webdriver")
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("app","C:\\Users\\dell\\Documents\\QADevPrograms\\AppiumMavenIntelij\\src\\main\\resources\\Flipkart-7.18.apk");
        cap.setCapability("appPackage", "com.flipkart.android");
        cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");

        // RemoteWebDriver is a class that implements the WebDriver interface on the remote server.
        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Test passed Application lunched sucessfully");
        scrollIntoView("English");
        scrollDown();
    }

    public static void scrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public static void scrollIntoView(String Text){
        ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
    }
}
