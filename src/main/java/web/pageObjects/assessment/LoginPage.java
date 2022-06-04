package web.pageObjects.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.utility.JS;

public class LoginPage {

    private final static String PAGE_URL = "https://mystudy.qa.medable.com/?org=pawabqaauto";
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[text()='Sign In']")
    private WebElement signIn;
    
    @FindBy(name = "email")
    private WebElement usrname;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath= "//button[@type='submit']" )
    private WebElement loginbtn;

    @FindBy(xpath= "//button[text()='Next']" )
    private WebElement nextBtn;

    public void login(String username) {
    	nextBtn.click();
    	JS.scrollDown(driver);
    	signIn.click();
        usrname.sendKeys(username);
        password.sendKeys("Medable123$");
        loginbtn.click();
    }

}
