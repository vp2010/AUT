package web.utility;

import org.openqa.selenium.WebDriver;
import web.pageObjects.medable.ActivityListPage;
import web.pageObjects.medable.FormStepPage;
import web.pageObjects.medable.LoginPage;
import web.pageObjects.myTime.AppointmentPage;
import web.pageObjects.myTime.ConfirmationPage;
import web.pageObjects.myTime.HomePage;
import web.pageObjects.sc.CheckoutPage;
import web.pageObjects.sc.ProductPage;

public class PageObjManager {

    private WebDriver driver;
    private AppointmentPage appointmentPage;
    private HomePage homePage;
    private ConfirmationPage confirmationPage;
    private FormStepPage formPage;
    private ActivityListPage activityListPage;
    private ProductPage productPage;
    private CheckoutPage checkoutPage;


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

    public FormStepPage getformStepPage(){
        return (formPage == null) ? formPage = new FormStepPage(driver) : formPage;
    }

    public ProductPage getProductPage(){
        return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
    }

    public CheckoutPage getcheckoutPage(){
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }
}
