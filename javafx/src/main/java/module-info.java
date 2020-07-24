module esgi.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires esgi.graph;
    requires bitcoin.api;

    opens esgi.javafx to javafx.fxml;
    exports esgi.javafx;
}