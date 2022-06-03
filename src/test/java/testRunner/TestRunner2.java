package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;


//    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/test/java/Selenium/Features"},
            plugin = {"pretty",
                    "json:target/cucumber.json",
                    "html:target/site"
                     },
            glue={"Selenium/Steps"},
            tags="@First",
//            tags={"not @second"   //   @smoke and @first //  @smoke or @database},
            monochrome = false,
            dryRun = false
    )



//    @Listeners(Runner.NGTestListener.class)
    public class TestRunner2 extends AbstractTestNGCucumberTests {

//    public Object[][] Scenarios(){
//        return super.scenarios();
//    }


        @BeforeTest
        public void setup(){

            System.out.println("setting runner class data");

        }

    }




