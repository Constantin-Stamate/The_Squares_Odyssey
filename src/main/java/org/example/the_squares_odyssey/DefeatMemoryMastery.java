package org.example.the_squares_odyssey;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class DefeatMemoryMastery extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        Image backgroundImage = new Image(getClass().getResource("/static/images/losses/defeat_2.png").toExternalForm());
        ImageView backgroundImageView = new ImageView(backgroundImage);

        Text textDefeat = new Text("You have lost the Memory Mastery Game!");
        textDefeat.setTranslateY(-280);
        textDefeat.getStyleClass().add("text-defeat");

        Button back = new Button();
        Image imageView = new Image(getClass().getResource("/static/images/elements/back_button.png").toExternalForm());
        ImageView imageBackView = new ImageView(imageView);
        back.setGraphic(imageBackView);
        imageBackView.setFitWidth(48);
        imageBackView.setFitHeight(48);
        back.getStyleClass().add("round-image-button");
        back.setTranslateY(-300);
        back.setTranslateX(400);

        back.setOnAction(e -> {
            Choice choice = new Choice();
            choice.start(primaryStage);
        });

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        String path = Paths.get("src/main/resources/templates/defeat.html").toUri().toString();
        webView.setStyle("-fx-background-color: transparent;");
        webView.setOpacity(0.1);

        webEngine.load(path);

        root.getChildren().add(backgroundImageView);
        root.getChildren().add(webView);
        root.getChildren().add(textDefeat);
        root.getChildren().add(back);
        root.setOpacity(1);

        Scene scene = new Scene(root, 1000, 700);
        scene.getStylesheets().add(getClass().getResource("/static/css/style.css").toExternalForm());

        primaryStage.setTitle("The Squares’ Odyssey");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
