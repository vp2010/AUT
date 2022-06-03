package web.pageObjects.sc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import web.utility.JS;


import java.util.ArrayList;
import java.util.List;

public class ProductPage {

    WebDriver driver;
     static List<String> itemsExpInCart;
     static List<String> itemsExpPrice;
    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        itemsExpInCart = new ArrayList<>();
        itemsExpPrice = new ArrayList<>();
    }

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement title;

    @FindBy(css = ".product_sort_container")
    private WebElement sortSel;

    @FindBy(id = "shopping_cart_container")
    private WebElement checkout;

    public boolean verifyProductPage(){
        return title.isDisplayed();
    }

    Select select = new Select(sortSel);
    public void sortItems(String sortType){
        select.selectByValue(sortType);
    }

    public void addItem(String productName){

        String productXp = "//div[text()='" + productName + "']";
        WebElement currProduct;
        JS.scrollToElementview( driver, currProduct=driver.findElement(By.xpath(productXp)));

        WebElement currProductAddButton = driver.findElement(By.xpath( productXp  + "//following::button[1]"));
        WebElement currProductPrice = driver.findElement(By.xpath( productXp  + "//following::div[@class='inventory_item_price'][1]"));

        itemsExpInCart.add( productName);
        itemsExpPrice.add(currProductPrice.getText());
        if(currProduct.getText().equalsIgnoreCase(productName)){

            currProductAddButton.click();
        }
    }

    public void navigateToCheckout(){
        //scrollTop

        //JS.scrollToTop(driver,checkout);
        checkout.click();
    }

    public List<String> getItemList(){
        return itemsExpInCart;
    }

    public List<String> getPriceList(){
        return itemsExpPrice;
    }

    public void removeItemfromProductList( String item){
        itemsExpInCart.removeIf( e -> e.equalsIgnoreCase(item));
    }

}
