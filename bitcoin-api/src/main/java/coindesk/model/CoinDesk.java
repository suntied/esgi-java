package coindesk.model;

import java.time.LocalDate;


public class CoinDesk {
    private final LocalDate time;
    private final Double currency;

    public CoinDesk(String time, Double currency){
        this.time= LocalDate.parse(time);
        this.currency=currency;
    }

    public CoinDesk(LocalDate time, Double currency) {
        this.time = time;
        this.currency = currency;
    }

    public LocalDate getTime() {
        return time;
    }

    public Double getCurrency() {
        return currency;
    }
}
