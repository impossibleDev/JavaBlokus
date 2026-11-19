package controller;

import view.AppFrame;

public class AppController {

    private AppFrame view = new AppFrame();
    private GameController gameController;
    private MenuController menuController;

    private void newGame(){
        gameController = new GameController(view.getGameScreen());
        menuController = new MenuController(view.getMenuScreen());
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
    }
}
