package TestNG_Example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyClass3 {



    @Test(priority = 2)
    @Parameters("myName")
    public void method1(String myName){

        System.out.println( "Parameter name : " + myName  );
    }


    @DataProvider(name = "data1")
    public Object[][] getData(){
        Object [][] employee = {{10,20},{30,40}};

        //ToDo
        // Object [][] data = readExcel.getData(xlsFilePath);

        return employee;
    }


    @Test(dataProvider = "data1", priority = 1)
    public void method2(int i, int j){

        System.out.println("first variable value = " + i);
        System.out.println("second variable value = " + j);
    }

}
