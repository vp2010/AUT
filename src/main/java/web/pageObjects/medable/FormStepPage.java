package web.pageObjects.medable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.JS;

public class FormStepPage {

    public FormStepPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy( xpath = "//p[text()='Form Step 1']" )
    private WebElement title;

    @FindBy( xpath = "//input[@type='email']")
    private WebElement EmailSubstep;
  
    @FindBy(id="5f495246a0a6f70100d5e395_text")
    private WebElement TextSubStep;
    
    @FindBy( xpath="//input[@type='number']")
    private WebElement NumericSubStep;
    
    @FindBy(id = "5f495246a0a6f70100d5e40f_value_picker")
    private WebElement valuePicker;

    @FindBy( id="5f495247a0a6f70100d5e518_boolean_0")
    private WebElement yes_btn;
    
    @FindBy( xpath= "//div[@id='5f495248a0a6f70100d5e555_continuous_scale' and @role='slider']")
    private WebElement continousScale;

    @FindBy( id= "5f495248a0a6f70100d5e5a0_integer_scale")
    private WebElement integerScale;

    @FindBy( xpath = "//input[@placeholder='Search']")
    public WebElement search;
    
    //set value=1
    @FindBy( id= "5f495249a0a6f70100d5e644_text_scale")
    private WebElement textScale;
    

    @FindBy( xpath= "//div[@id='5f495249a0a6f70100d5e644_text_scale'][@tabIndex='1']")
    private WebElement textScale1;
    
    
    public void moveTextScale(WebDriver driver, String v1) throws InterruptedException {
    	
        JS.clickElement(driver, textScale1);
    }
    
    //set attribute as 3 hours
    @FindBy( name = "hour" )
    private WebElement hour;
    
    
    //set attribute as 2 minutes
    @FindBy( name = "minute" )
    private WebElement minute;
    
    //set attribute
    @FindBy(id="5f495249a0a6f70100d5e6d3_time_of_day_hour")
    private WebElement day_hour;
    
    //set attribute
    @FindBy(id="5f495249a0a6f70100d5e6d3_time_of_day_minute")
    private WebElement day_minute;
  
    //set attribute
    @FindBy(id="5f495249a0a6f70100d5e6d3_time_of_day_meridiem")
    private WebElement meridiem;
    
   
    @FindBy( xpath = "//button[text()='Next']")
    private WebElement nextBtn;
    
    @FindBy( xpath = "//button[text()='Skip']")
    private WebElement skipBtn;

    @FindBy( xpath = "//p[text()='Completion']")
    private WebElement completion;

    @FindBy( xpath = "//button[text()='Done']")
    private WebElement done;

    // after click on the Done button , web page showing error message, so couldn't complete 
    //  as expected

    public WebElement getTitle() {
        return title;
    }

    public boolean verifyTitleDisplayed(){
        return title.isDisplayed();
    }
    

    public void clickNextBtn(){
        nextBtn.click();
    }

    public void clickSkipBtn(){
        skipBtn.click();
    }

    public boolean verifyCompletionPage(){
        return completion.isDisplayed();
    }

    public void clickDoneBtn(){
        done.click();
    }
    
    
    public void fillDate(String value1) {
    	done.sendKeys(value1);
    }

    
    public void setEmail(String s1) {
    	EmailSubstep.sendKeys(s1);	
    }
    
    
    public void setSubStep(String s1) {
    	TextSubStep.sendKeys(s1);
    }
    
    public WebElement getNumberField() {
    	return NumericSubStep;
    }
    
    public void setNumber(String s1) {
    	NumericSubStep.sendKeys(s1);
    }
    
    
    public void selectOption(WebDriver driver,String s1) {
        valuePicker.click();
        
        List<WebElement> listItem  = driver.findElements(By.xpath("//div/ul/li"));
        
        for(WebElement ele : listItem) {
     	   if(ele.getText().contains(s1)) { 
     		   ele.click();
     		   break;
     	   }
        }
     }
     
    
    public void setRadiobtn(String s1) {
    	if(s1.equalsIgnoreCase("True")) {
    		yes_btn.click();
    	}
    }

    
    public WebElement getContinousScale() {
		return continousScale;
    	
    }

    public void moveContinousScale(WebDriver driver, String v1) throws InterruptedException {

        WebElement e1 = driver.findElements(By.id("5f495248a0a6f70100d5e555_continuous_scale")).get(1);
        WebElement e2 = driver.findElements(By.id("5f495248a0a6f70100d5e555_continuous_scale")).get(2);

        System.out.println("value of x : " + e1.getLocation().getX()  + " value of y : " + e1.getLocation().getY());
        System.out.println("value of x : " + e2.getLocation().getX()  + " value of y : " + e2.getLocation().getY());

        int diff = e2.getLocation().getX() - e1.getLocation().getX();
        double xOffset = diff*5.5/11;
        JS.clickElement(driver, continousScale);
        Actions act = new Actions(driver);
        act.moveToElement(continousScale).clickAndHold();
        act.moveByOffset((int)xOffset,0); // 430
        act.release();
        act.perform();
    }

    public WebElement getIntegerScale() {
        return integerScale;
    }
    public void moveIntegerScale(WebDriver driver, String v1) throws InterruptedException {

        JS.clickElement(driver, integerScale);

        JS.clickElement(driver, integerScale);

        Thread.sleep(2000);

        WebElement To = driver.findElement(By.xpath("//div[@tabIndex='"+ v1 + "']"));
        Actions act=new Actions(driver);
        act.moveToElement(integerScale).moveToElement(To).click().build().perform();
    }

    public void inputSearch(String s1) {
    	search.sendKeys(s1);
    	search.submit();
    }
    
    
    public void setTextScale(WebDriver driver,String s1) {
    	JS.setValue(driver, textScale, s1);
    }
    
    public WebElement getTextScale() {
		return textScale;
    }
    
    public WebElement getHour() {
  		return hour;
      }
    
    public WebElement getMinute() {
  		return minute;
      }
    
    public WebElement getDayHour() {
  		return day_hour;
    }
    
    
    public WebElement getDayMinute() {
  		return day_minute;
      }
    
    
    public WebElement getMeridiem() {
  		return meridiem;
      }
    
    
    
    public void setHourMinute(WebDriver driver, WebElement element, String s1) {
        element.click();
        
        List<WebElement> listItem  = driver.findElements(By.xpath("//div/ul/li"));
        
        for(WebElement ele : listItem) {
     	   if(ele.getText().contains(s1)) { 
     		   ele.click();
     		   break;
     	   }
        }
     }
     

    public void clickNext() {
    	nextBtn.click();
    }

}
