package Starter.Stepdefitions;

import Starter.Pages.CustomerData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CustomerDataSteps {
    @Steps
    CustomerData customerDataa;

    @Given("I am on the sign in pageee")
    public void onnSignInPage() {
        customerDataa.openPage();
    }

    @When("I inputtt emaill")
    public void inputEmailll() {
        customerDataa.inputEmailll("admin@example.com");
    }

    @And("I input passworddd")
    public void inputPassworddd() {
        customerDataa.inputPassworddd("newPassword");
    }

    @And("I clickk sign inn")
    public void clickSignInButtonnn() {
        customerDataa.clickSignInButtonnn();
    }

    @And("I click customer data")
    public void ClickCustomerData() {
        customerDataa.ClickCustomerData();
    }

    @Then("I click search customer")
    public void ClickSearchCustomer() {
        customerDataa.ClickSearchCustomer("customer");
    }
}

