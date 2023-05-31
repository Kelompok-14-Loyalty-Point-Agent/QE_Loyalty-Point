package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;
import test.automation.pages.LoginScreen;

public class RegisterSteps {
    
    RegisterScreen registerScreen = new RegisterScreen();
    LoginScreen loginScreen = new LoginScreen();


    @And("I click text register")
    public void iClickTextRegister() {
        registerScreen.clickTextRegister();
    }

    @And("I input field fullname")
    public void iInputFieldFullname() {
        registerScreen.inputFieldFullName();
    }

    @And("I input field {string} email")
    public void iInputFieldEmail(String email) {
        registerScreen.inputEmail(email);
    }

    @And("I input field {string} password")
    public void iInputFieldPassword(String password) {
        registerScreen.inputPassword(password);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerScreen.clickButtonRegister();
    }

    @Then("I get {string} in register")
    public void iGet(String result) {
        switch (result) {
            case "redirectLogin":
                loginScreen.verifyHeaderProduct();
                break;
            case "emailCantEmpty":
                registerScreen.verifyAlertEmail();
                break;
            case "passwordCantEmpty":
                registerScreen.verifyAlertPassword();
                break;
            default:
                registerScreen.verifyAlertButton();
                break;
        }
}
}
