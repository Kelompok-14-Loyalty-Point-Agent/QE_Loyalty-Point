package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import test.automation.hooks.AppiumHelper;
import test.automation.pageobject.BasePageObject;
import com.github.javafaker.Faker;

public class RegisterScreen extends BasePageObject {

    public String name = createRandomName();

    AppiumHelper helper = new AppiumHelper (getDriver());

    By buttonSkip() { 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Skip\"]");
    }

    By buttonCreateNewAccount() { 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Create a new account\"]");
    }

    By fieldFullName(){ 
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By fieldEmail(){ 
        return MobileBy.xpath("//android.widget.EditText[2]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.widget.EditText[3]");
    }

    By fieldConfrimPassword() { 
        return MobileBy.xpath("//android.widget.EditText[4]");
    }

    By buttonCreateAnAccount() { 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Create an Account\"]");
    }


    By fieldAlertTerjadiKesalahan(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Terjadi Kesalahan!\"]");
    }

    By fieldAlertServerGagal(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Server Gagal\"]");
    }

    @Step
    public void clickButtonCreateNewAccount(){ 
        click(buttonCreateNewAccount());
    }

    @Step
    public void clickButtonSkip(){ 
        click(buttonSkip());
    }

    @Step
    public void inputFullName(String fullname) {
        Faker faker = new Faker();
        name = faker.name().fullName();
        click(fieldFullName());
        clear(fieldFullName());
        onType(fieldFullName(), createRandomName());
    }

    @Step
    public void inputEmptyFullName(String fullname) {
        click(fieldFullName());
        clear(fieldFullName());
        sendKeys(fieldFullName(),fullname);
    }

    @Step
    public void inputEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        onType(fieldEmail(), createRandomName() + "@gmail.com");
    }

    @Step
    public void inputEmptyEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        sendKeys(fieldEmail(),email);
    }

    @Step
    public void inputPassword(String password){
        click(fieldPassword());
        clear(fieldPassword());
        sendKeys(fieldPassword(),password);
        helper.scrollDown();
    }

    @Step
    public void inputEmptyPassword(String password){
        click(fieldPassword());
        clear(fieldPassword());
        sendKeys(fieldPassword(),password);
        helper.scrollDown();
    }

    @Step
    public void inputConfrimPassword(String password){
        click(fieldConfrimPassword());
        clear(fieldConfrimPassword());
        sendKeys(fieldPassword(),password);
    }

    @Step
    public void inputEmptyConfrimPassword(String password){
        click(fieldConfrimPassword());
        clear(fieldConfrimPassword());
        sendKeys(fieldPassword(),password);
    }

    @Step
    public void inputCorrectFullName(String fullname) {
        click(fieldFullName());
        clear(fieldFullName());
        onType(fieldFullName(),fullname);
    }

    @Step
    public void inputEmailWithPassword(String email){
        click(fieldEmail());
        clear(fieldEmail());
        onType(fieldEmail(),email);
    }

    @Step
    public void inputPasswordWithEmail(String email){
        click(fieldPassword());
        clear(fieldPassword());
        onType(fieldPassword(),email);
    }

    @Step
    public void clickButtonCreateAnAccount(){ 
        helper.scrollDown();
        click(buttonCreateAnAccount());
    }

    @Step
    public void verifyAlertEmpty(){ 
        Assertions.assertTrue(find(fieldAlertTerjadiKesalahan()).isDisplayed());
    }

    @Step
    public void verifyAlertExistingAccount(){ 
        Assertions.assertTrue(find(fieldAlertServerGagal()).isDisplayed());
    }

    @Step
    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
