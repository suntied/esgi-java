package coindesk;

import coindesk.exception.CoinDeskException;
import coindesk.historical.HistoricalData;
import coindesk.model.CoinDesk;
import coindesk.model.HistoricalCurrencyParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.CoinDeskService;

import java.time.LocalDate;
import java.util.List;

class AbstractDataTest {
    LocalDate localDate;
    LocalDate localDateEnd;
    {
        localDate = LocalDate.of(2018, 1, 1);
        localDateEnd = LocalDate.of(2020,1,1);
    }
    @Test
    void getRealTimeDate() {
        try {
            CoinDeskRepository historicalData = new HistoricalData();
            historicalData.getBPI(localDate,localDateEnd,"EUR");
            System.out.println(historicalData.getLastResponse());
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