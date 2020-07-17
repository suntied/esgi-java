package coindesk.model;

import java.time.LocalDate;


public class CoinDesk {
    private LocalDate time;
    private Long currency;

    public CoinDesk(String time, Long currency){
        LocalDate localDate = LocalDate.parse(time);
        this.time=localDate;
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
