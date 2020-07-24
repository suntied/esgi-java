package coindesk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalCurrencyParser{

    @JsonProperty("bpi")
    private Map<String,Long> bpi;

    public HistoricalCurrencyParser(){

    }
    public Map<String, Long> getBpi() {
        return bpi;
    }
}
