package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class CreditDataScreen extends BasePageObject {

    By buttonCreditData(){
        return MobileBy.xpath("//android.widget.ImageView[1]");
    }

    By buttonCredit(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Credit\"]");
    }

    By buttonData(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Data\"]");
    }

    By fieldPhoneNumber(){
        return MobileBy.xpath("//android.widget.EditText");
    }

    By button100000(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"100000\n" + //
                "Pay : Rp 102500\"]");
    }

    By button25GB(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"25 GB\n" + //
                "Pay : Rp 102500\"]");
    }

    By buttonBuy(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Buy\"]");
    }

    By dropdownChoosePayment(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Payment Method\n" + //
                "Choose Payment\"]");
    }

    By chooseBRI(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"BRI\"]");
    }

    By buttonPayNow(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    }

    By buttonDetailPoint(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Detail Point\"]");
    }

    By buttonDone(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Done\"]");
    }

    By fieldAlertTransaksi(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Berhasil Membuat Transaksi\"]");
    }

    @Step
    public void clickButtonCreditData(){
        click(buttonCreditData());
    }

    @Step
    public void clickButtonCredit(){
        click(buttonCredit());
    }

    @Step
    public void clickButtonData(){
        click(buttonData());
    }

    @Step
    public void inputFieldPhoneNumber(String number){
        click(fieldPhoneNumber());
        clear(fieldPhoneNumber());
        sendKeys(fieldPhoneNumber(),number);
    }

    @Step
    public void clickButton100000(){
        click(button100000());
    }

    @Step
    public void clickButton25GB(){
        click(button25GB());
    }

    @Step
    public void clickButtonBuy(){
        click(buttonBuy());
    }

    @Step
    public void clickDropdownChoosePayment(){
        click(dropdownChoosePayment());
    }

    @Step
    public void clickChooseBRI(){
        click(chooseBRI());
    }

    @Step
    public void clickButtonPayNow(){
        click(buttonPayNow());
    }

    @Step
    public void clickButtonDetailPoint(){
        click(buttonDetailPoint());
    }

    @Step
    public void clickButtonDone(){
        click(buttonDone());
    }

    public void verifyAlertTransaksi(){ 
        Assertions.assertTrue(find(fieldAlertTransaksi()).isDisplayed());
    }
}
