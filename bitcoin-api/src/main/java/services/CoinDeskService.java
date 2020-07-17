package services;

import coindesk.CoinDeskRepository;
import coindesk.exception.CoinDeskException;
import coindesk.historical.HistoricalData;
import coindesk.model.CoinDesk;
import coindesk.model.HistoricalCurrencyParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CoinDeskService {

    //Doenst work anywmore cause of realtime useless
    /*
    public CoinDesk parseJsonRealTimeToCoinDesk(String responseCoinDesk){
        CoinDesk coinDesk = new CoinDesk();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            coinDesk = objectMapper.readValue(responseCoinDesk, CoinDesk.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return coinDesk;
    }

     */


    public HistoricalCurrencyParser parseHistoricalToHistoricalObject(String responseCoinDesk){
        HistoricalCurrencyParser parser = new HistoricalCurrencyParser();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            parser = objectMapper.readValue(responseCoinDesk, HistoricalCurrencyParser.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return parser;
    }
    public List<CoinDesk> parserHistoricalToCoinDesk(HistoricalCurrencyParser historicalCurrencyParser){
        List<CoinDesk> list = new LinkedList<>();
        historicalCurrencyParser.getBpi().forEach((key, value) -> list.add(new CoinDesk(key, value)));
        return list;
    }
    public static List<CoinDesk> getCoindeskHistorical(){
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
        return coinDesk;
    }
}
