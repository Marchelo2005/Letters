module com.example.letters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.letters to javafx.fxml;
    exports com.example.letters;
}