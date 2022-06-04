package api.utility;

import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import lombok.Data;

@Data
public class APIContext {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static ResponseOptions<Response> getResponse() {
        return response;
    }

    public void setResponse(ResponseOptions<Response> response) {
        this.response = response;
    }

    public static ResponseOptions<Response> response;


}
