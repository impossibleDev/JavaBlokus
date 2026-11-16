package view;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AppFrame extends JFrame {
    //SCREENS
    private GameScreen gameScreen = new GameScreen();
    private MenuScreen menuScreen = new MenuScreen();

    //CURRENTSCREEN
    private Screen screen;

    public AppFrame(){
        super("Blockus");

        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //automatic screen resizing
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (screen != null) {
                    screen.resize();
                }
            }
        });

        setVisible(true);
    }


    public void toGameScreen(){
        setScreen(gameScreen);
    }

    public void toMenuScreen(){
        setScreen(gameScreen);
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    private void setScreen(Screen screen) {
        if (this.screen != null) {
            this.screen.setVisible(false);
            remove(this.screen);
        }
        this.screen = screen;
        screen.setVisible(true);
        add(screen);
        screen.resize();
    }


}
