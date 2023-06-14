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

    // @Then("I should be redirected to product list")
    // public void validateRegisterSuccess() {
    //     loginScreen.isDisplayedHeaderProduct();
                    
    // }

//     //Scenario Outline: As a user i want to register account with invalid fullname//

//     @And("I input invalid fullname in register")
//     public void iInputInvalidFieldFullname() {
//         registerScreen.inputEmptyFullName("");
//     }

//     @Then("I get result empty fullname message in register")
//     public void iGetTheEmptyFullnameEmail() {
//         registerScreen.verifyAlertFullname();
                    
//     }

//     //Scenario Outline: As a user i want to register account with invalid email//

//     @And("I input invalid email in register")
//     public void iInputInvalidFieldEmail() {
//         registerScreen.inputEmptyEmail("");
//     }

//     @Then("I get result empty email message in register")
//     public void iGetTheEmptyEmail() {
//         registerScreen.verifyAlertEmail();
                    
//     }

//     //Scenario Outline: As a user i want to register account with invalid password//

//     @And("I input invalid password in register")
//     public void iInputInvalidFieldPassword() {
//         registerScreen.inputEmptyPassword("");
//     }

//     @Then("I get result empty password message in register")
//     public void iGetTheEmptyPassword() {
//         registerScreen.verifyAlertPassword();
                    
//     }

//     // //Scenario Outline: As a user i want to register account without using email//

//     // @And("I not input email in register")
//     // public void iInputEmptyFieldEmail() {
//     //     registerScreen.inputEmail("");
    
//     // }
//     // @Then("I get result empty email message in register")
//     // public void iGetTheEmptyEmail() {
//     //     registerScreen.fieldAlertEmail();
                    
//     // }
   
}
