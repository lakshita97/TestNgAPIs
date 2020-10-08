package integration.DTO;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "delivery",
        "takeaway"
})
public class HasMenuStatus {

    @JsonProperty("delivery")
    private Integer delivery;
    @JsonProperty("takeaway")
    private Integer takeaway;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("delivery")
    public Integer getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("takeaway")
    public Integer getTakeaway() {
        return takeaway;
    }

    @JsonProperty("takeaway")
    public void setTakeaway(Integer takeaway) {
        this.takeaway = takeaway;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "HasMenuStatus{" +
                "delivery=" + delivery +
                ", takeaway=" + takeaway +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
