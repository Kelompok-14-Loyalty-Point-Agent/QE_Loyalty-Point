package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Signin extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By singinButton() {
        return By.xpath("//button[@id='signin']");
    }



    private By errorMessage() {
        return By.xpath("//p[@class='chakra-text css-6p70ai']");
    }

    private By errorMessagee() {
        return By.xpath("//p[.='Required']");
    }

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
    public void clickLoginButton() {
        $(singinButton()).click();
    }


    @Step
    public void errorMessageAppear() {
        $(errorMessage()).isDisplayed();
    }

    @Step
    public void errorMessageAppearr() {
        $(errorMessagee()).isDisplayed();
    }
}

