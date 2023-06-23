package StarDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class stockCreditData {
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
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }
    @And("I Enterr a validd email and password")
    public void iEnterrAValiddEmailAndPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("newPassword");
    }

    @And("I clickk sign in buttonn")
    public void iClickkSignInButtonn() {
        driver.findElement(By.xpath("//button[@class='chakra-button css-q39o3o']")).click();
    }

    @And("I click stock credit or data")
    public void iClickStockCreditOrData() {
        driver.findElement(By.xpath("//span[@id='__chakra_env']")).click();
    }
    @And("I click add stock credit")
    public void iClickAddStockCredit()  {
        driver.findElement(By.xpath("//button[@class='chakra-button css-1tixose']")).click();
    }

    @And("I click add stock data")
    public void iClickAddStockData()  {
        driver.findElement(By.xpath("//button[@class='chakra-button css-1tixose']")).click();
    }

    @And("I click arrow")
    public void iClickArrow()  {
        driver.findElement(By.xpath("//div[@class='css-zkm6ol']")).click();
    }

    @Then("I click stock data in telkomsel")
    public void iClickStockDataInTelkomsel() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='Telkomsel']")).click();
    }
    @Then("I click stock data in XL")
    public void iClickStockDataInXl()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='XL']")).click();
    }
    @Then("I click stock data in smartfren")
    public void iClickStockDataInSmartfren()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='Smartfren']")).click();
    }
    @Then("I click stock data in indosat")
    public void iClickStockDataInIndosat()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='Indosat']")).click();
    }
    @Then("I click stock data in axis")
    public void iClickStockDataInAxis()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='Axis']")).click();
    }
    @Then("I click stock data in tri")
    public void iClickStockDataInTri()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[.='Tri / 3']")).click();
    }
}