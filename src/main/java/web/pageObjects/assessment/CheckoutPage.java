package web.pageObjects.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import web.utility.JS;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Your Cart']")
    private WebElement title;

    @FindBys( {
            @FindBy( id = ".cart_item .inventory_item_name")
    })
    private List<WebElement> productListed;

    @FindBys( {
            @FindBy( id = ".cart_item .inventory_item_price")
    })
    private List<WebElement> priceListed;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement zipcode;

    @FindBy(id = "continue")
    private WebElement continuebtn;

    @FindBy(css = ".summary_subtotal_label")
    private WebElement summaryTotal;

    @FindBy(id = "finish")
    private WebElement finish;



    public boolean isPageDisplayed(){
        return title.isDisplayed();
    }

    public boolean verifyItemInCart(List<String> itemsExpected){
        List<String> itemsInCart = new ArrayList<>();
        productListed.stream().forEach( e-> itemsInCart.add( e.getText() ));
        return itemsExpected.equals(itemsInCart);
    }



    public void removeItem(String item){

        String productXp = "//div[text()='" + item + "']";
        WebElement currItemRemove = driver.findElement(By.xpath( productXp  + "//following::button[1]"));
        currItemRemove.click();
    }

    public void continueShopping(){
        continueShopping.click();
    }

    public void checkout(){
        checkout.click();
    }

    public void fillUserDetails(){
        firstName.sendKeys("user123");
        lastName.sendKeys("doe123");
        zipcode.sendKeys("12345");
        JS.scrollToElementview(driver, continuebtn);
        continuebtn.click();
    }


    public boolean verifyItemPriceInCart(){
        int total =0;
        for(WebElement e : priceListed){
            int i =  Integer.parseInt(    e.getText().replace("$","") ) ;
            total+=i;
        }


        int totalPrice = Integer.parseInt(summaryTotal.getText().replace("$", "") );

        return total==totalPrice;
    }

    public void clickFinish(){
        JS.scrollToElementview(driver,finish);
        finish.click();
    }


}
