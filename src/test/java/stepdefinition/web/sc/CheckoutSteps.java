package stepdefinitions.web.sc;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.ProductPage;

import java.util.List;

public class CheckoutSteps extends BaseSteps{

    CheckoutPage checkoutPage;
    ProductPage productPage;

    public CheckoutSteps(){
        checkoutPage = pageObjectManager.getCheckoutPage();
        productPage = pageObjectManager.getProductPage();
    }

    @Then("^checkout page displays$")
    public void checkout_page_displays() {
        checkoutPage.isPageDisplayed();
    }

    @Then("^user verifies item in cart$")
    public void user_verifies_item_in_cart(){
        checkoutPage.verifyItemInCart( productPage.getItemList());
      //  checkoutPage.verifyItemPriceInCart( productPage.getPriceList());
    }

    @Then("^user removes following items from cart$")
    public void user_removes_following_items_from_cart(DataTable arg1)  {
        List<String> itemsToRemove  = arg1.asList(String.class);
        itemsToRemove.stream().forEach( e-> checkoutPage.removeItem( e )  );

        itemsToRemove.stream().forEach( e->productPage.removeItemfromProductList(e));
    }

    @Then("^user continue shopping$")
    public void user_continue_shopping() {
        checkoutPage.continueShopping();
    }


    @Then("^user verifies total price$")
    public void user_verifies_total_price(){
        checkoutPage.verifyItemPriceInCart();

    }

    @Then("^user proceed to checkout$")
    public void user_proceed_to_checkout()  {
        checkoutPage.checkout();
    }

    @Then("^user fills user information$")
    public void user_fills_information()  {
        checkoutPage.fillUserDetails();
    }

    @And("^user click finish$")
    public void user_click_finish()  {
        checkoutPage.clickFinish();
    }

}
