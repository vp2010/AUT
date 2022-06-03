package stepdefinitions.web.sc;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.PageObjManager;
import pageObjects.ProductPage;

import java.util.List;

public class ProductSteps extends BaseSteps{

    ProductPage productpage;

    public ProductSteps(){
        productpage = pageObjectManager.getProductPage();
    }


    @Given("^product page is displayed$")
    public void product_page_is_displayed() {
        Assert.assertTrue(productpage.verifyProductPage());
    }


    @Then("^user short item based on \"([^\"]*)\"$")
    public void user_short_item_based_on(String arg1) {
        productpage.sortItems(arg1);
    }

    @Then("^user selects following items to cart$")
    public void user_selects_following_items_to_cart(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       List<String> itemToSelect = arg1.asList(String.class);
       itemToSelect.stream().forEach(System.out::println);
       itemToSelect.stream().forEach( e -> productpage.addItem(e));
    }

    @Then("^user navigates to checkout page$")
    public void user_navigates_to_checkout_page() {
        productpage.navigateToCheckout();
    }



}
