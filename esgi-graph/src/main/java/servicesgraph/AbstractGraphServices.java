package servicesgraph;

import coindesk.model.CoinDesk;
import model.OptionGraph;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractGraphServices {
    public List<CoinDesk> applyOptionToListCoinDesk(List<CoinDesk> list, OptionGraph optionGraph) {
        List<CoinDesk> listToReturn = list;
        if(optionGraph.getBegin() != null){
            for(CoinDesk coinDesk:list){
                if(coinDesk.getTime().equals(optionGraph.getBegin()))
                    listToReturn = listToReturn.subList(listToReturn.indexOf(coinDesk),list.size());
            }
        }
        if(optionGraph.getEnd() != null){
            for(CoinDesk coinDesk:list){
                if(coinDesk.getTime().equals(optionGraph.getEnd()))
                    listToReturn = listToReturn.subList(0,listToReturn.indexOf(coinDesk) +1);
            }
        }
        return listToReturn;
    }
    List<CoinDesk> getListOfCoinDeskBotThreshold(List<CoinDesk> list, OptionGraph optionGraph){
        List<CoinDesk> listToReturn = new ArrayList<>();
        for(CoinDesk coinDesk:list){
            if(coinDesk.getCurrency() <= optionGraph.getBotThreshold()){
                listToReturn.add(coinDesk);
            }
        }
        return listToReturn;
    }
    List<CoinDesk> getListOfCoinDeskTopThreshold(List<CoinDesk> list, OptionGraph optionGraph) {
        List<CoinDesk> listToReturn = new ArrayList<>();
        for(CoinDesk coinDesk:list){
            if(coinDesk.getCurrency() >= optionGraph.getTopThreshold()){
                listToReturn.add(coinDesk);
            }
        }
        return listToReturn;
    }
}
