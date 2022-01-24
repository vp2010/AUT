package web.utility;

import org.openqa.selenium.WebDriver;
import web.factory.DriverFactory;

public class Context {

    public ConfigManager config;
    public static String getServiceStaffMember() {
        return "";
    }

    public static String getServicePrice() {

        return "";
    }

    public static String getServiceName() {

        return "";
    }

    public static ConfigManager getConfig(){
             return  new ConfigManager();
    }

    public static void initialize() {

        getConfig().init_prop();

        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.init_driver(getConfig().getKey("browser"));
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;

    private static PageObjManager pageObjManager;

    public static PageObjManager getPageObjManager(){
        if(pageObjManager==null){
            return new PageObjManager( Context.getDriver());
        }
        return pageObjManager;
    }

//  NAL - synchronized ? Do we require for parallel
//    public static synchronized WebDriver getDriver() {
//        return driver;
//    }
//
//    public void setDriver(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public static WebDriver driver;


}
