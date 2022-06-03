package TestNG_Example;

import org.testng.annotations.Test;

public class MyClass2 {

    @Test(enabled=true)
    public void method1(){

        System.out.println(getClass().getName() + " " + " method 1");
    }

    @Test(dependsOnMethods = "method1")
    public void method2(){

        System.out.println(getClass().getName() + " " + "method 2 depends on method 1");
    }


    @Test
    public void method3(){

        System.out.println(getClass().getName() + " " + "method 3");
    }

    @Test
    public void method4(){

        System.out.println(getClass().getName() + " " + "method 4");
    }

}
