package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage window;

    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        GameRunner g1 = GameRunner.getInstance();
        g1.setStage(window);
        g1.startGame();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
