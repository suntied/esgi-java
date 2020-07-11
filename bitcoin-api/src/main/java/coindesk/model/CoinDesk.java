package coindesk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinDesk {
    @JsonProperty("time")
    private TimeBuilder time;
    @JsonProperty("bpi")
    private Map<String, DataCurrency> bpi;

}
