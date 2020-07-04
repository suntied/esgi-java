package services;

import coindesk.model.CoinDesk;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinDeskService {
    public CoinDesk parseJsonToCoinDesk(String responseCoinDesk){
        CoinDesk coinDesk = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            coinDesk = objectMapper.readValue(responseCoinDesk, CoinDesk.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return coinDesk;
    }
}
