module org.example.odyssey {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;
    requires javafx.media;
    requires javafx.web;
    requires java.desktop;
    requires javafx.swing;
    requires javafx.graphics;

    exports org.example.odyssey;
    opens org.example.odyssey to javafx.fxml;

    exports games;
    opens games to javafx.fxml;
}