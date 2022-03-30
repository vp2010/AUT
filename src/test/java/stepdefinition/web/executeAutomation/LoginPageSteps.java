package web.stepDefinition.executeAutomation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import web.pageObjects.executeAutomation.LoginPage;
import web.utility.Context;

import java.util.List;

public class LoginPageSteps {

    // assertion
    // do not create driver, elements

    private Context context;
    private LoginPage loginPage;
    private static String title; // can be updated as scneario context which holds data

    public LoginPageSteps(Context context) {
        this.context = context;
        loginPage = new LoginPage(this.context.getDriver());
    }


    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        context.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my0account");
    }

    @When("user verify page title")
    public void user_verify_page_title() {
        title = loginPage.getLoginPageTitle();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String args) {
        Assert.assertTrue(title.contains(args));
    }

    @Then("forgot password link should be displayed")
    public void forgot_password_link_should_be_displayed() {
        Assert.assertTrue(loginPage.isForgotPwdLinkExist());
    }

    // check following with EA
    @When("user login to account")
    public void user_login_to_account(DataTable dataTable) {
        // EA method with cucubmer upgrade
        var arg1 = dataTable.asList(String.class);
        loginPage.login(arg1.get(2), arg1.get(3));

        //my method
        List<String> args = dataTable.asList();
        System.out.println(args.get(1) + " --- " + args.get(2));
    }

    @Then("page title should not be {string}")
    public void page_title_should_not_be(String args) {
        Assert.assertFalse(title.contains(args));
    }



}
