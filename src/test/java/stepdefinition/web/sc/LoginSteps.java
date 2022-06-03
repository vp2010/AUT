package stepdefinitions.web.sc;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import pageObjects.LoginPage;

import java.util.List;

public class LoginSteps extends BaseSteps{

    LoginPage loginPage;

    public LoginSteps(){
        loginPage = pageObjectManager.getLoginPage();
    }

    @Given("^Patient navigate to activity list as \"([^\"]*)\"$")
    public void patient_navigate_to_activity_list_as(String username){
     
    	// creating the login page object
    	loginPage = pageObjectManager.getLoginPage();
        loginPage.login(username);
    }

    @Given("^user login to web with following credentials$")
    public void user_login_to_with_following_credentials(String arg1, DataTable arg2)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<String>  data = arg2.asList(String.class);
        data.stream().forEach(System.out::println);
        loginPage.login1(data.get(1), data.get(2));

    }


    @Given("^set web url as \"([^\"]*)\"$")
    public void setWebUrlAs(String url) {
        loginPage.openWeb(url);
    }
}
