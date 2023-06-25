package Starter.Stepdefitions;

import Starter.Pages.Signin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Failed3SigninSteps {
    @Steps
    Signin loginPage;

    @Given("I am on the sign in page wrong password")
    public void onLoginPageWrongPassword() {
        loginPage.openPage();
    }

    @When("I input email wrong password")
    public void inputEmailWrongPassword() {
        loginPage.inputEmail("someone@mail.com");
    }

    @And("I input password wrong password")
    public void inputPasswordWrongPassword() {
        loginPage.inputPassword("");
    }

    @And("I click sign in wrong password")
    public void clickLoginWrongPassword() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page wrong password")
    public void onTheHomePageWrongPassword() {
        loginPage.errorMessageAppearr();
    }
}
