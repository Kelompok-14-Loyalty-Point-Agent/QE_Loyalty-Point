package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.automation.pages.LoginScreen;
import test.automation.pages.TransactionHistoryScreen;

public class TransactionHistorySteps {
    
    TransactionHistoryScreen transactionHistoryScreen = new TransactionHistoryScreen();
    
    @And("I click button transaction history tab")
    public void iClickButtonTransactionHistoryTab() {
        transactionHistoryScreen.clickTransactionHistory();
    }
    
    @Then("I click button history")
    public void iClickButtonHistory() {
        transactionHistoryScreen.clickButtonHistory();
    }

    //Scenario Outline: As a user i want to see the on process in transaction history

    @Then("I click button on process")
    public void iClickButtonOnProcess() {
        transactionHistoryScreen.clickButtonOnProcess();
    }
 
}