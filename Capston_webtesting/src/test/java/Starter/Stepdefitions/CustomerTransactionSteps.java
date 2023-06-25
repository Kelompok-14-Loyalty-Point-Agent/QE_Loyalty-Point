package Starter.Stepdefitions;


import Starter.Pages.CustomerTransaction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CustomerTransactionSteps {
    @Steps
    CustomerTransaction customerTransaction;

    @Given("I am on the sign in pageeee")
    public void onnSignInPage() {
        customerTransaction.openPage();
    }

    @When("I inputttt emaill")
    public void inputtEmailll() {
        customerTransaction.inputtEmailll("admin@example.com");
    }

    @And("I inputtt passworddd")
    public void inputtPassworddd() {
        customerTransaction.inputtPassworddd("newPassword");
    }

    @And("I clickk sign innn")
    public void clickkSignInButtonnn() {
        customerTransaction.clickkSignInButtonnn();
    }

    @And("I click customer transaction")
    public void ClickCashout() {
        customerTransaction.ClickCashout();
    }

    @Then("I see the customer transaction history")
    public void ClickViewCustomerTransaction() {
        customerTransaction.ClickViewCustomerTransaction();
    }
}
