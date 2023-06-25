package Starter.Stepdefitions;

import Starter.Pages.StockCashout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StockCasoutSteps {
    @Steps
    StockCashout stockCashout;

    @Given("I am on the signn in pageeee")
    public void onnSignInPage() {
        stockCashout.openPage();
    }

    @When("I inputttt emailll")
    public void inputttEmailll() {
        stockCashout.inputttEmailll("admin@example.com");
    }

    @And("I inputtt passwordddd")
    public void inputttPassworddd() {
        stockCashout.inputttPassworddd("newPassword");
    }

    @And("I clickk signn innn")
    public void clickkkSignInButtonnn() {
        stockCashout.clickkkSignInButtonnn();
    }

    @And("I click Stock Cashout")
    public void ClickCashout() {
        stockCashout.ClickCashout();
    }

    @Then("I see the Stock Cashout history")
    public void ClickViewCashout() {
        stockCashout.ClickViewCashout();
    }
}
