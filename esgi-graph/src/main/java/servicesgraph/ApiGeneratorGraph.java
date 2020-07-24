package servicesgraph;

import coindesk.model.CoinDesk;
import model.Curve;
import model.Graph;
import model.OptionGraph;
import port.GraphRepository;

import java.time.LocalDate;
import java.util.List;

import static services.CoinDeskService.getCoindeskHistorical;

public class ApiGeneratorGraph extends AbstractGraphServices implements GraphRepository{
    @Override
    public Graph generateGraph(OptionGraph optionGraph) {
        List<CoinDesk> listOfCoindesk = getCoindeskHistorical();
        Curve curve = new Curve(listOfCoindesk);
        return new Graph(curve,null);
    }
    public List<CoinDesk> applyOptionToList (List<CoinDesk> list, OptionGraph optionGraph) {
        return applyOptionToListCoinDesk(list,optionGraph);
    }

    @Override
    public List<CoinDesk> getListOfBotThreshold(List<CoinDesk> list, OptionGraph optionGraph) {
        return getListOfCoinDeskBotThreshold(list,optionGraph);
    }
    @Override
    public List<CoinDesk> getListOfTopThreshold(List<CoinDesk> list, OptionGraph optionGraph) {
        return getListOfCoinDeskTopThreshold(list,optionGraph);
    }

}

