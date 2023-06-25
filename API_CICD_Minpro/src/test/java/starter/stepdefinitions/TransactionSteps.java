package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Transaction;

public class TransactionSteps {

    //POST = Post add new transaction
    @Steps
    Transaction transaction;

    @Given("I set POST api endpoints Transaction")
    public void setPOSTAPIEndpointsTransation() {
        transaction.setPOSTAPIEndpointsTransation();
    }

    @When("I send POST HTTP request Transaction")
    public void sendPOSTHTTPrequestTransaction() {
        transaction.sendPOSTHTTPrequestTransaction();
    }

    //POST - Post add new transaction By Id
    @Given("I set POST api endpoints Transaction_ById")
    public void setPOSTAPIEndpointsTransactionById() {
        transaction.setPOSTAPIEndpointsTransactionById();
    }

    @When("I send POST HTTP request Transaction_ById")
    public void sendPOSTHTTPrequestTransactionById() {
        transaction.sendPOSTHTTPrequestTransactionById();
    }

    @Then("I receive valid HTTP response code 201 Transaction")
    public void receiveValidHTTP201Transaction() {
        transaction.receiveValidHTTP201Transaction();
    }

    //GET - Get All User Id ( Transaction history )
    @Given("I set GET api endpoints All user id_history")
    public void setGETAPIEndpointsAllUserId() {
        transaction.setGETAPIEndpointsAllUserId();
    }

    @When("I send GET HTTP request All user id_history")
    public void sendGETHTTPRequestAllUserId() {
        transaction.sendGETHTTPRequestAllUserId();
    }

    @Then("I receive valid HTTP response code 200 transaction")
    public void receiveValidHTTP200Transaction() {
        transaction.receiveValidHTTP200Transaction();
    }
}
