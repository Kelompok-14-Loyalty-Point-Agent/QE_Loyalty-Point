package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Logout {

    protected String url = "https://3.0.59.152.nip.io";


    //POST - Logout User with valid credential
    //Ganti saat akan run
    @Step("I set POST api endpoints logout_user")
    public String setPostApiEndpointsLogoutUser() {
        return url + "/users/logout";
    }

    @Step("I send POST HTTP request logout_user")
    public void sendPostHttpRequestLogoutUser() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAsInJvbGUiOiJjdXN0b21lciIsImV4cCI6MTY4OTk0ODU2N30.HTigE-4HE3HTzh6zc-ARyCMKttT_0ZwMSbvOkC1gvVY")
                .post(setPostApiEndpointsLogoutUser()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 logout_User")
    public void receiveValidHttp200LogoutUser() {
        restAssuredThat(response -> response.statusCode(200));
    }



    // POST - Logout User with token expired
    @Step("I send POST HTTP request token user expired")
    public void sendPOSTHTTPRequestTokenExpired() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjIsInJvbGUiOiJjdXN0b21lciIsImV4cCI6MTY4OTUzNzA1MX0.uJ9IGqLLkx5jSiUL3yse9mAUwhfnw47qHwUKr-oCzRE")
                .post(setPostApiEndpointsLogoutUser()).then().statusCode(401);
    }

    @Step("I receive valid HTTP response code 401 logout_User")
    public void receiveValidHTTP401LogoutUser() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
