package view.gameUi;

import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JLabel {
    private static final int playerCardDistance = 150;
    private PlayerCard[] playerCard = new PlayerCard[4];
    public TeamPanel(){
        super("cool teams");
        setOpaque(true);
        setBackground(Color.CYAN);
        setSize(150,400);

        //create paler cards
        for (int i=0; i<4; i++){
            playerCard[i] = new PlayerCard();
            playerCard[i].setLocation(20, 20+ i*playerCardDistance);
            add(playerCard[i]);
        }
    }
}
