package StarDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class profile {

    WebDriver driver;

    @Given("I Openn browserrrr loyalty point")
    public void iOpennBrowserrrr() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Opennn website loyalty pointt")
    public void opennnWebsiteLoyaltyPointt() throws InterruptedException {
        driver.get("https://frontend-desktop-dashboard.vercel.app/signin");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }

    @And("I Enterr a validd email andd password")
    public void iEnterrAValiddEmailAnddPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("newPassword");
    }

    @And("I clickk signn in buttonn")
    public void iClickkSignnInButtonn() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("I click profile button")
    public void iClickProfileButton() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-okmu2y']")).click();
    }
    @And("I input a valid nama lengkap alamat")
    public void iInputAInvalidNamaAlamatAndPassword() {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Andrew");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Jakarta");
    }
}
