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
    
    LoginScreen loginScreen = new LoginScreen();
    RegisterScreen registerScreen = new RegisterScreen();

    //Scenario Outline: As a user i want to register account with valid data//

    @Given("I am on the get point page")
    public void iAmOnTheLandingPage() {
        registerScreen.clickButtonSkip();
    }

    @When("I click button create a new account")
    public void iClickButtonCreateNewAccount() {
        registerScreen.clickButtonCreateNewAccount();
    }

    @And("I input correct fullname in register")
    public void iInputFieldFullname() {
        registerScreen.inputFullName("steven jatmiko");
    }

    @And("I input correct email in register")
    public void iInputFieldEmail() {
        registerScreen.inputEmail("steven@jatmiko.com");
    }

    @And("I input correct password in register")
    public void iInputFieldPassword() {
        registerScreen.inputPassword("123");
    }

    @And("I input correct confirm password in register")
    public void iInputFieldConfirmPassword() {
        registerScreen.inputPassword("123");
    }

    @Then("I click create an account button")
    public void iClickCreateAnAccountButton() {
        registerScreen.clickButtonCreateAnAccount();
    }

    //Scenario Outline: As a user i want to register account without input fullname//

    @And("I input empty fullname in register")
    public void iInputEmptyFullname() {
        registerScreen.inputEmptyFullName("");
    }

    @Then("I get result the error message in register")
    public void iGetTheEmptyFullname() {
        registerScreen.verifyAlertEmpty();
                    
    }

    //Scenario Outline: As a user i want to register account without input email//

    @And("I input empty email in register")
    public void iInputEmptyEmail() {
        registerScreen.inputEmptyEmail("");
    }

    //Scenario Outline: As a user i want to register account without input password//

    @And("I input empty password in register")
    public void iInputEmptyPassword() {
        registerScreen.inputEmptyPassword("");
    }

    //Scenario Outline: As a user i want to register account without input confirm password//

    @And("I input empty confirm password in register")
    public void iInputEmptyConfrimPassword() {
        registerScreen.inputEmptyConfrimPassword("");
    }

//     //Scenario Outline: As a user i want to register account with invalid email data//

    @And("I input invalid email in register")
    public void iInputInvalidEmail() {
        registerScreen.inputEmail("awikwok.go.co.long");
    }

    //Scenario Outline: As a user i want to register account with existing account//

    @And("I input existing account email in register")
    public void iInputExistingAccountEmail() {
        registerScreen.inputEmail("123@gmail.com");
    
    }
    @Then("I get result server gagal message in register")
    public void iGetTheServerGagalEmail() {
        registerScreen.verifyAlertExistingAccount();
                    
    }

    //Scenario Outline: As a user i want to register account but fill the email with password and fill the password with email//

    @And("I input fullname in register")
    public void iInputCorrectFullname() {
        registerScreen.inputCorrectFullName("123");
    }

    @And("I input email with password")
    public void iInputEmailWithPassword() {
        registerScreen.inputEmailWithPassword("123");
    }

    @And("I input password with email")
    public void iInputPasswordWithEmail() {
        registerScreen.inputPasswordWithEmail("123@gmail.com");
    }

    //Scenario Outline: As a user i want to register account but fill the email field with fullname

    @And("I input email with fullname")
    public void iInputEmailWithFullname() {
        registerScreen.inputEmail("Steven");
    }

    //Scenario Outline: As a user i want to register account without fill any field
}
