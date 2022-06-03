package testRunner.Runner;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGTestListener implements ITestListener{

    public void onStart(ITestContext context) {

        System.out.println(" on context start");
    }

            public void onTestStart(ITestResult result) {
                System.out.println(" on test start");
            }

                    public void onTestSuccess(ITestResult result) {
                        System.out.println(result.getName() + " test Passed ");
                    }

                    public void onTestFailure(ITestResult result) {

                        System.out.println(" Test Failed " + result.getName() );

                        // implement takeScreenshot method
                    }

                    public void onTestSkipped(ITestResult result) {
                        System.out.println(" on test skipped");
                    }

        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
            System.out.println(" on test failed with success percentage");
        }

        public  void onTestFailedWithTimeout(ITestResult result) {
            this.onTestFailure(result);
        }



    public void onFinish(ITestContext context) {

        System.out.println(" on context finish");
    }

}
