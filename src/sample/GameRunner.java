package sample;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameRunner {
    private static GameRunner single_instance = null;
    private Stage mainStage;
    private Scene mainScene;

    //private Team team1;
    //private Team team2;


    private GameRunner() {
    }


    public void startGame() {
        StartMenu m1 = new StartMenu();
        changeScene(m1.returnScene());
    }

    public static GameRunner getInstance() {
        if (single_instance == null) {
            single_instance = new GameRunner();
        }
        return single_instance;
    }

    public void setStage(Stage s) {
        mainStage = s;
    }

    public Stage getStage() {
        return mainStage;
    }

    public void changeScene(Scene s) {
        mainScene = s;
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    //Want to be able to pass teams through this singleton class.
    /*public Team getTeam1(){
       return team1;
      }
   */

    /*public Team getTeam2(){
       return team2;
      }
   */
}
