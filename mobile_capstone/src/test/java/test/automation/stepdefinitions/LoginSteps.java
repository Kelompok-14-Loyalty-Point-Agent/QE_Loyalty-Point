package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    LoginScreen loginScreen = new LoginScreen();

    @Given("I am on the product list")
    public void iAmOnTheProductList() {
        loginScreen.isDisplayedHeaderProduct();
    }

    @When("I click button sign in")
    public void iClickButtonSignin() {
        loginScreen.clickButtonSignin();
    }


    @And("I input field email")
    public void iInputFieldEmailInLogin() throws InterruptedException {
        String email = "stevano" + "@gmail.com";
        loginScreen.inputFieldEmail(email);
    }


    @And("I input field password")
    public void iInputFieldPasswordInLogin() {
        loginScreen.inputFieldPassword("asukimak");
    }


    @And("I click button login")
    public void iClickButtonLogin() {
        loginScreen.clickButtonLogin();
    }

    @Then("I get the message")
    public void iGetThe(String result) {
        switch (result) {
            case "redirectHomepage":
                loginScreen.verifyHeaderProduct();
                break;
            case "alertButton":
                loginScreen.verifyAlertButton();
                break;
            case "passwordCanNotEmpty":
                loginScreen.verifyAlertPassword();
                break;
            default:
                loginScreen.verifyAlertEmail();
                break;
        }
    }
}