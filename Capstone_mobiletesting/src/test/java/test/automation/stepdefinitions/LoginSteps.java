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

    //Scenario Outline: As a user i want to login form my account//

    @Given("I am on the landing page")
    public void iAmOnTheLandingPage() {
        loginScreen.isDisplayedLandingPage();
    }

    @When("I click button skip")
    public void iClickButtonSkip() {
        loginScreen.clickButtonSkip();
    }

    @And("I click button sign in")
    public void iClickButtonSignin() {
        loginScreen.clickButtonSignin();
    }

    @And("I input correct email in login")
    public void iInputFieldEmailInLogin() {
        String email = "tes123" + "@gmail.com";
        loginScreen.inputFieldEmail(email);
    }

    @And("I input correct password in login")
    public void iInputFieldPasswordInLogin() {
        String password = "123";
        loginScreen.inputFieldPassword(password);
    }

    @Then("I click button login")
    public void iClickButtonLogin() {
        loginScreen.clickButtonSigninAtLoginForm();
    }
        
        
    //Scenario Outline: As a user i want to login with wrong password//
    
    @And("I input incorrect password in login")
    public void iInputIncorrectPasswordInLogin() {
        String password = "abcdef";
        loginScreen.inputFieldPassword(password);

    }

    @Then("I get result password salah message")
    public void iGetThePasswordSalah() {
        loginScreen.verifyAlertPassword();
    
    }

    //Scenario Outline: As a user i want to login with wrong email//

    @And("I input incorrect email in login")
    public void iInputIncorrectEmailInLogin() {
        String email = "stevano" + "@mail.com";
        loginScreen.inputFieldEmail(email);
    }

    @Then("I get result the error message")
    public void iGetTheError() {
        loginScreen.verifyAlertEmail();
    
    }

    //Scenario Outline: As a user i want to login with invalid email//

    @And("I input invalid email in login")
    public void iInputInvalidEmailInLogin() {
        String email = "stevano" + "mail.co.long";
        loginScreen.inputFieldEmail(email);
    }

    @Then("I get result the invalid message")
    public void iGetTheEmpty() {
        loginScreen.verifyAlertButton();
    
    }

    // Scenario Outline: As a user i want to login without input email

    @And("I input empty email in login")
    public void iInputEmptyEmailInLogin() {
        String email = "";
        loginScreen.inputFieldEmail(email);

    }

    //Scenario Outline: As a user i want to login without input password//
    
    
    @And("I input empty password in login")
    public void iInputEmptyPasswordInLogin() {
        String password = "";
        loginScreen.inputFieldPassword(password);

    }

    //Scenario Outline: As a user i want to login with valid data but forgot

    @And("I click button forgot password")
    public void iClickButtonForgotPassword() {
        loginScreen.clickButtonForgot();
    }

    @And("I input correct email in forgot")
    public void iInputFieldEmailInForgot() {
        String email = "tes123" + "@gmail.com";
        loginScreen.inputFieldEmail(email);
    }

    @And("I click button send")
    public void iClickButtonSend() {
        loginScreen.clickButtonSend();
    }

    @And("I input verify code")
    public void iInputFieldVerifyCode() {
        String code = "1234";
        loginScreen.inputFieldVerifyCode(code);
    }

    @And("I click button verify")
    public void iClickButtonverify() {
        loginScreen.clickButtonVerify();
    }

    @And("I input new password")
    public void iInputFieldNewPassword() {
        String password = "1234";
        loginScreen.InputFieldNewPassword(password);
    }

    @And("I input confirm new password")
    public void iInputFieldConfirmNewPassword() {
        String password = "1234";
        loginScreen.InputFieldConfirmNewPassword(password);
    }
    
    @And("I click button save")
    public void iClickButtonSave() {
        loginScreen.clickButtonSave();
    }

    @Then("I click button go to sign in")
    public void iClickButtonGoToSignIn() {
        loginScreen.clickButtonGotoSignIn();
    }

    //Scenario Outline: As a user i want to login with invalid email data but forgot

    @And("I input incorrect email in forgot")
    public void iInputIncorrectEmailInForgot() {
        String email = "awikwok" + "@gmail.com";
        loginScreen.inputFieldEmail(email);
    }
}

