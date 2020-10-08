package integration.api;
import api.BaseApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import integration.DTO.SearchResponseDto;
import io.restassured.response.Response;

import java.io.IOException;


public class SearchApi extends BaseApi {
    public SearchApi(){
        setMethod(MethodType.GET);
        getRequestSpecBuilder().setBaseUri("https://developers.zomato.com/api/v2.1/search");
    }


    public SearchResponseDto getResponse( Integer entityId,String entityType, Integer start , Integer count , String token , String searchData, String sortData ,String category, String ordering){
        try {
               getRequestSpecBuilder().addHeader("Accept", "application/json")
                    .addHeader("user-key",token);
               getRequestSpecBuilder().addQueryParam("entity_id",entityId)
                    .addQueryParam("entity_type",entityType)
                    .addQueryParam("start",start)
                    .addQueryParam("count",count)
                    .addParam("q",searchData)
                    .addParam("sort",sortData)
                    .addParam("order",ordering);
               Response response=execute();
            ObjectMapper objectMapper=new ObjectMapper();

            int statusCode = response.getStatusCode();
            if (statusCode != 200) {
                throw new IOException(
                        "Bad status code: " + statusCode + "API repsonse" + response.body());
            }
//            System.out.println(response.asString());
            SearchResponseDto searchResponseDto = objectMapper.readValue(response.asString(),SearchResponseDto.class);
            return searchResponseDto;
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
