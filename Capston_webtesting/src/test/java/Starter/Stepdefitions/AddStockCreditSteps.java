package Starter.Stepdefitions;

import Starter.Pages.AddStock;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddStockCreditSteps {

    @Steps
    AddStock addStockCredit;

    @Given("I am on the sign in pagee")
    public void onSignInPage() {
        addStockCredit.openPage();
    }

    @When("I input emaill")
    public void inputEmaill() {
        addStockCredit.inputEmaill("admin@example.com");
    }

    @And("I input passwordd")
    public void inputPasswordd() {
        addStockCredit.inputPasswordd("newPassword");
    }

    @And("I click sign inn")
    public void clickSignIn() {
        addStockCredit.clickLoginButtonn();
    }

    @And("I Click stock Credit")
    public void CreditData() {
        addStockCredit.ClickAddStock();
    }

    @Then("I click add stock credit")
    public void ClickAddStockCredit() {
        addStockCredit.ClickAddCredit();
    }
}
