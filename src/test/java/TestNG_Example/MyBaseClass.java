package TestNG_Example;

import org.testng.annotations.*;

public class MyBaseClass {


    @BeforeSuite(alwaysRun = true)
    public void suiteSetup(){
        System.out.println("- - - - - - - - - - Setting Suite configuration - - - - - - - - - - ");
    }

        @BeforeTest(alwaysRun = true)
        public void testSetup(){
            System.out.println("- - - - - - - - Setting test parameter - - - - - - - - ");
        }

                @BeforeClass(alwaysRun = true)
                public void classSetup(){
                    System.out.println("- - - - - - class data - - - - - - ");
                }

                    @BeforeMethod(alwaysRun = true)
                    public void methodSetup(){
                        System.out.println("- - - - method execution - - - - ");
                    }

                    @AfterMethod(alwaysRun = true)
                    public void methodClosure(){
                        System.out.println("- - - - method closure - - - -  ");
                    }

                @AfterClass(alwaysRun = true)
                public void classClosure(){
                    System.out.println("- - - - - - class closure - - - - - -");
                }

        @AfterTest(alwaysRun = true)
        public void testClosure(){
            System.out.println("- - - - - - - - closing test parameter - - - - - - - - ");
        }


    @AfterSuite(alwaysRun = true)
    public void suiteClosure(){
        System.out.println("- - - - - - - - - - Closing Suite configuration - - - - - - - - - - ");
    }
}
