package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CardPickTurn {
    Scene scene;

    public CardPickTurn(){
        GameRunner g1=GameRunner.getInstance();
    }

    public Scene returnScene(){
        VBox backlogTeam1 = new VBox(5);
        Label teamName = new Label("Team 1");
        Label story1 = new Label("Story 1");
        Label story2 = new Label("Story 2");
        backlogTeam1.getChildren().addAll(teamName,story1,story2);

        VBox cardChoices = new VBox(20);
        cardChoices.setAlignment(Pos.CENTER);
        Label card1 = new Label("Card 1");
        Label card2 = new Label("Card 2");
        Label card3 = new Label("Card 3");
        Label card4 = new Label("Card 4");
        cardChoices.getChildren().addAll(card1, card2, card3, card4);

        HBox selectCards = new HBox(20);
        selectCards.setAlignment(Pos.CENTER);
        Button select = new Button("Confirm Cards");
        selectCards.getChildren().addAll(select);


        BorderPane layout1 = new BorderPane();
        layout1.setCenter(cardChoices);
        layout1.setLeft(backlogTeam1);
        layout1.setBottom(selectCards);

        scene = new Scene(layout1, 300, 250);

        return scene;
    }

}
