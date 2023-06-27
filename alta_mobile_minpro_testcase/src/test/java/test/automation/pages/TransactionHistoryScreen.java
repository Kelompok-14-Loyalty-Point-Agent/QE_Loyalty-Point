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

    // By cartPhoneBalance(){
    //     return MobileBy.xpath("//android.view.View[@content-desc=\"Phone Balance\n" + //
    //             "Rp 10.000\n" + //
    //             "300\"]/android.widget.ImageView[1]");
    // }

    // By cartInternetKuota(){
    //     return MobileBy.xpath("//android.view.View[@content-desc=\"Internet Data\n" + //
    //             "1GB\n" + //
    //             "600\"]/android.widget.ImageView[1]");
    // }

    

    // By fieldAlertPoin(){
    //     return MobileBy.xpath("//android.view.View[@content-desc=\"Poin anda tidak cukup!\"]");
    // }

   

    // // By buttonBuy(){
    // //     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Buy\"]");
    // // }

    // // By dropdownChoosePayment(){
    // //     return MobileBy.xpath("//android.widget.ImageView[2]");
    // // }

    // // By chooseBRI(){
    // //     return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"BRI\"]");
    // // }

    // // By buttonPayNow(){
    // //     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    // // }

    // // By buttonDetailPoint(){
    // //     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Detail Point\"]");
    // // }

    // // By buttonDone(){
    // //     return MobileBy.xpath("//android.widget.Button[@content-desc=\"Done\"]");
    // // }


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

    // @Step
    // public void clickCartInternetKuota(){
    //     click(cartInternetKuota());
    // }

    // // @Step
    // // public void inputFieldPhoneNumber(String number){
    // //     click(fieldPhoneNumber());
    // //     clear(fieldPhoneNumber());
    // //     sendKeys(fieldPhoneNumber(),number);
    // // }

    // @Step
    // public void clickButtonReedemYourPoint(){
    //     click(buttonReedemyourPoint());
    // }

    // public void verifyAlertPoinTidakCukup(){ 
    //     Assertions.assertTrue(find(fieldAlertPoin()).isDisplayed());
    // }

    // // @Step
    // // public void clickButtonBuy(){
    // //     click(buttonBuy());
    // // }

    // // @Step
    // // public void clickDropdownChoosePayment(){
    // //     click(dropdownChoosePayment());
    // // }

    // // @Step
    // // public void clickChooseBRI(){
    // //     click(chooseBRI());
    // // }

    // // @Step
    // // public void clickButtonPayNow(){
    // //     click(buttonPayNow());
    // // }

    // // @Step
    // // public void clickButtonDetailPoint(){
    // //     click(buttonDetailPoint());
    // // }

    // // @Step
    // // public void clickButtonDone(){
    // //     click(buttonDone());
    // // }

}
