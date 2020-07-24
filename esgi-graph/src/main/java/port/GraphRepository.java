package port;

import coindesk.model.CoinDesk;
import model.Graph;
import model.OptionGraph;

import java.time.LocalDate;
import java.util.List;

public interface GraphRepository {
    Graph generateGraph(OptionGraph optionGraph);
    List<CoinDesk> applyOptionToList (List<CoinDesk> list, OptionGraph optionGraph);
    List<CoinDesk> getListOfBotThreshold(List<CoinDesk> list, OptionGraph optionGraph);
    List<CoinDesk> getListOfTopThreshold(List<CoinDesk> list, OptionGraph optionGraph);
}
