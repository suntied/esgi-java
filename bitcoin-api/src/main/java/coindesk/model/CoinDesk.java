package coindesk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinDesk {
    private TimeBuilder time;
    private CurrencyBuilder bpi;

    public CoinDesk(){}
    public CoinDesk(TimeBuilder time, CurrencyBuilder bpi) {
        this.time = time;
        this.bpi = bpi;
    }
}
