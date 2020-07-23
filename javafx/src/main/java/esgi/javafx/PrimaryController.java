package esgi.javafx;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class PrimaryController {



    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
