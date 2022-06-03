package testRunner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.BeforeTest;


//    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"/Users/Vipul2010/Desktop/Vipul/Automation/EA/Core/src/test/java/Selenium/Features"},
            plugin = {"pretty",
                    "json:target/cucumber.json",
                    "html:target/site"
                     },
            glue={"Selenium/Steps"},
            tags={"@First"},
//            tags={"not @second"   //   @smoke and @first //  @smoke or @database},
            monochrome = false,
            dryRun = false,
            strict=false
    )



//    @Listeners(Runner.NGTestListener.class)
    public class TestRunner extends AbstractTestNGCucumberTests {

//    public Object[][] Scenarios(){
//        return super.scenarios();
//    }


        @BeforeTest
        public void setup(){

            System.out.println("setting runner class data");

        }

    }




