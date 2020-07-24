package coindesk;

import coindesk.exception.CoinDeskException;
import coindesk.historical.HistoricalData;
import coindesk.model.CoinDesk;
import coindesk.model.HistoricalCurrencyParser;
import coindesk.realtime.RealTimeData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.CoinDeskService;

import java.util.List;

class AbstractDataTest {

    @Test
    void getRealTimeDate() {
        try {
            CoinDeskRepository realTimeData = new RealTimeData();
            realTimeData.getBPI();
            System.out.println(realTimeData.getLastResponse());
        } catch (CoinDeskException e) {
            e.printStackTrace(System.err);
        }
    }
    @Test
    void getHistorialCoinDesk(){
        String json = "";
        try {
            CoinDeskRepository historicalData= new HistoricalData();
            historicalData.getBPI();
            json = historicalData.getLastResponse();
        } catch (CoinDeskException e) {
            e.printStackTrace(System.err);
        }
        HistoricalCurrencyParser historicalCurrencyParser = new CoinDeskService().parseHistoricalToHistoricalObject(json);
        List<CoinDesk> coinDesk = new CoinDeskService().parserHistoricalToCoinDesk(historicalCurrencyParser);
        Assertions.assertNotNull(coinDesk);
    }
}