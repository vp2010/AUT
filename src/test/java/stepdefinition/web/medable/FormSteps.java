package stepdefinitions.web.medable;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pageObjects.FormStepPage;
import util.JS;
import java.util.List;

public class FormSteps extends BaseSteps{

      // creating the Form Step page object
	
    FormStepPage formStepPage;

    @Then("^Patient should see Form Step Task ready to start$")
    public void patient_should_see_Form_Step_Task_ready_to_start(){
        formStepPage = pageObjectManager.getformStepPage();
        Assert.assertTrue(formStepPage.getTitle().isDisplayed() );
    }

    @Then("^Patient completes Form step with values$")
    public void patient_completes_Form_step_with_values(DataTable table) throws Exception{
        formStepPage = pageObjectManager.getformStepPage();

        List<List<String>>data = table.raw();

        JS.scrollDown(driver);
        formStepPage.setEmail(data.get(1).get(1));

        formStepPage.setSubStep(data.get(2).get(1));

        Thread.sleep(2000);
        formStepPage.setNumber(data.get(3).get(1));

       JS.scrollToElementview(driver, formStepPage.getNumberField());
       formStepPage.selectOption(driver,data.get(4).get(1));

        formStepPage.setRadiobtn(data.get(5).get(1));

        Thread.sleep(2000);
        JS.scrollDown(driver);
        formStepPage.moveContinousScale(driver,data.get(6).get(1));

        JS.scrollToElementview(driver, formStepPage.getIntegerScale());
        formStepPage.moveIntegerScale(driver, data.get(7).get(1));

        formStepPage.inputSearch(data.get(8).get(1));

        JS.scrollToElementview(driver, formStepPage.getTextScale());
        formStepPage.moveTextScale(driver, data.get(9).get(1));

        JS.scrollToElementview(driver, formStepPage.getHour());

        formStepPage.setHourMinute(driver, formStepPage.getHour(),data.get(10).get(1).split("\\.")[0]);

        formStepPage.setHourMinute(driver, formStepPage.getMinute(),data.get(10).get(1).split("\\.")[1]);

        formStepPage.setHourMinute(driver, formStepPage.getDayHour(), data.get(11).get(1).split("\\ ")[0]);

        formStepPage.setHourMinute(driver,  formStepPage.getDayMinute(),data.get(11).get(1).split("\\ ")[1]);

        formStepPage.setHourMinute(driver, formStepPage.getMeridiem(),data.get(11).get(1).split("\\ ")[2]);
    }

   
    
    
    @Then("^Patient click next button in step page$")
    public void patient_click_next_button_in_step_page(){
        formStepPage = pageObjectManager.getformStepPage();
        formStepPage.clickNextBtn();
    }

    @Then("^Patient click skip button in next page$")
    public void patient_click_skip_button_in_next_page(){
        formStepPage = pageObjectManager.getformStepPage();
        formStepPage.clickSkipBtn();
    }

    @Then("^Patient should see the completion step page$")
    public void patient_should_see_the_completion_step_page(){
        formStepPage = pageObjectManager.getformStepPage();
        Assert.assertEquals(true,formStepPage.verifyCompletionPage());
    }

    @Then("^Patient click done button in step page$")
    public void patient_click_done_button_in_step_page(){
        formStepPage = pageObjectManager.getformStepPage();
        formStepPage.clickDoneBtn();
    }


}
