package esgi.javafx;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import coindesk.model.CoinDesk;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import static services.CoinDeskService.getCoindeskHistorical;

public class SecondaryController {
    @FXML
    LineChart<String,Long> lineChart;
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    public void getHistorical(ActionEvent event){
        XYChart.Series<String,Long> series = new XYChart.Series<String, Long>();
        List<CoinDesk> list = getCoindeskHistorical();
        LocalDateTime currentTime = LocalDateTime.now();
        list.stream().forEach(f->series.getData().add(new XYChart.Data<String,Long>(f.getTime().toString(),f.getCurrency())));
        lineChart.getData().add(series);
    }
}