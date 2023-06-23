package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerTransaction {
    WebDriver driver;

    @Given("I Openn browserrrr loyaltyy point")
    public void iOpennBrowserrrrLoyaltyyPoint() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Opeen websitee loyalty point")
    public void opeenWebsiteeLoyaltyPoint() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }

    @And("I Enterr a validd emaill andd password")
    public void iEnterrAValiddEmaillAnddPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("newPassword");
    }

    @And("I clickk siignn in buttonn")
    public void iClickkSiignnInButtonn() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("I click customer transaction")
    public void iClickCustomerTransaction() {
        driver.findElement(By.xpath("//span[@id='__chakra_env']")).click();
    }
}
