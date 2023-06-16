package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Logout {

    protected String url = "http://13.229.84.45";


    @Step("I set POST api endpoints logout")
    public String setPostApiEndpointsLogout() {
        return url + "/auth/logout";
    }

    @Step("I send POST HTTP request logout")
    public void sendPostApiEndpointsLogout() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjg5MzM2NjcyfQ.Osw2qVgEuZoYYr7nVWTQM1akDZ5NyUDw4J7G7FJtmpI")
                .post(setPostApiEndpointsLogout()).then().statusCode(200);
    }

    //negatif
    @Step("I send POST HTTP request logout2")
    public void sendPostHttpRequestsLogout2() {
        SerenityRest.given().get(setPostApiEndpointsLogout());
    }

    @Step("I receive valid HTTP response code 200 logout")
    public void receiveValidHttp200logout() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 401 logout")
    public void receiveValidHttp401logout() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
