package stepdefinitions.web.myTime;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import web.pageObjects.myTime.HomePage;
import web.utility.Context;

public class HomePageSteps {

    HomePage homePage;

    public HomePageSteps() {

        homePage = Context.getPageObjManager().getHomePage();
    }

    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        Assert.assertTrue(homePage.isTitleDisplayed());
    }

    @When("^user search for \"([^\"]*)\" in \"([^\"]*)\"$")
    public void userSearchForHaircutInSanFranciscoCA(String category, String location) {
        homePage.selectCategory(category);
        homePage.selectLocation(location);
        homePage.clickSearch();
    }

    @Then("^verify that multiple results are shown - at least (\\d+)$")
    public void verifyThatMultipleResultsAreShownAtLeast(int arg0) {
        Assert.assertTrue(homePage.resultList(arg0));
    }

    @Then("^user selects business with name \"([^\"]*)\"$")
    public void userSelectsBusinessWithNameTestSabreCuts(String name) {
        homePage.selectBusiness(name);
    }


}
