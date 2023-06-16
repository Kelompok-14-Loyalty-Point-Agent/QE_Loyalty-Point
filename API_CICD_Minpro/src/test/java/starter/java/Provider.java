package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Provider {

    protected String url = "http://13.229.84.45/";

    // GET - Get list all providers
    @Step("I set GET api endpoints providers")
    public String setGETAPIEndpointsProviders() {
        return url + "providers";
    }

    @Step("I send GET HTTP request providers")
    public void sendGETGTTPRequestProviders() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProviders());
    }

    // GET - Get list all with wrong url
    @Step("I set GET api endpoints providers wrong")
    public String setGETAPIEndpointsProvidersWrong() {
        return url + "provider";
    }

    @Step("I send GET HTTP request providers wrong")
    public void sendGETHTTPRequestProvodersWrong() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProvidersWrong());
    }

    @Step("I receive valid HTTP response code 404 providers")
    public void receiveValidHTTP404providers() {
        restAssuredThat(response -> response.statusCode(404));
    }


    //GET - Get provider by ID

    @Step("I set GET api endpoints providers ID")
    public String setGETAPIEndpointsProvidersId() {
        return url + "providers/1";
    }

    @Step("I send GET HTTP request providers ID")
    public void sendGETHTTPRequestProviderId() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProvidersId());
    }

    @Step("I receive valid HTTP response code 200 providers")
    public void receiveValidHTTP200Providers(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get provider by invalid ID
    @Step("I set GET api endpoints provider invalid_id")
    public String setGETapiEndpointsProviderInvalid_id() {
        return url + "providers/7";
    }

    @Step("I send GET HTTP request provider invalid_id")
    public void sendGETHTTPRequestProviderInvalid_id() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETapiEndpointsProviderInvalid_id());
    }

}
