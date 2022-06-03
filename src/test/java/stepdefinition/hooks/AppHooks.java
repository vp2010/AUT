package stepdefinition.hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import web.factory.DriverFactory;
import web.utility.ConfigManager;
import web.utility.Context;

public class AppHooks {
    private ConfigManager configManager;
    private WebDriver driver;


    public AppHooks( ) {
        // initialize context if context is not static
    }

    @Before
    public void setup(){
        Context.initialize();




        // Context.getDriver().get( Context.getProperty("url"));
        configManager = new ConfigManager();
        configManager.init_prop();

    }

    @After
    public void tearDown(){
        //Context.getDriver().quit();
    }


    @Before("order=0,@web")
    public void getProperty() {
        configManager = new ConfigManager();
        configManager.init_prop();
    }

    @Before("order=1,@web")
    public void launch() {
    }

    @After("order=1,@web")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            // typecast driver to TakeScreenshot _ take as byte which helps in jenkin run
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "imgeg/png", screenshotName);
        }
    }

    @After("order=0,@web")
    public void quit() {
        driver.quit();
    }


    @BeforeStep
    public void stepBefore(Scenario scenario) {
        System.out.println("Before step argument");
    }

    @AfterStep
    public void stepAfter() {
        System.out.println("After step argument");
    }


}
