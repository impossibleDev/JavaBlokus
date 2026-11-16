package view.gameUi;

import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JLabel {

    private PlayerCard[] playerCard;
    public TeamPanel(){
        super("cool teams");
        setOpaque(true);
        setBackground(Color.CYAN);
        setSize(150,400);
    }
}
