package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignOut extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By singinButton() {
        return By.xpath("//button[@id='signin']");
    }

    private By signoutButton() {
        return By.xpath("//button[@id='button_signOut']");
    }


    @Step
    public void openPage() {
        open();
    }


    @Step
    public void iinputEmail(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void iinputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void cclickSignInButton() {
        $(singinButton()).click();
    }

    @Step
    public void clickSignOutButton() {
        $(signoutButton()).click();
    }
}
