package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {
    WebDriver driver;

    @Given("I Open browser loyalty point")
    public void iOpenBrowserLoyaltyPoint() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Open website loyalty pointt")
    public void openWebsiteLoyaltyPointt() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
    }

    @And("I Enter a validd email and password")
    public void iEnterAValiddEmailAndPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
    }

    @Then("I click sign in button and succes")
    public void iClickSignInButton()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
        driver.close();
        driver.quit();
    }
}