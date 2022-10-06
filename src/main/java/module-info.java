module com.example.coronasoftware {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.coronasoftware to javafx.graphics, javafx.base;
    exports com.example.coronasoftware;
    exports ui;
    opens ui to javafx.base, javafx.graphics;
}