package coindesk.model;

import java.time.LocalDate;


public class CoinDesk {
    private final LocalDate time;
    private final Long currency;

    public CoinDesk(String time, Long currency){
        this.time= LocalDate.parse(time);
        this.currency=currency;
    }

    public CoinDesk(LocalDate time, Long currency) {
        this.time = time;
        this.currency = currency;
    }

    public LocalDate getTime() {
        return time;
    }

    public Long getCurrency() {
        return currency;
    }
}
