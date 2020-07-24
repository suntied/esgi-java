package coindesk;

import coindesk.exception.CoinDeskException;

import java.time.LocalDate;

public interface CoinDeskRepository {
    String COIN_DESK_URL_BASE = "https://api.coindesk.com/v1/bpi";
    void getBPI() throws CoinDeskException;
    String getLastResponse();
    void getBPI(LocalDate start, LocalDate end) throws CoinDeskException;
    void getBPI(LocalDate start, LocalDate end, String currency) throws CoinDeskException;
}
