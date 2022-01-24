package web.utility;

import org.openqa.selenium.WebDriver;
import web.pageObjects.myTime.AppointmentPage;
import web.pageObjects.myTime.ConfirmationPage;
import web.pageObjects.myTime.HomePage;

public class PageObjManager {

    private WebDriver driver;
    private AppointmentPage appointmentPage;
    private HomePage homePage;
    private ConfirmationPage confirmationPage;


    public PageObjManager(WebDriver driver){
        this.driver = driver;
    }


    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public AppointmentPage getAppointmentPage(){
        return (appointmentPage == null) ? appointmentPage = new AppointmentPage(driver) : appointmentPage;
    }

    public ConfirmationPage getConfirmationPage(){
        return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
    }
}
