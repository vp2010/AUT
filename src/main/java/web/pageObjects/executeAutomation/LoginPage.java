package web.pageObjects.executeAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(id = "email")
    private WebElement emailId;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPwdLink;

    //actions
    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean isForgotPwdLinkExist() {
        return forgotPwdLink.isDisplayed();
    }

    //why NAL create sepearate methods for each element
    public void login(String username, String pwd) {
        emailId.sendKeys(username);
        password.sendKeys(pwd);
        signInButton.submit();
    }

    public void clickContact(){
        System.out.println("");
    }



    public void FillForm(){
        System.out.println("");
    }





}
