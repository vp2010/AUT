package stepdefinition.web.executeAutomation;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import stepdefinition.api.BaseUtil;
import web.pageObjects.executeAutomation.LoginPage;
import web.pojo.User2;

import java.util.List;


public class Login {

     BaseUtil base;

    public Login(BaseUtil base){
        this.base = base;

    }


    @Given("I start application")
    public void navigate(){

        System.out.println("starting an application");
        base.driver.get("http://www.executeAutomation.com/site");

    }

    @When("^I login with username and password$")
    public void iLoginWithUsernameAndPassword() {
        System.out.println("login to application");
//        WebElement element= base.driver.findElement(By.id("main-menu-item-788"));
//        element.click();

        LoginPage lp = new LoginPage(base.driver);
        lp.clickContact();

    }

    @Then("^I verify page title$")
    public void enteringTexttoName() throws InterruptedException {
        System.out.println("Entering Text to Name field");

//        base.driver.findElement(By.id("nf-field-12")).sendKeys("Karthik");


        LoginPage lp = new LoginPage(base.driver);
        lp.FillForm();

        Thread.sleep(5000);
    }


    @Then("^I verify page not exist$")
    public void negative() throws InterruptedException {
        Assert.fail();
    }


    @Then("^I login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void loginWithParameter(String userName, String passWord) {

        System.out.println("username is " + userName);
        System.out.println("password is " + passWord);
    }


    @Then("^I login using following information$")
    public void iLoginUsingFollowingInformation(DataTable dataTable) {

        // dataTable.raw() >>   List< List<String> >    >> { { S1, S2, S3}, { N1, N2, N3 } }
        for(int i=0; i<dataTable.row(0).size(); i++ ) {


            String key = dataTable.row(0).get(i);
            String value = dataTable.row(1).get(i);

            System.out.println(key + " : "  + value);
        }

    }


    @Then("^I print following information$")
    public void iPrintFollowingInformation(List<User2> users){

        for(User2 user: users){

            System.out.print( user.getFirstName() + " ");
            System.out.print( user.getLastName()  + " ");
            System.out.print( user.getCity()  + " ");
            System.out.print( user.getState()  + " ");
          //  System.out.println( user.getCountry() );

            System.out.println( "- - - - - - - - - -");
        }

    }

    @Then("^I login with username as \"([^\"]*)\"$")
    public void iLoginWithUsernameAsUser(String user) {
        System.out.println( "username as " + user);
    }

    @Given("^I launch app$")
    public void iLaunchApp() {
        System.out.println("Background step : ");
    }
}
