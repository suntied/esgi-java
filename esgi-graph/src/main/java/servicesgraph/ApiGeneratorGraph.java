package servicesgraph;

import coindesk.model.CoinDesk;
import model.Curve;
import model.Graph;
import port.GraphRepository;

import java.time.LocalDate;
import java.util.List;

import static services.CoinDeskService.getCoindeskHistorical;

public class ApiGeneratorGraph implements GraphRepository {
    @Override
    public Graph generateGraph(LocalDate time) {
        List<CoinDesk> listOfCoindesk = getCoindeskHistorical();
        Curve curve = new Curve(listOfCoindesk);
        return new Graph(curve,null);
    }
}
