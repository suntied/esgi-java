package esgi.javafx;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import model.Graph;
import model.OptionGraph;
import port.GraphRepository;
import servicesgraph.ApiGeneratorGraph;


public class grapheController {
    private OptionGraph optionGraph;
    @FXML
    LineChart<String,Double> lineChart;

    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
    public void getHistorical(ActionEvent event){

        XYChart.Series<String,Double> series = new XYChart.Series<>();
        GraphRepository graphRepository = new ApiGeneratorGraph();
        //Get OptionGraph
        configOption();
        Graph graph = graphRepository.generateGraph(optionGraph);

        graph.getCurve().getListOfPoint().forEach(
                f->series.getData().add(
                        new XYChart.Data<String,Double>(
                                f.getTime().toString(),f.getCurrency())));
        lineChart.getData().add(series);
    }
    private void configOption(){
        if(optionGraph==null)
            optionGraph = new OptionGraph(null,null,null,null,null);
    }
    public void configBegin(String begin){
        optionGraph.setBegin(LocalDate.parse(begin));
    }
    public void configEnd(String end){
        optionGraph.setBegin(LocalDate.parse(end));
    }
    public void configBotThreshold(Double botThreshold){
        optionGraph.setBotThreshold(botThreshold);
    }
    public void configTopThreshold(Double topThreshold){
        optionGraph.setBotThreshold(topThreshold);
    }


}
