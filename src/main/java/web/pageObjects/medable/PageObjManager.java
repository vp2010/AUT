package web.pageObjects.medable;

import org.openqa.selenium.WebDriver;

public class PageObjManager {

    private WebDriver driver;
    private ActivityListPage activityListpage;
    private FormStepPage formStepPage;
    private LoginPage loginPage;


    public PageObjManager(WebDriver driver){
        this.driver = driver;
    }



    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public ActivityListPage getActivityListpage(){
        return (activityListpage == null) ? activityListpage = new ActivityListPage(driver) : activityListpage;
    }

    public FormStepPage getformStepPage(){
        return (formStepPage == null) ? formStepPage = new FormStepPage(driver) : formStepPage;
    }
}
