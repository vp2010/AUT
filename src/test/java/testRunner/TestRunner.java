package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"web/stepDefinition", "web/hooks"},
        //strict = true,
        plugin = {"pretty"}

)
public class TestRunner extends AbstractTestNGCucumberTests {

    // parallel execution - requires Testng + surefire plugin
    @Override
//    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
