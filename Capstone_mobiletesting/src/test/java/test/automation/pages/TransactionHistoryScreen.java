package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class TransactionHistoryScreen extends BasePageObject {

    By buttonTransactionHistory(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"history transaction\n" + //
                "Tab 2 of 3\"]");
    }

    By buttonHistory(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"History\"]");
    }

    By buttonOnProcess(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"On Process\"]");
    }

    @Step
    public void clickButtonHistory(){
        click(buttonHistory());
    }

    @Step
    public void clickButtonOnProcess(){
        click(buttonOnProcess());
    }

    @Step
    public void clickTransactionHistory(){
        click(buttonTransactionHistory());
    }

}
