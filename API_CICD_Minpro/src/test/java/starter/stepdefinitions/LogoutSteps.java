package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Logout;

public class LogoutSteps {

    @Steps
    Logout logout;

    //positif

    @Given("I set POST api endpoints logout")
    public void setPostApiEndpointsLogout() {
        logout.setPostApiEndpointsLogout();
    }

    @When("I send POST HTTP request logout")
    public void sendPostHttpRequestLogout() {
        logout.sendPostApiEndpointsLogout();
    }

        @When("I send POST HTTP request logout2")
        public void sendPostHttpRequestsLogout2() {
            logout.sendPostHttpRequestsLogout2();
        }

    @Then("I receive valid HTTP response code 200 logout")
    public void receiveValidHttp200Logout() {
        logout.receiveValidHttp200logout();
    }
        @Then("I receive valid HTTP response code 401 logout")
        public void receiveValidHttp401Logout() {
            logout.receiveValidHttp401logout();
        }


}
