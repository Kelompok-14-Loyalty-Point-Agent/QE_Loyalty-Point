package test.automation.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.xml.crypto.Data;

import io.cucumber.java.en.And;
import test.automation.pages.CreditDataScreen;
import test.automation.pages.LoginScreen;

public class CreditDataSteps {
    
    CreditDataScreen creditDataScreen = new CreditDataScreen();
    LoginScreen loginScreen = new LoginScreen();

    @And("I click button credit data")
    public void iClickButtonCreditData() {
        creditDataScreen.clickButtonCreditData();
    }

    @And("I input phone number")
    public void iInputPhoneNumber() {
        creditDataScreen.inputFieldPhoneNumber("081906045678");
    }

    @And("I click button credit")
    public void iClickButtonCredit() {
        creditDataScreen.clickButtonCredit();
    }

    @And("I click nominal in credit")
    public void iClickButtonNominalInCredit() {
        creditDataScreen.clickButton100000();
    }

    @And("I click buy")
    public void iClickButtonBuy() {
        creditDataScreen.clickButtonBuy();
    }

    @And("I click payment method")
    public void iClickChoosePaymentMethod() {
        creditDataScreen.clickDropdownChoosePayment();
    }

    @And("I choose BRI")
    public void iChooseBRI() {
        creditDataScreen.clickChooseBRI();
    }

    @And("I click pay now")
    public void iClickButtonPayNow() {
        creditDataScreen.clickButtonPayNow();
    }

    @And("I click detail point")
    public void iClickButtonDetailPoint() {
        creditDataScreen.clickButtonDetailPoint();
    }

    @And("I click done")
    public void iClickButtonDone() {
        creditDataScreen.clickButtonDone();
    }

    //Scenario Outline: As a user i want to Purchase Successful without input payment method

    @Then("I get result the error message in credit")
    public void iGetTheErrorInCredit() {
        creditDataScreen.verifyAlertTransaksi();
    
    }

    //Scenario Outline: As a user i want to Purchase Successful Data with input number

    @And("I click button data")
    public void iClickButtonData() {
        creditDataScreen.clickButtonData();
    }

    @And("I click nominal in data")
    public void iClickButtonNominalInData() {
        creditDataScreen.clickButton25GB();
    }
}
