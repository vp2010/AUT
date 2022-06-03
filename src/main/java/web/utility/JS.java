package web.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JS {
	
	// this is java script object class, will useful for element interaction using jQuery
	
    public static void scrollDown(WebDriver driver){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
    

    public static void scrollToElementview(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }
   
    public static void clickElement(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	System.out.println(driver.toString());
        jse.executeScript("arguments[0].click();", element);
    }
   
    public static void setValue(WebDriver driver,WebElement element, String v1){
       	JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].setAttribute('value', '5.5')", element);
        jse.executeScript("arguments[0].setAttribute('aria-valuenow', '5.5')", element);

    }
    
    public static void scrollRight(WebDriver driver,String s1) {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	jse.executeScript(
    		    "document.getElementById("+s1+").scrollRight += 250", "");
    }


    public static void scroll1(WebDriver driver, String id){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(
                "document.querySelector(element).scrollLeft=1000");
    }

    public static void scrollLeft1(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.querySelector(" + element + ").scrollLeft=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void scrollLeft2(WebDriver driver, String id) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.getElementById(" + id + ").scrollLeft=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void scrollTop1(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.querySelector(" + element + ").scrollTop=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void scrollTop2(WebDriver driver, String id) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.getElementById(" + id + ").scrollTop=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }


    public static void scroll3(WebDriver driver, WebElement element){

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            jse.executeScript("arguments[0].scrollintoView()", element);
        } finally{
            jse.executeScript("arguments[0].scrollintoView()", element);
        }


        }




}
