package esgi.javafx;

import javafx.fxml.FXML;

import java.io.IOException;

public class inscriptionController {
    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
}
