package StarDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class register {

    WebDriver driver;
    @Given("I Open browserr")
    public void iOpenBrowserr() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @When("Open website alta-shopp")
    public void openWebsiteAltaShopp() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/auth/register");
        Thread.sleep(1000);
    }
    @When("user input valid name")
    public void userInputValidName() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("junidoardabilli");
    }

    @And("user input valid email")
    public void userInputValidEmail() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("junidoardabilly12@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("billy123");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

    @Then("user success to create account and redirect to login")
    public void userSuccessToCreateAccount() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-select__selections']")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @And("user input invalid email")
    public void userInputInvalidEmail() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("junidoardabilly12@@@gmail.com");
    }

    @And("user click register buttonn")
    public void userClickRegisterButtonn() {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

    @Then("user failed to create account")
    public void userFailedToCreateAccount() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-alert__wrapper']")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @And("user inputt invalid email")
    public void userInputtInvalidEmail() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("junidoardabilly12@@@gmail.com");
    }

    @And("user input invalid password empty fields")
    public void userInputInvalidPassword() {
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys(" ");
    }

    @And("user click registerr buttonn")
    public void userClickRegisterrButtonn() {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

}
