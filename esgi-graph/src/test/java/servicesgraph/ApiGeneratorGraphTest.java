package servicesgraph;

import coindesk.model.CoinDesk;
import model.Graph;
import model.OptionGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import port.GraphRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


class ApiGeneratorGraphTest {
    String begin;
    String end;
    Double topThreshold;
    Double botThreshold;

    {
        begin = "2020-06-26";
        end = "2020-06-29";
        topThreshold = 9500d;
        botThreshold = 9400d;
    }
    @Test
    void generateGraphFromBegin() {
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        OptionGraph optionGraph = new OptionGraph(null,null,null,null,null);

        LocalDate time= LocalDate.parse(begin);
        optionGraph.setBegin(time);
        Graph graph = graphRepository.generateGraph(optionGraph);
        List<CoinDesk> list = graphRepository.applyOptionToList(graph.getCurve().getListOfPoint(),optionGraph);
        Assertions.assertNotNull(list);
    }
    @Test
    void generateGraphFromEnd() {
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        OptionGraph optionGraph = new OptionGraph(null,null,null,null,null);
        LocalDate time= LocalDate.parse(end);
        optionGraph.setEnd(time);
        Graph graph = graphRepository.generateGraph(optionGraph);
        List<CoinDesk> list = graphRepository.applyOptionToList(graph.getCurve().getListOfPoint(),optionGraph);
        Assertions.assertNotNull(list);
    }
    @Test
    void generateGraphFromBeginAndEnd() {
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        OptionGraph optionGraph = new OptionGraph(null,null,null,null,null);
        LocalDate time= LocalDate.parse(begin);
        LocalDate timeEnd = LocalDate.parse(end);
        optionGraph.setBegin(time);
        optionGraph.setEnd(timeEnd);
        Graph graph = graphRepository.generateGraph(optionGraph);
        List<CoinDesk> list = graphRepository.applyOptionToList(graph.getCurve().getListOfPoint(),optionGraph);
        Assertions.assertNotNull(list);
    }
    @Test
    void generateGraphFromTopThreshold() {
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        OptionGraph optionGraph = new OptionGraph(null,null,null,null,null);
        optionGraph.setTopThreshold(topThreshold);
        Graph graph = graphRepository.generateGraph(optionGraph);
        List<CoinDesk> list = graphRepository.getListOfTopThreshold(graph.getCurve().getListOfPoint(),optionGraph);
        Assertions.assertNotNull(list);
    }
    @Test
    void generateGraphFromBotTreshold() {
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        OptionGraph optionGraph = new OptionGraph(null,null,null,null,null);
        LocalDate time= LocalDate.parse(begin);
        optionGraph.setBotThreshold(botThreshold);

        Graph graph = graphRepository.generateGraph(optionGraph);
        List<CoinDesk> list = graphRepository.getListOfBotThreshold(graph.getCurve().getListOfPoint(),optionGraph);
        Assertions.assertNotNull(list);
    }
    @Test
    void readExcelData(){

    }

}