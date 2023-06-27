package test.automation.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import test.automation.pages.CreditDataScreen;
import test.automation.pages.GetRewardScreen;
import test.automation.pages.LoginScreen;

public class GetRewardSteps {
    
    GetRewardScreen getRewardScreen = new GetRewardScreen();
    CreditDataScreen creditDataScreen = new CreditDataScreen();
    LoginScreen loginScreen = new LoginScreen();

    @And("I click button get reward")
    public void iClickButtonGetReward() {
        getRewardScreen.clickButtonGetReward();
    }

    @And("I choose cart phone balance")
    public void iChooseCartPhoneBalance() {
        getRewardScreen.clickCartPhoneBalance();
    }

    @And("I click button reedem your point")
    public void iClickButtonReedemYourPoint() {
        getRewardScreen.clickButtonReedemYourPoint();
    }

    //Scenario Outline: As a user i want to redeem phone balance reward but not input phone number

     @And("I input empty phone number")
    public void iInputEmptyPhoneNumber() {
        creditDataScreen.inputFieldPhoneNumber(" ");
    }

    @Then("I get result the error message in reedem")
    public void iGetTheErrorInReedem() {
        loginScreen.verifyAlertButton();
    
    }

    //Scenario Outline: As a user i want to redeem phone balance reward but point tidak cukup

    @Then("I get result poin tidak cukup message")
    public void iGetThePoinMessage() {
        getRewardScreen.verifyAlertPoinTidakCukup();
    }

    //Scenario Outline: As a user i want to redeem internet kuota reward

    @And("I choose cart internet kuota")
    public void iChooseCartInternetKuota() {
        getRewardScreen.clickCartInternetKuota();
    }

    //Scenario Outline: As a user i want to redeem internet kuota reward but not input phone number

    //Scenario Outline: As a user i want to redeem internet kuota reward but point tidak cukup
}
