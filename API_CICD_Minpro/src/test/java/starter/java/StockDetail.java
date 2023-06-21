package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockDetail {

    protected String url = "https://3.0.59.152.nip.io/";

    //POST - Add new Stock Detail
    @Step("I set POST api endpoints Stock_detail")
    public String setPOSTAPIEndpointsStockDetail() {
        return url + "stocks/details";
    }

    @Step("I send POST HTTP request Stock_detail")
    public void sendPOSTHTTPRequestStockDetail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("stock_id", 7);
        requestBody.put("stock", 15);
        requestBody.put("price", 61000);
        requestBody.put("quantity", 100);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockDetail());
    }

    @Step("I receive valid HTTP response code 201 Stock_detail")
    public void receiveValidHTTP201StockDetail() {
        restAssuredThat(response -> response.statusCode(201));
    }

    //POST - Add new Stock Detail without stock id
    @Step("I send POST HTTP request stock_id")
    public void sendPOSTHTTPrequestStockId() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("stock_id", "");
        requestBody.put("stock", 15);
        requestBody.put("price", 61000);
        requestBody.put("quantity", 100);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockDetail());
    }

    //POST - Add new Stock Detail without key
    @Step("I send POST HTTP request key Stock_detail")
    public void sendPOSTHTTPRequestKeystockdetail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("", 6);
        requestBody.put("", 15);
        requestBody.put("", 61000);
        requestBody.put("", 100);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockDetail());
    }

    @Step("I receive valid HTTP response code 400 Stock_detail")
    public void receiveValidHTTP400StockDetail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //GET - Get All Stock Detail
    @Step("I set GET api endpoints Stock_detail")
    public String setGETAPIEndpoinstsStockDetail() {
        return url + "stocks/details";
    }

    @Step("I send GET HTTP request Stock_detail")
    public void sendGETHTTPRequestStockDetail() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpoinstsStockDetail());
    }

    @Step("I receive valid HTTP response code 200 Stock_detail")
    public void receiveGETHTTP200tsockDetail() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get list all Stock with invalid url
    @Step("I set GET api endpoints invalid url stock_detail")
    public String setGETAPIEndpointsInvalidUrl() {
        return url + "stocks/detail";
    }

    @Step("I send GET HTTP request invalid url stock_detail")
    public void sendGETHTTPRequestInvalidUrl() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsInvalidUrl());
    }

    @Step("I receive valid HTTP response code 404 stock_detail")
    public void receiveValidHTTP404StockDetail() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //PUT - Put update stock
    //Ganti url saat akan di run
    @Step("I set PUT api endpoints Stock_detail")
    public String setPUTEndpointsStockDetail() {
        return url + "stocks/details/5";
    }

    @Step("I send PUT HTTP request Update_stock")
    public void sendPUTHTTPRequestUpdate() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("stock", 12);
        requestBody.put("price", 75000);
        requestBody.put("quantity", 1000);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NjgzNzE4fQ.tBc0TAqa1iQlfMA_ta5bwN8OTIzsKyUYAYDlBjV1QBQ")
                .body(requestBody.toJSONString())
                .put(setPUTEndpointsStockDetail());
    }

    //PUT - Update stock without fill stock
    @Step("I send PUT HTTP request Update without stock")
    public void sendPUTHTTPrequestUpdateWithoutStock() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("stock", "");
        requestBody.put("price", 75000);
        requestBody.put("quantity", 100);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTEndpointsStockDetail());
    }

    //DELETE - Delete by id stock detail
    //Ganti url disaat akan di run
    @Step("I set DELETE api endpoints stock_detail")
    public String setDELETEAPIedpointsStockDetail() {
        return url + "stocks/details/9";
    }

    @Step("I send DELETE HTTP request stock_detail")
    public void sendDELETEHTTPRequestStockDetail() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .delete(setDELETEAPIedpointsStockDetail());
    }
}

