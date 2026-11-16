package controller;

import model.Game;
import shared.Team;
import view.*;

public class GameController {
    //controls the GameScreen input and stuff
    private Game model = new Game();
    private GameScreen gameScreen;

    public GameController(GameScreen gamescreen){
        this.gameScreen = gamescreen;
        gameScreen.update(model.getBoard());
        System.out.print("updatee");
    }

}
