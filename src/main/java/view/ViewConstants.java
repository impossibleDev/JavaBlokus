package view;

import shared.CardTypes;
import shared.Team;

import javax.swing.*;
import java.awt.*;
import java.util.EnumMap;

public class ViewConstants {
    public static final EnumMap<Team, Color> teamColors = new EnumMap<>(Team.class);
    public static final EnumMap<CardTypes, ImageIcon> cardImages = new EnumMap<>(CardTypes.class);
    public static final int blockSize = 20; //or mabye blockSize is dynmaic to JPanle size?
    public static final int blockPadding = 2;
    static {

        //TEAM COLORS
        teamColors.put(Team.NULL, Color.GRAY);
        teamColors.put(Team.YELLOW, Color.YELLOW);
        teamColors.put(Team.RED, Color.RED);
        teamColors.put(Team.GREEN, Color.GREEN);
        teamColors.put(Team.BLUE, Color.BLUE);

        //CARD IMAGES
        cardImages.put(CardTypes.SKIP, new ImageIcon(ViewConstants.class.getResource("/cards/skip.jpg")));
        cardImages.put(CardTypes.BOMB, new ImageIcon(ViewConstants.class.getResource("/cards/bomb.jpg")));
    }

}
