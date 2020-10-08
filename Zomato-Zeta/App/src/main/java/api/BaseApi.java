package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseApi {
    private RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    private MethodType method;

    public enum MethodType {
        POST, GET, PUT, DELETE, PATCH
    }

    public MethodType getMethod() {
        return method;
    }

    public void setMethod(MethodType method) {
        this.method = method;
    }

    public RequestSpecBuilder getRequestSpecBuilder() {
        return requestSpecBuilder;
    }

    public Response execute() {
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        Response response;
        switch (method) {
            case GET:
                response = given().spec(requestSpecification).when().get();
                break;
            case POST:
                response = given().spec(requestSpecification).when().post();
                break;
            case PUT:
                response = given().spec(requestSpecification).when().put();
                break;
            case DELETE:
                response = given().spec(requestSpecification).when().delete();
                break;
            case PATCH:
                response = given().spec(requestSpecification).when().patch();
                break;
            default:
                throw new RuntimeException("API method not specified");

        }
        return response;
    }
    public BaseApi setBody(Object obj) {
        requestSpecBuilder.setBody(obj);
        return this;
    }
}
