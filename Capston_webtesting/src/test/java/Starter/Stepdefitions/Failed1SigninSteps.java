package Starter.Stepdefitions;

import Starter.Pages.Signin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Failed1SigninSteps {
    @Steps
    Signin loginPage;

    @Given("I am on the sign in page invalid account")
    public void onLoginPageInvalidAccount() {
        loginPage.openPage();
    }

    @When("I input email invalid account")
    public void inputEmailInvalidAccount() {
        loginPage.inputEmail("admin@@mail.com");
    }

    @And("I input password invalid account")
    public void inputPasswordInvalidAccount() {
        loginPage.inputPassword("bilibili");
    }

    @And("I click sign in invalid account")
    public void clickLoginInvalidAccount() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page invalid account")
    public void onTheHomePageInvalidAccount() {
        loginPage.errorMessageAppear();
    }
}

