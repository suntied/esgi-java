package coindesk.realtime;

import coindesk.AbstractData;
import coindesk.exception.CoinDeskException;

public class RealTimeData extends AbstractData {

    private static final String REAL_TIME_ENDPOINT = COIN_DESK_URL_BASE + "/currentprice.json";

    /**
     *
     * @throws CoinDeskException
     */
    public RealTimeData() throws CoinDeskException {
        super();
        super.setURL(REAL_TIME_ENDPOINT);
    }
    @Override
    public void getBPI() throws CoinDeskException {
        super.setURL(REAL_TIME_ENDPOINT);
        getBPI(getURL());
    }
    public void getBPI(String currencyCode) throws CoinDeskException {
        setURL(REAL_TIME_ENDPOINT.replace(".json", String.format("/%s.json", currencyCode)));
        getBPI(getURL());
    }
}
