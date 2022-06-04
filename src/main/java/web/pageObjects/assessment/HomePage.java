package web.pageObjects.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy( xpath = "//h1" )
    private WebElement title;

    @FindBy( css = ".search-container #search-query" )
    private WebElement searchCategory;

    @FindBy( css = ".search-bar-item > #search-location")
    private WebElement searchLocation;

    @FindBy(css=".flat-blue-btn")
    private WebElement searchBtn;

    @FindBy(css="#results h2>a")
    private List<WebElement> searchresult;


    public void selectCategory(String arg0){
        searchCategory.clear();
        searchCategory.sendKeys(arg0);
    }

    public void selectLocation(String arg1){
        searchLocation.clear();
        searchLocation.sendKeys(arg1);
    }

    public void clickSearch(){
        searchBtn.click();
    }

    public boolean isTitleDisplayed(){
        return title.isDisplayed();
    }

    public boolean resultList(int count){
        return searchresult.size()>=count;
    }

    public void selectBusiness(String name){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.linkText(name)));
        js.executeScript("arguments[0].click();", driver.findElement(By.linkText(name)));

//        for(WebElement r1: searchresult ){
//            System.out.println(r1.getText());
//            if(r1.getText().equals(name)){
//                js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.linkText(name)));
//                r1.click();
//                break;
//            }
//        }

    }
}
