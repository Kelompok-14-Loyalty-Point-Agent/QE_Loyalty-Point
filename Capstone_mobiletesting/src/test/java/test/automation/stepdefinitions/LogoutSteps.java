package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.automation.pages.LoginScreen;

public class LogoutSteps {
    
    LoginScreen loginScreen = new LoginScreen();

    @And("I click button profile tab")
    public void iClickButtonProfileTab() {
        loginScreen.clickButtonProfile();
    }
    
    @Then("I click button log out")
    public void iClickButtonLogOut() {
        loginScreen.clickButtonLogOut();
    }
}
