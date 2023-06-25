package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditProfile extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }
    private By singinButton() { return By.xpath("//button[@id='signin']");
    }
    private By profileButton() { return By.xpath("//button[@id='button_editProfile']");}

    private By namalengkapField() {
        return By.xpath("//input[@id='name']");
    }

    private By alamatField() { return By.xpath("//input[@id='address']");
    }
    private By savechangesButton() { return By.xpath("//button[@id='button_saveChanges']");}

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void inputEmail(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickSignInButton() {
        $(singinButton()).click();
    }

    @Step
    public void clickProfileButton() {
        $(profileButton()).click();
    }

    @Step
    public void inputNamaLengkap(String namalengkap) {
        $(namalengkapField()).type(namalengkap);
    }

    @Step
    public void inputAlamat(String alamat) {
        $(alamatField()).type(alamat);
    }

    @Step
    public void clickSaveChangesButton() { $(savechangesButton()).click();
    }

}

