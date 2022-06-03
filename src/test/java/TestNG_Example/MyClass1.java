package TestNG_Example;

import org.testng.annotations.Test;

public class MyClass1 extends MyBaseClass{


    @Test(groups = "base1")
    public void method1(){
        System.out.println( getClass().getName() + " "  + "Method 1");
    }

    @Test(groups= "base1")
    public void method2(){
        System.out.println( getClass().getName() + " "  + "Method 2");
    }
}
