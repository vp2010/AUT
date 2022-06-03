package web.pageObjects.sc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Util;

public class LoginPage {

   // private final static String PAGE_URL = "https://mystudy.qa.medable.com/?org=pawabqaauto";
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    //    driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    
    @FindBy(id = "user-name")
    private WebElement usrname;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id= "login-button" )
    private WebElement loginbtn;


    public void openWeb(String url){
        driver.get(url);
    }
    public void login(String username) {
        usrname.sendKeys(username);
        password.sendKeys("Medable123$");
        loginbtn.click();
    }


    public void login1(String username, String passWord) {
        usrname.sendKeys(username);
        password.sendKeys(passWord);
        loginbtn.click();
    }

}
