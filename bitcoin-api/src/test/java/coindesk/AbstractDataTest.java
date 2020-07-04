package coindesk;

import coindesk.exception.CoinDeskException;
import coindesk.model.CoinDesk;
import coindesk.realtime.RealTimeData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.CoinDeskService;

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
    void getCoinDesk(){
        String json = "";
        try {
            CoinDeskRepository realTimeData = new RealTimeData();
            realTimeData.getBPI();
            json = realTimeData.getLastResponse();
        } catch (CoinDeskException e) {
            e.printStackTrace(System.err);
        }
        CoinDesk coinDesk = new CoinDeskService().parseJsonToCoinDesk(json);
        Assertions.assertNotNull(coinDesk);
    }
}