package coindesk.model;

import java.util.Map;

public class CurrencyBuilder {
    //Map<String,Currency> currencyName;
    private Currency usd;
    private Currency gbp;
    private Currency eur;

    public CurrencyBuilder(){

    }

    public CurrencyBuilder(Currency usd, Currency gbp, Currency eur) {
        this.usd = usd;
        this.gbp = gbp;
        this.eur = eur;
    }
}
