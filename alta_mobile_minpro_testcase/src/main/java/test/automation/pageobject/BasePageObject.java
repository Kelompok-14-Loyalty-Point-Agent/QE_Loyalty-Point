package test.automation.pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.automation.driver.AndroidDriverPool;
import test.automation.driver.DriverPool;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static test.automation.driver.AndroidDriverPool.driver;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 30, 1000);
    }

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public AndroidElement waitUntilPresence(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By locator){
        find(locator).click();
    }

    public void sendKeys(By locator, String input){
        find(locator).sendKeys(input);
    }

    public void onType(By by, CharSequence... keysToSend) {
        waitUntilPresence(by).sendKeys(keysToSend);
    }

    public void clear(By locator){
        find(locator).clear();
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    // public static void scrollDown(){
    //     Dimension dimension = AppDriver.getDriver().manage().window().getSize();
    //     int scrollStart = (int) (dimension.getHeight() * 0.5);
    //     int scrollEnd = (int) (dimension.getHeight() * 0.2);

    //     new TouchAction((PerformsTouchActions) AppDriver.getDriver())
    //             .press(PointOption.point(0, scrollStart))
    //             .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
    //             .moveTo(PointOption.point(0, scrollEnd))
    //             .release().perform();
    // }
}
