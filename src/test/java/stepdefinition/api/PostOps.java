package stepdefinition.api;

import api.pojo.Address;
import api.pojo.Employee;
import api.pojo.Location;
import api.utility.APIContext;
import api.utility.RestAssuredExtenstion;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOps {

    private APIContext context;
    private Map<String,String> body = new HashMap<String, String>();
    private Map<String,String> pathParam = new HashMap<String, String>();;
    private Map<String,String> queryParam = new HashMap<String, String>();;


    public PostOps(APIContext context) {
        this.context = context;
    }


    // steps for EA scenario
    @Given("I perform authentication operation for {string} with body")
    public void i_perform_authentication_operation_for_with_body(String url, DataTable dataTable) {
        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Post", null);
        body = dataTable.asMap(String.class,String.class);
        context.setToken( EA.authenticate(body) );
    }

    // steps for EA scenario
    @Then("I should see the street name as {string} for {string}")
    public void i_should_see_the_street_name_as(String street, String type) {

        //deserialized
        Location[] location =  context.getResponse().getBody().as(Location[].class);
       Address address = location[0].getAddress().stream().filter(e -> e.getType().equalsIgnoreCase(type)).findFirst().orElse(null);
       Assert.assertTrue(address.getStreet().equalsIgnoreCase(street));

       context.response.getStatusCode();
    }


    // databind require for POST Body -- REFER EA chap 7
    // serialization - worst for API parameter handling 
//    @DataTableType
//    public Employee convertData(Map<String, String> entry) {
//
//        return new Employee(
//                entry.get("id"),
//                entry.get("name"),
//                entry.get("salary"),
//                entry.get("age")
//        );
//    }

    // steps for EA scenario
    @Given("I perform Post operation for {string}")
    public void iPerformPostOperationWithBodyFor(String url, List<Employee> employees) {

        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Post", null);

        for (Employee e1 : employees
        ) {
            body.put("id",e1.getId());
            body.put("name",e1.getName());
            body.put("salary",e1.getSalary());
            body.put("age",e1.getAge());
        }
    }

    // Best approach for parameter handling
    @Given("I perform Post operation with {string} for {string}")
    public void iPerformPostOperationWithBodyFor(String paramType, String url, DataTable data) {
        RestAssuredExtenstion EA = new RestAssuredExtenstion(url, "Post", null);
        List<List<String>> dataList = data.asLists();
        EA.ExecuteAPI(dataList,paramType);
    }

}
