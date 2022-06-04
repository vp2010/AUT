package web.utility;

import org.openqa.selenium.WebDriver;
import web.pageObjects.assessment.ActivityListPage;
import web.pageObjects.assessment.FormStepPage;
import web.pageObjects.assessment.LoginPage;
import web.pageObjects.assessment.AppointmentPage;
import web.pageObjects.assessment.ConfirmationPage;
import web.pageObjects.assessment.HomePage;
import web.pageObjects.assessment.CheckoutPage;
import web.pageObjects.assessment.LoginPageS;
import web.pageObjects.assessment.ProductPage;

public class PageObjManager {

    private WebDriver driver;
    private AppointmentPage appointmentPage;
    private HomePage homePage;
    private ConfirmationPage confirmationPage;
    private FormStepPage formPage;
    private ActivityListPage activityListPage;
    private ProductPage productPage;
    private CheckoutPage checkoutPage;
    private LoginPage loginPage;
    private LoginPageS loginPageS;


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

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public ActivityListPage getActivityListpage(){
        return (activityListPage == null) ? activityListPage = new ActivityListPage(driver) : activityListPage;
    }

    public LoginPageS getLoginPageSc(){
        return (loginPageS == null) ? loginPageS = new LoginPageS(driver) : loginPageS;
    }


}
