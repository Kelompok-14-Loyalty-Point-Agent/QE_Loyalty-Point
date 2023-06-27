// import io.appium.java_client.MobileBy;
// import io.appium.java_client.MobileElement;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import io.appium.java_client.android.AndroidDriver;
// import java.net.URL;
// import java.util.concurrent.TimeUnit;

// public class Dropdown {

//         private AndroidDriver<?> driver;        
    
//     // Initialize the driver
//             public Dropdown(AndroidDriver<?> driver) { // or WebDriver driver
//         this.driver = driver;

//             // Identify and click on the dropdown element
//             MobileElement dropdown = driver.findElementById("com.example.app:id/dropdown");
//             dropdown.click();
//             }

//             // Wait for the dropdown options to appear
//             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//             // Select the desired option from the dropdown
//             MobileElement option = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Option 1\")"));
//             option.click();

//             // Close the driver
//             driver.quit();
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }