package stepdefinition.web.sc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import web.utility.PageObjManager;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

     static WebDriver driver;
     PageObjManager pageObjectManager;
     static int i; 

    public BaseSteps(){
    	i++;
    	if(driver==null){
    		// creating driver instance

            System.setProperty("webdriver.chrome.driver","driver/new/chromedriver");
            driver= new ChromeDriver();
            
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

    	 
    	 // creating page object manager instance, only it not created
        if(pageObjectManager==null){
        	
           pageObjectManager = new PageObjManager(driver);
        }
    }

}
