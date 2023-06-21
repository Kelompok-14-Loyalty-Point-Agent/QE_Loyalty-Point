package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stockpulsa {
    WebDriver driver;
    @Given("I Opennn browserrr loyalty point")
    public void iOpennnBrowserrrLoyaltyPoint() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Openn websitee loyalty point")
    public void opennWebsiteeLoyaltyPoint() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
    }
    @And("I Enterr a validd email and password")
    public void iEnterrAValiddEmailAndPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
    }

    @And("I clickk sign in buttonn")
    public void iClickkSignInButtonn() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("I click stock credit or data")
    public void iClickStockCreditOrData() {
        driver.findElement(By.xpath("//p[@class='chakra-text css-1n95ar0']")).click();
    }
    @And("I click add stock credit")
    public void iClickAddStockCredit()  {
        driver.findElement(By.xpath("//button[@class='chakra-button css-1tixose']")).click();
    }

    @And("I click add stock data")
    public void iClickAddStockData()  {
        driver.findElement(By.xpath("//button[@class='chakra-button css-1tixose']")).click();
    }
}
