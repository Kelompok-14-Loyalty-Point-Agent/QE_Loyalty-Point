package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Transaction {

    protected String url = "https://3.0.59.152.nip.io/";

    //POST = Post add new transaction
    @Step("I set POST api endpoints Transaction")
    public String setPOSTAPIEndpointsTransation() {
        return url + "transactions";
    }

    @Step("I send POST HTTP request Transaction")
    public void sendPOSTHTTPrequestTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "081382815860");
        requestBody.put("stock_details_id", 1);
        requestBody.put("payment_method", "shoope");
        requestBody.put("user_id", 5);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsTransation());
    }

    //POST - Post add new transaction By Id
    @Step("I set POST api endpoints Transaction_ById")
    public String setPOSTAPIEndpointsTransactionById() {
        return url + "vouchers/redeem";
    }

    @Step("I send POST HTTP request Transaction_ById")
    public void sendPOSTHTTPrequestTransactionById() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "082218807768");
        requestBody.put("user_id", 5);
        requestBody.put("voucher_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsTransactionById());
    }

    @Step("I receive valid HTTP response code 201 Transaction")
    public void receiveValidHTTP201Transaction() {
        restAssuredThat(response -> response.statusCode(201));
    }

    //GET - Get All User Id ( Transaction history )
    @Step("I set GET api endpoints All user id_history")
    public String setGETAPIEndpointsAllUserId() {
        return url + "transactions/users/2";
    }

    @Step("I send GET HTTP request All user id_history")
    public void sendGETHTTPRequestAllUserId() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsAllUserId());
    }

    @Step("I receive valid HTTP response code 200 transaction")
    public void receiveValidHTTP200Transaction() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
