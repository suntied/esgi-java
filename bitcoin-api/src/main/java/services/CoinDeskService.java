package services;

import coindesk.CoinDeskRepository;
import coindesk.exception.CoinDeskException;
import coindesk.historical.HistoricalData;
import coindesk.model.CoinDesk;
import coindesk.model.HistoricalCurrencyParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
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
        return getCoinDesks("","","");

    }
    public static List<CoinDesk> getCoindeskHistoricalWithDatesAndCurrency(String dateBegin, String dateEnd, String currency){
        return getCoinDesks(dateBegin,dateEnd,currency);
    }
    public static List<CoinDesk> getCoindeskHistoricalWithDatesOnly(String dateBegin, String dateEnd){
        return getCoinDesks(dateBegin,dateEnd,"");
    }

    private static List<CoinDesk> getCoinDesks(String dateBegin, String dateEnd, String currency) {
        String json = "";
        if (dateBegin.equals("") && dateEnd.equals("") && currency.equals("")) {
            try {
                CoinDeskRepository historicalData = new HistoricalData();
                historicalData.getBPI();
                json = historicalData.getLastResponse();
            } catch (CoinDeskException e) {
                e.printStackTrace(System.err);
            }
            HistoricalCurrencyParser historicalCurrencyParser = new CoinDeskService().parseHistoricalToHistoricalObject(json);
            return new CoinDeskService().parserHistoricalToCoinDesk(historicalCurrencyParser);
        }else if(!dateBegin.equals("") && !dateEnd.equals("") && currency.equals("")){
            try {
                CoinDeskRepository historicalData = new HistoricalData();
                historicalData.getBPI(LocalDate.parse(dateBegin),LocalDate.parse(dateEnd));
                json = historicalData.getLastResponse();
            } catch (CoinDeskException e) {
                e.printStackTrace(System.err);
            }
            HistoricalCurrencyParser historicalCurrencyParser = new CoinDeskService().parseHistoricalToHistoricalObject(json);
            return new CoinDeskService().parserHistoricalToCoinDesk(historicalCurrencyParser);
        }else{

            try {
                CoinDeskRepository historicalData = new HistoricalData();
                historicalData.getBPI(LocalDate.parse(dateBegin),LocalDate.parse(dateEnd),currency);
                json = historicalData.getLastResponse();
            } catch (CoinDeskException e) {
                e.printStackTrace(System.err);
            }
            HistoricalCurrencyParser historicalCurrencyParser = new CoinDeskService().parseHistoricalToHistoricalObject(json);
            return new CoinDeskService().parserHistoricalToCoinDesk(historicalCurrencyParser);
        }
    }
}
