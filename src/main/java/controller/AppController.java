package controller;

import view.AppFrame;

public class AppController {

    private AppFrame view = new AppFrame();
    private GameController gamecontroller;
    private MenuController menucontroller;

    private void newGame(){
        gamecontroller = new GameController(view.getGameScreen());
        //new GameController(settings1, settings2, etc);
        // input paramters of settings stuff
    }
    private void exit(){
        //close window
    }
    public AppController(){
        //test code her for now
        newGame();
        view.toGameScreen();
//        view.getGameScreen().updateBoard(gamecontroller.getBoard());
    }
}
