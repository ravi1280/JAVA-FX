module com.example.fxpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.example.fxpractice to javafx.fxml;
    opens com.example.fxpractice.controller to javafx.fxml;
    exports com.example.fxpractice;
}
