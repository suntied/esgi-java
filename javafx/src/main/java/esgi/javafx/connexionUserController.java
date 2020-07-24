package esgi.javafx;
import java.io.IOException;
import javafx.fxml.FXML;

public class connexionUserController {
    @FXML
    private void switchToInscription() throws IOException {
        App.setRoot("inscription");
    }

    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
}
