package test.automation.hooks;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.TouchAction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class AppiumHelper {

    private AndroidDriver<?> driver; // or WebDriver driver;

    // Constructor
    public AppiumHelper(AndroidDriver<?> driver) { // or WebDriver driver
        this.driver = driver;
    }

    public void scrollDown() {
        Dimension size = driver.manage().window().getSize();
        int start = (int) (size.height * 0.5);
        int end = (int) (size.height * 0.1);
        int x = (int) (size.width * 0.5);

        TouchAction<?> action = new TouchAction<>(driver);
        action.press(PointOption.point(x, start))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(x, end))
                .release()
                .perform();
    }

    public void wait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
      	}
	}

}