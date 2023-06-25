package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class AddStock extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By loginButton() {
        return By.xpath("//button[@id='signin']");
    }

    private By CreditData() {
        return By.xpath("//a[@id='button_navigate_stocks']");
    }

    private By Addstock() {
        return By.xpath("//button[@id='button_navigate_addStocks']");
    }

    @Step
    public void openPage() {
        open();
    }


    @Step
    public void inputEmaill(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputPasswordd(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButtonn() {
        $(loginButton()).click();
    }

    @Step
    public void ClickAddStock(){
        $(CreditData()).click();
    }

    @Step
    public void ClickAddCredit(){
        $(Addstock()).click();
    }


}
