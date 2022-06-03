package api.utility;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;

import java.net.URI;
import java.util.Map;

public class baseAPI {

    private static RequestSpecification spec, request;
    private static Response response;


    public baseAPI(){

        RequestSpecBuilder  builder  = new RequestSpecBuilder();

        builder.setBaseUri("http://localhost:3000");
        builder.setContentType(ContentType.JSON);
        spec = builder.build();

        request = RestAssured.given().spec(spec);

    }




    public static ResponseOptions<Response> getResponse(String url){
        try {
            response = request.get(new URI(url));
            return response ;
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public static ResponseOptions<Response> getResponseWithParams(String url, Map<String,String> pathParam){
        try {
            response = request.pathParams(pathParam).get(new URI(url));
            return response ;
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }



}
