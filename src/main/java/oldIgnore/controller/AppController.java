package oldIgnore.controller;

import oldIgnore.view.AppFrame;

public class AppController {

    private AppFrame view = new AppFrame();
    private GameController gamecontroller;
    private MenuController menucontroller;

    private void newGame(){
        gamecontroller = new GameController();
        //new GameController(settings1, settings2, etc);
        // input paramters of settings stuff
    }
    private void exit(){
        //close window
    }
    public AppController(){
        //test code her for now
        view.showGameScreen();
    }
}
