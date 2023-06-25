package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.RedeemBenefit;

public class RedeemBenefitSteps {

    @Steps
    RedeemBenefit redeemBenefit;

    //GET - Get Voucher
    @Given("I set GET api endpoints Voucher")
    public void setGETAPIEndpointsVoucher() {
        redeemBenefit.setGETAPIEndpointsVoucher();
    }

    @When("I send GET HTTP request voucher")
    public void sendGETHTTPRequestVoucher() {
        redeemBenefit.sendGETHTTPRequestVoucher();
    }

    //GET - Get By Id Voucher
    @Given("I set GET api endpoints Voucher By Id")
    public void setGETAPIEndpointsVoucherById() {
        redeemBenefit.setGETAPIEndpointsVoucherById();
    }

    @When("I send GET HTTP request Voucher By Id")
    public void sendGETHTTPRequestVoucherById() {
        redeemBenefit.sendGETHTTPRequestVoucherById();
    }

    @Then("I receive valid HTTP response code 200 voucher")
    public void receiveValidHTTP200Voucher() {
        redeemBenefit.receiveValidHTTP200Voucher();
    }
}
