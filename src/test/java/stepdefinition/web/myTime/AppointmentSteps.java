package web.stepDefinition.myTime;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pageObjects.myTime.*;
import web.utility.Context;

public class AppointmentSteps {

    AppointmentPage appointmentPage;

    public AppointmentSteps(){
        appointmentPage = Context.getPageObjManager().getAppointmentPage();
    }


    @And("^Select \"([^\"]*)\" in the services filter from the left panel$")
    public void selectInTheServicesFilterFromTheLeftPanel(String arg0) throws Throwable {
       // appointmentPage.clickAllService();
        appointmentPage.clickServicebyName(arg0);
    }

    @And("^Select staff (\\d+) from the staff filter in the left side panel$")
    public void selectSecondStaffFromTheStaffFilterInTheLeftSidePanel(int index) {
        appointmentPage.selectStaffMember(index);
       // Context.setServiceStaffMember( appointmentPage.getMemberName(index));
    }

    @Then("^Click the \"([^\"]*)\" button for the \"([^\"]*)\" service$")
    public void clickTheBookButtonForTheMenSHaircutService(String arg0, String arg1) {
        //Context.setServiceName( appointmentPage.getServiceName(arg1));
        //Context.setServicePrice(appointmentPage.getPrice(arg1));
        appointmentPage.clickBookApt(arg1);
    }

    @When("^user press \"([^\"]*)\" in the add-on modal opened$")
    public void userPressInTheAddOnModalOpened(String arg0) throws Throwable {
        appointmentPage.clickSelectTime();
    }

}
