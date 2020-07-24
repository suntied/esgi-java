package coindesk;

import coindesk.exception.CoinDeskException;

public interface CoinDeskRepository {
    String COIN_DESK_URL_BASE = "https://api.coindesk.com/v1/bpi";
    void getBPI() throws CoinDeskException;
    String getLastResponse();
}
