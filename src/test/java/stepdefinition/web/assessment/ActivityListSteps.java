package stepdefinition.web.assessment;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import web.pageObjects.assessment.ActivityListPage;

public class ActivityListSteps extends BaseSteps {
	
    //  creating Activity List Page object
    ActivityListPage activityListPage;

    @Then("^Patient select Form Step Task on activity list page$")
    public void patient_select_Form_Step_Task_on_activity_list_page(){
        activityListPage = pageObjectManager.getActivityListpage();
        activityListPage.selectFormStepTaskOption(); 
    }

    @Then("^Patient should see the Activity list page$")
    public void patient_should_see_the_Activity_list_page(){
        activityListPage = pageObjectManager.getActivityListpage();
        Assert.assertEquals(true,activityListPage.verifyActivityPage());
    }

    @Then("^Patient should see Form Step Task completed$")
    public void patient_should_see_Form_Step_Task_completed(){
        activityListPage = pageObjectManager.getActivityListpage();
        //need to cross check one more time
        Assert.assertTrue(activityListPage.getTitle().isDisplayed());
    }
}
