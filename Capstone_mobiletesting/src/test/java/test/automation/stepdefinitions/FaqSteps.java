package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.automation.pages.FaqScreen;
import test.automation.pages.GetRewardScreen;
import test.automation.pages.LoginScreen;

public class FaqSteps {
    
    FaqScreen faqScreen = new FaqScreen();

    @And("I click button FAQ")
    public void iClickButtonFAQ() {
        faqScreen.clickButtonFAQ();
    }
    
    @And("I click field FAQ1")
    public void iClickFieldFAQ1() {
        faqScreen.clickFieldFAQ1();
    }
 
}
