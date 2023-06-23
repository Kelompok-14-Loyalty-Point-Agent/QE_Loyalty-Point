package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signout {
    WebDriver driver;
    @Given("i open browserr - logout")
    public void iOpenBrowserrLogout() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("i am on the home pagee - logout")
    public void iAmOnTheHomePageeLogout() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }

    @When("i input valid emaill - logout")
    public void iInputValidEmaillLogout() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
    }

    @And("i input valid passwordd - logout")
    public void iInputValidPassworddLogout() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("newPassword");
    }

    @And("i click sign in buttonn - logout")
    public void iClickSignInButtonnLogout() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("i click sign out")
    public void iClickSignOut() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-1h4exbx']")).click();
    }

    @Then("userr successfull logout and redirect to login page")
    public void userrSuccessfullLogoutAndRedirectToLoginPage() {
        driver.findElement(By.xpath("//img[@src='./Login-amico 1.svg']")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
