package servicesgraph;

import coindesk.model.CoinDesk;
import model.Graph;
import model.OptionGraph;
import port.GraphRepository;

import java.util.List;


public class ExcelGeneratorGraph extends AbstractGraphServices implements GraphRepository{

    @Override
    public Graph generateGraph(OptionGraph optionGraph) {
        return null;
    }

    @Override
    public List<CoinDesk> applyOptionToList(List<CoinDesk> list, OptionGraph optionGraph) {
        return null;
    }

    @Override
    public List<CoinDesk> getListOfBotThreshold(List<CoinDesk> list, OptionGraph optionGraph) {
        return null;
    }

    @Override
    public List<CoinDesk> getListOfTopThreshold(List<CoinDesk> list, OptionGraph optionGraph) {
        return null;
    }
}
