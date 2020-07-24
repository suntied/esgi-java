package esgi.javafx;
import java.io.IOException;
import javafx.fxml.FXML;

public class profileController {
    @FXML
    private void switchToGraphe() throws IOException {
        App.setRoot("graph");
    }
    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
}
