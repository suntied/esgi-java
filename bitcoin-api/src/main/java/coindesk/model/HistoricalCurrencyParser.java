package coindesk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalCurrencyParser{

    @JsonProperty("bpi")
    private Map<String,Double> bpi;

    public HistoricalCurrencyParser(){

    }
    public Map<String, Double> getBpi() {
        return bpi;
    }
}
