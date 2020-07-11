package services;

import coindesk.model.CoinDesk;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinDeskService {

    public CoinDesk parseJsonToCoinDesk(String responseCoinDesk){
        CoinDesk coinDesk = new CoinDesk();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            coinDesk = objectMapper.readValue(responseCoinDesk, CoinDesk.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return coinDesk;
    }
}
