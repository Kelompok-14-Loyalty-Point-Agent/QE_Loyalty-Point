package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Provider;

public class ProviderSteps {

    @Steps
    Provider provider;

    // GET - Get list all providers
    @Given("I set GET api endpoints providers")
    public void setGETAPIEndpointsProviders() {
        provider.setGETAPIEndpointsProviders();
    }

    @When("I send GET HTTP request providers")
    public void sendGETGTTPRequestProviders() {
        provider.sendGETGTTPRequestProviders();
    }

    // GET - Get list all with wrong url
    @Given("I set GET api endpoints providers wrong")
    public void setGETAPIEndpointsProvidersWrong() {
        provider.setGETAPIEndpointsProvidersWrong();
    }

    @When("I send GET HTTP request providers wrong")
    public void sendGETHTTPRequestProvodersWrong() {
        provider.sendGETHTTPRequestProvodersWrong();
    }

    @Then("I receive valid HTTP response code 404 providers")
    public void receiveValidHTTP404providers() {
        provider.receiveValidHTTP404providers();
    }


    @Then("I receive valid HTTP response code 200 providers")
    public void receiveValidHTTP200Providers() {
        provider.receiveValidHTTP200Providers();
    }

    //GET - Get provider by ID

    @Given("I set GET api endpoints providers ID")
    public void setGETAPIEndpointsProvidersId() {
        provider.setGETAPIEndpointsProvidersId();
    }

    @When("I send GET HTTP request providers ID")
    public void sendGETHTTPRequestProviderId() {
        provider.sendGETHTTPRequestProviderId();
    }

    //GET - Get provider by invalid ID
    @Given("I set GET api endpoints provider invalid_id")
    public void setGETapiEndpointsProviderInvalid_id() {
        provider.setGETapiEndpointsProviderInvalid_id();
    }

    @When("I send GET HTTP request provider invalid_id")
    public void sendGETHTTPRequestProviderInvalid_id() {
        provider.sendGETHTTPRequestProviderInvalid_id();
    }
}
