package web.pageObjects.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppointmentPage {
    private WebDriver driver;
    public AppointmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy( xpath = "//input[@name='staff member']/following::span[1]")
    private List<WebElement> staffMembers;

    @FindBy( xpath = "//h5")
    private List<WebElement> services;

    @FindBy( css = ".normal-price")
    private List<WebElement> pricelist;

    @FindBy( xpath = "//button[text()='book']")
    private List<WebElement> bookbtns;


    @FindBy(css=".content-wrapper  .select-time-button")
    private WebElement selectTime;



    public void clickServicebyName(String name){
        driver.findElement(By.xpath("//span[text()=\""+ name +"\"]/preceding-sibling::input")).click();
    }

    public void selectStaffMember(int m){
        staffMembers.get(m).click();
    }


    public void clickBookApt(String name){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()=\"" + name+ "\"]" ))) ;
        driver.findElement(By.xpath("//span[text()=\"" + name+"\"]/following::button[1]")).click();
    }

    public void clickSelectTime(){
        selectTime.click();
    }

    public String getMemberName(int m) {
        return  staffMembers.get(m).getText();
    }

    public String getServiceName(String name) {
        return driver.findElement(By.xpath("//span[text()=\"" + name+ "\"]")).getText();
    }

    public String getPrice(String name) {
        return driver.findElement(By.xpath("//span[text()=\"" + name+"\"]/following::span[@class=\"normal-price\"][1]")).getText();
    }
}
