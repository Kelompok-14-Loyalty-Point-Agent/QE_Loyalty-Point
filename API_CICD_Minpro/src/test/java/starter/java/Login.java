package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Login {

    protected String url = "http://13.229.84.45";


    @Step("I set POST api endpoints login")
    public String setPostApiEndpointLogin() {
        return url + "/users/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@example.com");
        requestBody.put("fullname", "rinijaya");
        requestBody.put("password", "steven123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    ///NEGATIFFF

    @Step("I send POST HTTP request login1")
    public void sendPostHttpRequestLogin1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "steven@gmail.com");
        requestBody.put("fullname", "admin");
        requestBody.put("password", "steven1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", " ");
        requestBody.put("fullname", "admin");
        requestBody.put("password", "steven123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("fullname", "admin");
        requestBody.put("password", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put(" ", " ");
        requestBody.put(" ", " ");
        requestBody.put(" ", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", " ");
        requestBody.put("fullname", " ");
        requestBody.put("password", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        restAssuredThat(response -> response.statusCode(400));
    }

}