module org.example.the_squares_odyssey {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;
    requires javafx.media;
    requires javafx.web;
    requires java.desktop;
    requires javafx.swing;
    requires javafx.graphics;

    exports org.example.the_squares_odyssey;
    opens org.example.the_squares_odyssey to javafx.fxml;

    exports games;
    opens games to javafx.fxml;
}