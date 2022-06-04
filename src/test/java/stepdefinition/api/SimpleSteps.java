package stepdefinition.api;

import api.utility.APIContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
// kathik kk

public class SimpleSteps  {

    public static ResponseOptions<Response> response1;

    public static Response response;


    @Given("^I perform get operation for \"([^\"]*)\"$")
    public void iPerformGetOperationFor(String arg0) {
        response1 = APIContext.getResponse();
    }


    @And("^I perform GET for the post number \"([^\"]*)\"$")
    public  void iPerformGETForThePostNumber(String authorName) {

        assertThat( response.getBody().jsonPath().get("test") , hasItem("test"));
    }




    @Then("^I should see the author name as \"([^\"]*)\"$")
    public void iShouldSeeTheAuthorNameAs(String arg0) {
        API_Context.verifyContentInAnyOrder();

    }
}
