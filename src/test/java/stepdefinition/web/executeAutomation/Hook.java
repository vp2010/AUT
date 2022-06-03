package stepdefinition.web.executeAutomation;

import Util.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){

        this.base=base;
    } 




//    @Before
//    public void initializeTest(){
//        System.out.println("+ + + Opening browser : Mock + + +");
//
//        base.driver = getDriver("firefox");
//
//
//        System.out.println("browser launched successfully");
//
//
//    }
//
//
//    @Before("@Example")
//    public void outliner(){
//
//        System.out.println("Scenario Outline");
//    }
//
//    @After
//    public void tearDown(Scenario scenario){
//
//        System.out.println("closing browser");
//        base.driver.quit();
//
//        if(scenario.isFailed()) {
//            System.out.println(" ~ ~ ~ ~ ~ ~ taking screenshot ~ ~ ~ ~ ~ ~ ");
//        } else
//        {
//        }
//    }
//
//
//    public WebDriver  getDriver(String driver){
//        if(driver.equalsIgnoreCase( "chrome") ) {
//            System.setProperty("webdriver.chrome.driver", "/Users/Vipul2010/Downloads/chromeDriver");
//
//            ChromeOptions options = new ChromeOptions();
//
//            // ChromeDriver is just AWFUL because every version or two it breaks unless you pass cryptic arguments
//            options.setPageLoadStrategy(PageLoadStrategy.NONE); // https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html
//            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
//            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
////        options.addArguments("--headless"); // only if you are ACTUALLY running headless
////        options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
//            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
//            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
//            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
//            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
//
//            return new ChromeDriver(options);
//
//        }
//        else if (driver.equalsIgnoreCase("firefox")){
//
//            System.setProperty("webdriver.gecko.driver", "/Users/Vipul2010/Downloads/geckodriver");
//            return new FirefoxDriver();
//
//
//
//        } else  {
//
//            return new ChromeDriver();
//
//        }
//    }

}
