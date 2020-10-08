package integration.DTO;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "tint"
})
public class BgColor {

    @JsonProperty("type")
    private String type;
    @JsonProperty("tint")
    private String tint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("tint")
    public String getTint() {
        return tint;
    }

    @JsonProperty("tint")
    public void setTint(String tint) {
        this.tint = tint;
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
        return "BgColor{" +
                "type='" + type + '\'' +
                ", tint='" + tint + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

