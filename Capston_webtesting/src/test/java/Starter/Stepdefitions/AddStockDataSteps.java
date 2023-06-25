package Starter.Stepdefitions;

import Starter.Pages.AddStock;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddStockDataSteps {
    @Steps
    AddStock addStockData;

    @Given("I am onn the sign in pagee")
    public void onnSignInPage() {
        addStockData.openPage();
    }

    @When("I inputt emaill")
    public void inputtEmaill() {
        addStockData.inputEmaill("admin@example.com");
    }

    @And("I inputt passwordd")
    public void inputtPasswordd() {
        addStockData.inputPasswordd("newPassword");
    }

    @And("I click sign innn")
    public void clickSignInn() {
        addStockData.clickLoginButtonn();
    }

    @And("I Click stock Data")
    public void CreditData() {
        addStockData.ClickAddStock();
    }

    @Then("I click add stock data")
    public void ClickAddStockCredit() {
        addStockData.ClickAddCredit();
    }
}

