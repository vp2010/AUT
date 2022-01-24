package api.utility;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;

public class RestAssuredExtenstion {

    private  String url;
    private  String method;
    private RequestSpecBuilder builder = new RequestSpecBuilder();

    public RestAssuredExtenstion(String uri, String method, String token){
//        this.url = "http://localhost:3000" + uri;
        this.url  = "http://dummy.restapiexample.com/api/v1" + uri;
        this.method = method;

        if(token != null){
            builder.addHeader("Authorization", "Bearer " + token);
        }
    }


    private ResponseOptions<Response> Execute(){

        RequestSpecification request = RestAssured.given();
        request.contentType(ContentType.JSON);
        request.spec(builder.build());

            if(this.method.equalsIgnoreCase("Get")){
                return request.get(this.url);
            } else if(this.method.equalsIgnoreCase("Post")){
                return request.post(this.url);
            } else if(this.method.equalsIgnoreCase("Delete")){
                return request.delete(this.url);
            }
        return null;
    }


    public String authenticate(Map<String,String> body){
        builder.setBody(body);
        return Execute().getBody().jsonPath().get("access_token");
    }

    // old approach
    public ResponseOptions<Response> ExecuteAPI(Map<String,String> body, Map<String,String> pathParam, Map<String,String> queryParam){
        if(body!=null){
            builder.setBody(body);
            body.clear();
        }

        if(pathParam!=null){
            builder.addPathParams(pathParam);
            pathParam.clear();
        }

        if(queryParam!=null){
            builder.addQueryParams(queryParam);
            queryParam.clear();
        }

        return Execute();
    }


    // latest approach
    public ResponseOptions<Response> ExecuteAPI(List<List<String>>body, String category) {

        if(category.equalsIgnoreCase("body")) {
            builder.setBody(body);
        }
        if(category.equalsIgnoreCase("queryparam")) {
            body.stream().forEach(e -> builder.addQueryParam(e.get(0), e.get(1)));
        }
        if(category.equalsIgnoreCase("pathparam")) {
            body.stream().forEach(e -> builder.addPathParams(e.get(0), e.get(1)));
        }

        if(category.equalsIgnoreCase("formparam")) {
            body.stream().forEach(e -> builder.addFormParam(e.get(0), e.get(1)));
        }

        return Execute();
    }


    public ResponseOptions<Response> ExecuteAPI(){
        return Execute();
    }


}
