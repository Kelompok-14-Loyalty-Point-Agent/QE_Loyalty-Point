package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class FaqScreen extends BasePageObject {

    By buttonFAQ(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"FAQ\"]");
    }

    By fieldFAQ1(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"1. Apa itu Kredit Data?\"]");
    }

    //Scenario Outline: As a user i want to see the FAQ list

    @Step
    public void clickButtonFAQ(){
        click(buttonFAQ());
    }

    @Step
    public void clickFieldFAQ1(){
        click(fieldFAQ1());
    }

}
