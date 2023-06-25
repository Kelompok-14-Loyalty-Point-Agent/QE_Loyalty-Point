package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class RedeemBenefit {

    protected String url = "https://3.0.59.152.nip.io/";

    //GET - Get Voucher
    @Step("I set GET api endpoints Voucher")
    public String setGETAPIEndpointsVoucher() {
        return url + "vouchers";
    }

    @Step("I send GET HTTP request voucher")
    public void sendGETHTTPRequestVoucher() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsVoucher());
    }

    //GET - Get By Id Voucher
    @Step("I set GET api endpoints Voucher By Id")
    public String setGETAPIEndpointsVoucherById() {
        return url + "vouchers/1";
    }

    @Step("I send GET HTTP request Voucher By Id")
    public void sendGETHTTPRequestVoucherById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsVoucherById());
    }
    @Step("I receive valid HTTP response code 200 voucher")
    public void receiveValidHTTP200Voucher() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
