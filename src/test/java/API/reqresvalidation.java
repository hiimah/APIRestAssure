package API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class reqresvalidation {
    // Validation

    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("response path {string} should contain Int value {int}")
    public void responseDataValidationInt(String path, int value) {
        restAssuredThat(response -> response.body(path, equalTo(value)));
    }

    @Then("^response path \"([^\"]*)\" should contain String value \"([^\"]*)\"$")
    public void responseDataValidationString(String path, String value) {
        restAssuredThat(response -> response.body(path, equalTo(value)));
    }

    @Then("^response structure should match json schema \"([^\"]*)\"$")
    public void validateJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @And("response body with jsonPath {string} must be string")
    public void responseBodyWithJsonPathMustBeString(String value) {
    }

    @And("response body with jsonPath {string}")
    public void responseBodyWithJsonPath(String require) {
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(require)));
    }

    @Then("response status should be {int}")
    public void responseStatusShouldBe(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("response body with jsonPath {string} and {string}")
    public void responseBodyWithJsonPathAnd(String arg0, String arg1) {

    }

    @And("response body should be equal with jsonSchema {string}")
    public void responseBodyShouldBeEqualWithJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
}
