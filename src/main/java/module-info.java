module com.example.tictactoenov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoenov to javafx.fxml;
    exports com.example.tictactoenov;
}