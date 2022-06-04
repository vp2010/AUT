package stepdefinition.web.assessment;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class hooverstate {

    @Given("<url>")
    public void url() {
    }

    @When("I type my <credentials>")
    public void iTypeMyCredentials() {
    }

    @And("I click [Log in]")
    public void iClickLogIn() {
    }

    @Then("I am logged into the {string}")
    public void iAmLoggedIntoThe(String arg0) {
    }

    @When("I search for a customer by {String} {string}")
    public void iSearchForACustomerByVinXXGTLKG(int arg0, int arg1, int arg2, int arg3) {
    }

    @But("no contracts correspond to that VIN")
    public void noContractsCorrespondToThatVIN() {
    }

    @Then("a {string} is available renders")
    public void aIsAvailableRenders(String arg0) {
    }

    @And("I can select the following products:")
    public void iCanSelectTheFollowingProducts() {
    }

    @Given("I have a sell contract for {vin} {string}")
    public void iHaveASellContractForVinXXGTLKG(int arg0, int arg1, int arg2, int arg3) {
    }

    @And("I have the following customer information:")
    public void iHaveTheFollowingCustomerInformation() {
    }

    @When("I select a {string}")
    public void iSelectA(String arg0) {
    }


    @And("I type a {string}")
    public void iTypeARONumber() {
    }

    @And("I click [sell]")
    public void iClickSell() {
    }

    @Then("a {string} modal pops-up")
    public void aModalPopsUp(String arg0) {
    }

    @And("I can confirm the {string} {string} {string} & {string} information")
    public void iCanConfirmTheServiceDescriptionRedeemedAvailablePriceInformation(String arg0,String arg1,String arg2,String arg3) {
    }

    @Given("I have sold a {string} contract for {string} {string}")
    public void iHaveSoldAContractForVinXXGTLKG(String arg0, int arg1, int arg2) {
    }

    @And("the {string} modal currently displays")
    public void theSaleSuccessfulModalCurrentlyDisplays() {
    }

    @When("I select the checkbox for {string}")
    public void iSelectTheCheckboxFor(String arg0) {
    }

    @And("I click [Redeem]")
    public void iClickRedeem() {
    }

    @Then("the {string} modal appears")
    public void theModalAppears(String arg0) {
    }

    @And("I can confirm I have {string}")
    public void iCanConfirmIHave(String arg0) {
    }

    @And("I can confirm I am {string}")
    public void iCanConfirmIAm(String arg0) {
    }

    @And("I click [No, sell contract without redemption]")
    public void iClickNoSellContractWithoutRedemption() {
    }

    @Then("I am returned to the {string}")
    public void iAmReturnedToThe(String arg0) {
    }

    @Given("I have redeemed a product")
    public void iHaveRedeemedAProduct() {
    }

    @And("the {string} modal is displaying")
    public void theModalIsDisplaying(String arg0) {
    }

    @When("I click [OK]")
    public void iClickOK() {
    }

    @Given("the following search criteria:")
    public void theFollowingSearchCriteria(DataTable datatable) {

        var data = datatable.asList();
        data.get(1);
    }

    @When("I search by {string} and {string}")
    public void iSearchByFieldAndSearchString() {
    }

    @Then("I can locate contracts associated with {string}")
    public void iCanLocateContractsAssociatedWithJohnLocke() {
    }

    @But("there are no products associated with my search")
    public void thereAreNoProductsAssociatedWithMySearch() {
    }

    @Then("I will see {string}")
    public void iWillSeeReponse() {
    }

    @Given("I searched for {string} {string}")
    public void iSearchedForNameJohnLocke() {
    }

    @And("I confirm {int} contracts have been found")
    public void iConfirmContractsHaveBeenFound(int arg0) {
    }

    @When("I select the {string} contract")
    public void iSelectTheACDelcoSyntheticContract() {
    }

    @Then("{string} display")
    public void display(String arg0) {
    }

    @And("I can confirm {string} and {string} are available for redemption")
    public void iCanConfirmACDelcoSyntheticAndCarWashAreAvailableForRedemption() {
    }

    @And("I can confirm {string} has {int} Redeemed and {int} Available")
    public void iCanConfirmHasRedeemedAndAvailable(String arg0, int arg1, int arg2) {
    }

    @Given("I have selected {string}")
    public void iHaveSelectedACDelcoSynthetic() {
    }

    @And("{string} is displaying")
    public void isDisplaying(String arg0) {
    }

    @When("I select {string} as a {string} to redeem")
    public void iSelectCarWashAsAToRedeem(String arg0) {
    }

    @And("I type RO number as {string}")
    public void iTypeRONumberAsR(int arg0) {
    }

    @Then("I can confirm {string} has replaced the [redeem] button")
    public void iCanConfirmServiceRedeemedHasReplacedTheRedeemButton() {
    }

    @And("I can confirm {string} now shows {int} has been Redeemed")
    public void iCanConfirmCarWashNowShowsHasBeenRedeemed(int arg0) {
    }

    @And("I can confirm {string} now shows {int} are Available")
    public void iCanConfirmCarWashNowShowsAreAvailable(int arg0) {
    }

    @And("I can confirm {string} now shows in Redemption History with RO Number as {string}")
    public void iCanConfirmCarWashNowShowsInWithRONumberAsR(String arg0, String arg1) {
    }

    @When("I search for a customer by {string} {string}")
    public void iSearchForACustomerBy(String arg0, String arg1) {
    }

    @Given("I have a sell contract for {string} {string}")
    public void iHaveASellContractFor(String arg0, String arg1) {
    }
}
