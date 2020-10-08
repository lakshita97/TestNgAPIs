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
        "has_menu_status",
        "res_id",
        "is_grocery_store"
})
public class R {

    @JsonProperty("has_menu_status")
    private HasMenuStatus hasMenuStatus;
    @JsonProperty("res_id")
    private Integer resId;
    @JsonProperty("is_grocery_store")
    private Boolean isGroceryStore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("has_menu_status")
    public HasMenuStatus getHasMenuStatus() {
        return hasMenuStatus;
    }

    @JsonProperty("has_menu_status")
    public void setHasMenuStatus(HasMenuStatus hasMenuStatus) {
        this.hasMenuStatus = hasMenuStatus;
    }

    @JsonProperty("res_id")
    public Integer getResId() {
        return resId;
    }

    @JsonProperty("res_id")
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @JsonProperty("is_grocery_store")
    public Boolean getIsGroceryStore() {
        return isGroceryStore;
    }

    @JsonProperty("is_grocery_store")
    public void setIsGroceryStore(Boolean isGroceryStore) {
        this.isGroceryStore = isGroceryStore;
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
        return "R{" +
                "hasMenuStatus=" + hasMenuStatus +
                ", resId=" + resId +
                ", isGroceryStore=" + isGroceryStore +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
