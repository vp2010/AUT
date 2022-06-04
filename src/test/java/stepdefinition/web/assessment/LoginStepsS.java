package stepdefinition.web.assessment;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import web.pageObjects.assessment.LoginPageS;

import java.util.List;

public class LoginStepsS extends BaseSteps {

    LoginPageS loginPageS;

    public LoginStepsS(){
        loginPageS = pageObjectManager.getLoginPageSc();
    }

    @Given("^Patient navigate to activity list as \"([^\"]*)\"$")
    public void patient_navigate_to_activity_list_as(String username){
     
    	// creating the login page object
    	loginPageS = pageObjectManager.getLoginPageSc();
        loginPageS.login(username);
    }

    @Given("^user login to web with following credentials$")
    public void user_login_to_with_following_credentials(String arg1, DataTable arg2)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<String>  data = arg2.asList(String.class);
        data.stream().forEach(System.out::println);
        loginPageS.login1(data.get(1), data.get(2));

    }


    @Given("^set web url as \"([^\"]*)\"$")
    public void setWebUrlAs(String url) {
        loginPageS.openWeb(url);
    }
}
