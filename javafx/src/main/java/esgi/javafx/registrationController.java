package esgi.javafx;

import javafx.fxml.FXML;

import java.io.IOException;

public class registrationController {
    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
    @FXML
    private void switchToConnexion() throws IOException {
        App.setRoot("connexionUser");
    }
}
