package coindesk.model;

public class Currency {
    private String code;
    private String symbol;
    private String rate;
    //Maybe remove this
    private String description;

    public Currency(){}
    public Currency(String code, String symbol, String rate, String description) {
        this.code = code;
        this.symbol = symbol;
        this.rate = rate;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getRate() {
        return rate;
    }

    public String getDescription() {
        return description;
    }
}
