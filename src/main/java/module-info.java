module com.example.lab6_v2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab6_v2 to javafx.fxml;
    exports com.example.lab6_v2;
}