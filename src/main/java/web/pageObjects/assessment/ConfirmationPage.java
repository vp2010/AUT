package web.pageObjects.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConfirmationPage {
    private WebDriver driver;
    public ConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy( xpath = "//h2[text()='Pick a Time']" )
    private WebElement title;

    @FindBy( xpath = "//button[text()='select']")
    private List<WebElement> selectBtnlist;

    @FindBy(css = ".variation-price > .normal-price")
    private WebElement service_price;

    @FindBy(css=".Select-value-label")
    private WebElement selectMemberName;

    @FindBy(css=".duration-copy")
    private WebElement time;

    @FindBy(css=".variation-name")
    private WebElement service_selected;




    public Boolean verifyTitlePresent(){
        return title.isDisplayed();
    }

    public Boolean resultList(int count){
        driver.findElement(By.xpath("//div[@aria-label='Select date - August 10, 2021']")) ;
        return selectBtnlist.size()>=count;
    }

    public String getServiceName(){
        return service_selected.getText();
    }

    public String getServicePrice(){
        return service_price.getText();
    }

    public String getMemberName(){
        return selectMemberName.getText();
    }



}
