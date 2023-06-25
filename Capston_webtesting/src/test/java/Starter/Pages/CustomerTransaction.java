package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CustomerTransaction extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By loginButton() {
        return By.xpath("//button[@id='signin']");
    }

    private By CustomerTransactionn() {
        return By.xpath("//a[@id='button_navigate_customerTransaction']");
    }

    private By ViewCustomerTransaction() {
        return By.xpath("//a[@id='button_navigate_customerTransaction']");
    }

    @Step
    public void openPage() {
        open();
    }


    @Step
    public void inputtEmailll(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputtPassworddd(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickkSignInButtonnn() {
        $(loginButton()).click();
    }

    @Step
    public void ClickCashout(){
        $(CustomerTransactionn()).click();
    }

    @Step
    public void ClickViewCustomerTransaction(){
        $(ViewCustomerTransaction()).click();
    }
}

