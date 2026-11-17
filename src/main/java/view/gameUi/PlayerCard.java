package view.gameUi;

import model.Player;
import shared.GameConstants;

import javax.swing.*;
import java.awt.*;

public class PlayerCard extends JLabel {

    private static final int iconSize = 50;
    private static final int iconPadding = 5;
    JLabel[] deck = new JLabel[GameConstants.deckSize];
    public PlayerCard(){
        super("w player card");
        setSize(200,100);
        setOpaque(true);
        setBackground(Color.BLUE);

        //init icons
        for (int i=0; i<deck.length; i++){
            deck[i] = new JLabel();
            deck[i].setBounds(10+(int)(iconSize+iconPadding)*i,30,iconSize,iconSize);
            add(deck[i]);
        }
    }

    public void update(Player player){
        for (int i=0; i<deck.length; i++){
//            deck[i].setIcon(player.getDeck()[i].getIcon());
        }
    }
}
