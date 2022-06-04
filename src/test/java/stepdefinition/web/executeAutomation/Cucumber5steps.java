package stepdefinition.web.executeAutomation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class Cucumber5steps {

    @Then("I have few books in hand such as java,cs,csharp")
    public void iHaveFewBooksInHandSuchAsJavaCsCsharp() {
    }


    private class userInfo {
        public String username;
        public String city;

        public userInfo(String username, String city) {
            this.username = username;
            this.city = city;
        }
    }

    @Then("I read multiple data using web.pojo")
    public void iReadDataUsingPojo(DataTable dt) {

        List<userInfo> user = dt.asList(userInfo.class);
        var user1 = dt.asList(userInfo.class);
        //user1.get(1).city

        for(userInfo newUser: user){
            System.out.println(newUser.username + " " + newUser.city  );
        }
    }

    @DataTableType
    public userInfo convertData(Map<String, String> entry) {
        return new userInfo(
                entry.get("name"),
                entry.get("city")
        );
    }

    @Then("I read data using pojo")
    public void readDatatable(List<userInfo> user) {
        for (userInfo u1 : user
        ) {
            System.out.println(u1.city);
            System.out.println(u1.username);
        }
    }

}
