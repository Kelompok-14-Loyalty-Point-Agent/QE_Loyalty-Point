package Starter.Stepdefitions;

import Starter.Pages.EditProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EditProfileSteps {
    @Steps
    EditProfile editProfile;


    @Given("I am onn the sign in page")
    public void onLoginPage() {
        editProfile.openPage();
    }

    @When("I iinput email")
    public void inputEmail() {
        editProfile.inputEmail("admin@example.com");
    }

    @And("I iinput password")
    public void inputPassword() {
        editProfile.inputPassword("newPassword");
    }

    @And("I click sign in button")
    public void clickSignInButton() {
        editProfile.clickSignInButton();
    }

    @And("I click button profile")
    public void clickProfileButton() {
        editProfile.clickProfileButton();
    }

    @And("I enter on nama lengkap")
    public void inputNamaLengkap() {
        editProfile.inputNamaLengkap("admin");
    }

    @And("I enter on alamat")
    public void inputAlamat() {
        editProfile.inputAlamat("Banten");
    }

    @Then("I click save changes and success")
    public void clickSaveChangesButton() {
        editProfile.clickSaveChangesButton();
    }

}

