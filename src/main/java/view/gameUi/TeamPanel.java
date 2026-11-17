package view.gameUi;

import shared.GameConstants;

import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JLabel {

    //CONSTANTS
    private static final int deckIconSize = 75;
    private static final int deckIconPadding = 10;
    private static final int playerCardDistance = 125;

    //UI ELEMNTS
    private TimerIcon timerIcon = new TimerIcon(GameConstants.maxTime);
    private PlayerCard[] playerCard = new PlayerCard[4];
    private JLabel[] currentDeck = new JLabel[GameConstants.deckSize];


    public TeamPanel(){
        super("cool teams");
        setOpaque(true);
        setBackground(Color.CYAN);
//        setSize(150,600);

        //Init PlayerCards
        for (int i=0; i<4; i++){
            playerCard[i] = new PlayerCard();
            playerCard[i].setLocation(20, 20+ i*playerCardDistance);
            add(playerCard[i]);
        }

        //Init currentDeck icons
        for (int i=0; i<currentDeck.length; i++){
            currentDeck[i] = new JLabel("🃏");
            currentDeck[i].setBounds(10+(int)(deckIconSize+deckIconPadding)*i,600,deckIconSize,deckIconSize);
            add(currentDeck[i]);
        }

        //Init timerIcon
        timerIcon.setLocation(150, 500);
        add(timerIcon);
    }
}
