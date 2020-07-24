package esgi.javafx;
import java.io.IOException;
import javafx.fxml.FXML;

public class connexionUserController {
    @FXML
    private void switchToInscription() throws IOException {
        App.setRoot("registration");
    }

    @FXML
    private void switchToProfile() throws IOException {
        App.setRoot("profil");
    }
}
