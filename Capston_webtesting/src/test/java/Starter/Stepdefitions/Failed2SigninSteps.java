package Starter.Stepdefitions;

import Starter.Pages.Signin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Failed2SigninSteps {
    @Steps
    Signin loginPage;

    @Given("I am on the login page wrong email")
    public void onLoginPageWrongEmail() {
        loginPage.openPage();
    }

    @When("I input email wrong email")
    public void inputEmailWrongEmail() {
        loginPage.inputEmail("p");
    }

    @And("I input password wrong email")
    public void inputPasswordWrongEmail() {
        loginPage.inputPassword("admin123");
    }

    @And("I click sign in wrong email")
    public void clickLoginWrongEmail() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page wrong email")
    public void onTheHomePageWrongEmail() {
        loginPage.errorMessageAppear();
    }
}

