module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires junit;


    opens com.example.demo to javafx.fxml;
    exports java.com.example.demo;
}