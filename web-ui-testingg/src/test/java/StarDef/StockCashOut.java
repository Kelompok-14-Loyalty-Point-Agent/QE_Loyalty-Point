package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StockCashOut {
    WebDriver driver;

    @Given("I Opeenn browserrrr loyaltyy pointt")
    public void iOpeennBrowserrrrLoyaltyyPointt() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Opeen websiteee loyalty pointt")
    public void opeenWebsiteeeLoyaltyPointt() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
    }

    @And("I Enterrr a validd emaill andd passwordd")
    public void iEnterrrAValiddEmaillAnddPasswordd() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
    }

    @And("I clickkk siignn in buttonnn")
    public void iClickkkSiignnInButtonnn() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("I click stock cash out")
    public void iClickCustomerStockCashOut() {
        driver.findElement(By.xpath("//div[@class='css-yia7su']/div[@class='css-1k9efnl']")).click();
    }
}
