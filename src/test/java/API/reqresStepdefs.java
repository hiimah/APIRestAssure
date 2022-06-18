package API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class reqresStepdefs {
    reqresin reqresin = new reqresin();

    // Action

    @And("user send PUT Update request to reqresin")
    public void putUpdate() {
        reqresin.putUpdate();
    }

    @And("user send POST login request to reqresin")
    public void postLogin() {
        reqresin.postLogin();
    }

    @And("user send GET Users request to reqresin")
    public void getUsers() {
        reqresin.getListUser();
    }

    @When("user send POST login request to reqresin with body json {string}")
    public void userSendPOSTLoginRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.postLoginWithParam(jsonPath);
    }

    @When("user send POST Register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() {
        reqresin.postRegister();
    }

    @When("user send POST login request with body {string}")
    public void userSendPOSTLoginRequestWithBody(String jsonPath) {
        reqresin.postLoginWithParam(jsonPath);
    }

    @When("user send POST register with body {string}")
    public void userSendPOSTRegisterWithBody(String regis) {
        reqresin.postregisterWithParam(regis);
    }
}
