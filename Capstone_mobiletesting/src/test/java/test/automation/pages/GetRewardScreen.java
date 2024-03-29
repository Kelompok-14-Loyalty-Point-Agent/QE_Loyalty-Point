package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class GetRewardScreen extends BasePageObject {

    By buttonGetReward(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Get Reward\"]");
    }

    By cartPhoneBalance(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Phone Balance\n" + //
                "Rp 10.000\n" + //
                "300\"]/android.widget.ImageView[1]");
    }

    By cartInternetKuota(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Internet Data\n" + //
                "1GB\n" + //
                "600\"]/android.widget.ImageView[1]");
    }

     By buttonReedemyourPoint(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Reedem your point\"]");
    }

    By fieldAlertPoin(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Poin anda tidak cukup!\"]");
    }

    @Step
    public void clickButtonGetReward(){
        click(buttonGetReward());
    }

    @Step
    public void clickCartPhoneBalance(){
        click(cartPhoneBalance());
    }

    @Step
    public void clickCartInternetKuota(){
        click(cartInternetKuota());
    }

    @Step
    public void clickButtonReedemYourPoint(){
        click(buttonReedemyourPoint());
    }

    public void verifyAlertPoinTidakCukup(){ 
        Assertions.assertTrue(find(fieldAlertPoin()).isDisplayed());
    }

}
