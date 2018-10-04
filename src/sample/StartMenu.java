package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartMenu implements EventHandler<ActionEvent> {

    private Stage stage;

    GameRunner g1;
    public StartMenu (){
        //This allows us to access to GameRunner Singleton Class
        /*This Class can pass us useful info like Team stats (backlog/story points) without
        having to pass these things as a parameter. */
        g1=GameRunner.getInstance();
        stage=g1.getStage();
    }

    public Scene returnScene(){


        HBox startMenu = new HBox(20);
        startMenu.setAlignment(Pos.CENTER);
        Button startButton = new Button("Start Game");
        startButton.setOnAction(this);
        startMenu.getChildren().addAll(startButton);

        BorderPane layout1 = new BorderPane();
        layout1.setCenter(startMenu);

        Scene s1 = new Scene(layout1, 300, 250);
        return s1;
    }

    public void handle(ActionEvent event){
        CardPickTurn c1 = new CardPickTurn();
        g1.changeScene(c1.returnScene());

    }
}
