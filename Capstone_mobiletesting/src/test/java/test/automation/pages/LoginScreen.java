package test.automation.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Step;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import test.automation.hooks.AppiumHelper;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    public static AppiumDriver driver = null;
    AndroidDriver androidDriver = (AndroidDriver) driver;
    
    AppiumHelper helper = new AppiumHelper (getDriver());
    
    By landingpage(){ 
        return MobileBy.xpath("//android.view.View/android.view.View");
    }

    By loginpage(){ 
        return MobileBy.xpath("//android.widget.ScrollView");
    }
    
    By buttonSkip(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Skip\"]");
    }
    
    By buttonSignin(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign In\"]");
    }

    By fieldEmail(){ 
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.widget.EditText[2]");
    }

    By buttonForgot(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Forgot Password?\"]");
    }

    By fieldEmailForgot(){ 
        return MobileBy.xpath("//android.widget.EditText");
    }

    By buttonSend(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Send\"]");
    }

    By fieldVerifyCode(){ 
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By buttonVerify(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"verify\"]");
    }

    By fieldNewPassword(){ 
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By fieldNewConfirmPassword(){ 
        return MobileBy.xpath("//android.widget.EditText[2]");
    }

    By buttonSave(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    }

    By buttonGotoSignIn(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    }

    By buttonProfile(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"profile\n" + //
                "Tab 3 of 3\"]");
    }

    By buttonLogOut(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Log Out\"]");
    }



    // By buttonLogin(){ 
    //     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    // }

    By fieldAlertEmail(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email tidak tersedia\"]");
    }

    By fieldAlertPassword(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Password salah\"]");
    }

    By buttonAlert(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Terjadi Kesalahan!\"]");
    }

    // By headerProducts() { 
    //     return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    // }



    @Step
    public void clickButtonSkip(){
        click(buttonSkip());
    }
    
    @Step
    public void clickButtonSignin(){
        click(buttonSignin());
    }

    @Step
    public void inputFieldEmail(String email) {
        click(fieldEmail());
        sendKeys(fieldEmail(),email);
    }


    @Step
    public void inputFieldPassword(String password){
        click(fieldPassword());
        sendKeys(fieldPassword(),password);
        
    }
    
    @Step
    public void clickButtonSigninAtLoginForm(){
        helper.scrollDown();
        click(buttonSignin());
    }

    @Step
    public void isDisplayedLandingPage() { 
        isDisplayed(landingpage());
    }

    // public void clickButtonLogin(){ 
    //     click(buttonLogin());
    // }

    public void verifyAlertEmail(){ 
        Assertions.assertTrue(find(fieldAlertEmail()).isDisplayed());
    }

    public void verifyAlertPassword(){ 
        Assertions.assertTrue(find(fieldAlertPassword()).isDisplayed());

    }

    public void verifyAlertButton() { 
        Assertions.assertTrue(find(buttonAlert()).isDisplayed());
    }

    // public void verifyHeaderProduct(){
    //     Assertions.assertTrue(find(headerProducts()).isDisplayed());
    
    // }

    @Step
    public void clickButtonForgot(){
        click(buttonForgot());
    }

    @Step
    public void clickButtonSend(){
        click(buttonSend());
    }

    @Step
    public void inputFieldVerifyCode(String code) {
        click(fieldVerifyCode());
        sendKeys(fieldVerifyCode(),code);
    }

    @Step
    public void clickButtonVerify(){
        click(buttonVerify());
    }

    @Step
    public void InputFieldNewPassword(String password) {
        click(fieldNewPassword());
        sendKeys(fieldNewPassword(),password);
    }

    @Step
    public void InputFieldConfirmNewPassword(String password) {
        click(fieldNewConfirmPassword());
        sendKeys(fieldNewConfirmPassword(),password);
    }

    @Step
    public void clickButtonSave(){
        click(buttonSave());
    }

    @Step
    public void clickButtonGotoSignIn(){
        click(buttonGotoSignIn());
    }

    @Step
    public void clickButtonProfile(){
        click(buttonProfile());
    }

    @Step
    public void clickButtonLogOut(){
        click(buttonLogOut());
    }

}

