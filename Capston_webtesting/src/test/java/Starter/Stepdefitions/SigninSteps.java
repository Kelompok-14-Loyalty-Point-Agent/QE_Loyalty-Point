package Starter.Stepdefitions;

import Starter.Pages.Signin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SigninSteps {
    @Steps
    Signin loginPage;


    @Given("I am on the sign in page")
    public void onLoginPage() {
        loginPage.openPage();
    }

    @When("I input email")
    public void inputEmail() {
        loginPage.inputEmail("admin@example.com");
    }

    @And("I input password")
    public void inputPassword() {
        loginPage.inputPassword("newPassword");
    }

    @Then("I click sign in to dashboard")
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

}

