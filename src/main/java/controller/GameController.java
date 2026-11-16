package controller;

import model.Game;
import view.*;

public class GameController {
    //controls the GameScreen input and stuff
    private Game model = new Game();
    private GameScreen gameScreen = new GameScreen();

    public GameController(){
        gameScreen.updateBoard(model.getBoard());
        System.out.print("updatee");
    }
}
