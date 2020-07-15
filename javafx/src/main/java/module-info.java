module esgi.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires domain;

    opens esgi.javafx to javafx.fxml;
    exports esgi.javafx;
}