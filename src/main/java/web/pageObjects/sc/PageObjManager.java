package web.pageObjects.sc;

import org.openqa.selenium.WebDriver;

public class PageObjManager {

    private WebDriver driver;
    private LoginPage loginPage;

    private ProductPage productPage;
    private CheckoutPage checkoutPage;


    public PageObjManager(WebDriver driver){
        this.driver = driver;
    }



    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }


    public CheckoutPage getCheckoutPage(){
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }

    public ProductPage getProductPage(){
        return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
    }

}
