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
import port.GraphRepository;
import servicesgraph.ApiGeneratorGraph;


public class grapheController {
    @FXML
    LineChart<String,Long> lineChart;
    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
    public void getHistorical(ActionEvent event){

        XYChart.Series<String,Long> series = new XYChart.Series<String, Long>();
        GraphRepository graphRepository = new ApiGeneratorGraph();
        Graph graph = graphRepository.generateGraph(LocalDate.now());
        LocalDateTime currentTime = LocalDateTime.now();

        graph.getCurve().getListOfPoint().forEach(f->series.getData().add(new XYChart.Data<String,Long>(f.getTime().toString(),f.getCurrency())));
        lineChart.getData().add(series);


    }

}
