package Starter.Stepdefitions;

import Starter.Pages.SignOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignOutSteps {
    @Steps
    SignOut signOut;


    @Given("I am on the sign in page to test sign out")
    public void onLoginPage() {
        signOut.openPage();
    }

    @When("I input email to sign in")
    public void iinputEmail() {
        signOut.iinputEmail("admin@example.com");
    }

    @And("I input password to sign in")
    public void iinputPassword() {
        signOut.iinputPassword("newPassword");
    }

    @And("I click login to test sign out")
    public void cclickSignInButton() {
        signOut.cclickSignInButton();
    }

    @Then("I click sign out button and I am back on the sign in page")
    public void clickSignOutButton() {
        signOut.clickSignOutButton();
    }

}
