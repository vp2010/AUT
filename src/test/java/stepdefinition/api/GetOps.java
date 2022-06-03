package api.stepdefinition;

import api.pojo.respEmpList;
import api.utility.APIContext;
import api.utility.RestAssuredExtenstion;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class GetOps {
    private APIContext context;
    private Map<String,String> body;
    private Map<String,String> pathParam;
    private Map<String,String> queryParam;


    public GetOps(APIContext context) {
        this.context = context;
    }


    @Given("I perform GET operation with path parameter for address {string}")
    public void i_perform_GET_operation_with_path_parameter_for_address(String url, io.cucumber.datatable.DataTable dataTable) {
        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Get", context.getToken());
        queryParam = dataTable.asMap(String.class,String.class);
        EA.ExecuteAPI(body,pathParam,queryParam);
    }


    // steps for EA scenario - alternate approach
    @Given("I perform Get operation with {string} for {string}")
    public void iPerformGetOperationWithBodyFor(String paramType, String url, DataTable data) {

        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Get", null);
        List<List<String>> dataList = data.asLists();
        context.setResponse( EA.ExecuteAPI(dataList,paramType)) ;
    }


    @Then("I perform Get operation for all employees for {string}")
    public void getAllEmployee(String url){
        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Get", null);
        context.setResponse( EA.ExecuteAPI()) ;
    }


    @Then("I verify employee name displayed as {string}")
    public void iVerifyEmployeeNameDisplayedAs(String nameExp) {
//        respEmp res1 = context.getResponse().getBody().as(respEmp.class);
//        Assert.assertTrue(res1.getData().getEmployee_name().equalsIgnoreCase( nameExp));

        String name = context.getResponse().getBody().jsonPath().get("data.employee_name");
        Assert.assertTrue(name.equalsIgnoreCase( nameExp ));
    }

    @Then("I verify list of employees")
    public void iVerifyEmployeeNameDisplayedAs() {
        respEmpList res1 = context.getResponse().getBody().as(respEmpList.class);
        Assert.assertTrue(res1.getData()[0].getEmployee_name().equalsIgnoreCase( "Tiger Nixon"));
    }

}