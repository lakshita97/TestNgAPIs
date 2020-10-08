package integration.DTO;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class SearchResponseDto {

    @JsonProperty("results_found")
    private Integer resultsFound;
    @JsonProperty("results_start")
    private Integer resultsStart;
    @JsonProperty("results_shown")
    private Integer resultsShown;
    @JsonProperty("restaurants")
    private List<restaurants> restaurants = null;

    @JsonProperty("results_found")
    public Integer getResultsFound() {
        return resultsFound;
    }

    @JsonProperty("results_found")
    public void setResultsFound(Integer resultsFound) {
        this.resultsFound = resultsFound;
    }

    @JsonProperty("results_start")
    public Integer getResultsStart() {
        return resultsStart;
    }

    @JsonProperty("results_start")
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    @JsonProperty("results_shown")
    public Integer getResultsShown() {
        return resultsShown;
    }

    @JsonProperty("results_shown")
    public void setResultsShown(Integer resultsShown) {
        this.resultsShown = resultsShown;
    }

    @JsonProperty("restaurants")
    public List<restaurants> getRestaurants() {
        return restaurants;
    }

    @JsonProperty("restaurants")
    public void setRestaurants(List<restaurants> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        return "SearchResponseDto{" +
                "resultsFound=" + resultsFound +
                ", resultsStart=" + resultsStart +
                ", resultsShown=" + resultsShown +
                ", restaurants=" + restaurants +
                '}';
    }
}
