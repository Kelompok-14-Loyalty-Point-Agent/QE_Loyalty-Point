package Starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CustomerData extends PageObject {
    private By emailField() {
        return By.xpath("//input[@id='email']");
    }

    private By passwordField() {
        return By.xpath("//input[@id='password']");
    }

    private By loginButton() {
        return By.xpath("//button[@id='signin']");
    }

    private By CustomerDataa() {
        return By.xpath("//a[@id='button_navigate_customerData']");
    }

    private By seacrhField() {
        return By.xpath("//input[@id='search_customerData']");
    }

    @Step
    public void openPage() {
        open();
    }


    @Step
    public void inputEmailll(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputPassworddd(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickSignInButtonnn() {
        $(loginButton()).click();
    }

    @Step
    public void ClickCustomerData(){
        $(CustomerDataa()).click();
    }

    @Step
    public void ClickSearchCustomer(String search){
        $(seacrhField()).type(search);
    }
}
