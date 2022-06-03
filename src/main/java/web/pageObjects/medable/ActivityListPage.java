package web.pageObjects.medable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.utility.JS;

public class ActivityListPage {

   WebDriver driver;

    public ActivityListPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy( xpath = "//h1[text()='Tasks']")
    private WebElement title;
    
    @FindBy (xpath="//a[20]")
    private WebElement FormStepTask_radiobtn;




    public WebElement getTitle(){
        return title;
    }

    public WebElement getFormStepTaskRadio(){
        return FormStepTask_radiobtn;
    }

    public void selectFormStepTaskOption(){
    	

    	  JS.scrollDown(driver);
          FormStepTask_radiobtn.click();	
    }

    public boolean verifyActivityPage(){
        return title.isDisplayed();
    }

    
}
