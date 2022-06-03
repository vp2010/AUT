package stepdefinition.api;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class API_Context {


    public static void verifyValue(String postNumber){

        given().contentType(ContentType.JSON).
        when().get("http://localhost:3000/posts/" + postNumber).
                then().body("title", is("json-server1"));
    }



    public static void verifyContentInAnyOrder(){
        given().contentType(ContentType.JSON).
                when().get("http://localhost:3000/posts").
                then().body("author",containsInAnyOrder("typicode1","typicode2", "typicode3", "typicode4")).statusCode(200);
    }

}
