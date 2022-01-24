package web.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web.utility.Context;

public class DriverFactory {
    // responsible to get browser name during runtime and create instance of chrome - assing to Context

    private Context context;

    public enum Browser {
        CHROME, FIREFOX, IE, SAFARI
    }

    public DriverFactory() {

        //only if context method not static this.context = context;
    }

    public WebDriver init_driver(String browser) {
        if (browser.equalsIgnoreCase(Browser.CHROME.toString())) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            Context.driver = new ChromeDriver();
        }
        Context.getDriver().manage().deleteAllCookies();
        Context.getDriver().manage().window().maximize();
        return Context.getDriver();
    }

}
