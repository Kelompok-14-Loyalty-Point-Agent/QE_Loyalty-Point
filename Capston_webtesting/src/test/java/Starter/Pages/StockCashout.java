package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StockCashout extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By loginButton() {
        return By.xpath("//button[@id='signin']");
    }

    private By StockCashoutt() {
        return By.xpath("//a[@id='button_navigate_cashout']");
    }

    private By ViewCashout() {
        return By.xpath("//a[@id='button_navigate_cashout']");
    }

    @Step
    public void openPage() {
        open();
    }


    @Step
    public void inputttEmailll(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputttPassworddd(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickkkSignInButtonnn() {
        $(loginButton()).click();
    }

    @Step
    public void ClickCashout(){
        $(StockCashoutt()).click();
    }

    @Step
    public void ClickViewCashout(){
        $(ViewCashout()).click();
    }
}
