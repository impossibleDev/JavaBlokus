package view;

import shared.Team;

import java.awt.*;
import java.util.EnumMap;

public class ViewConstants {
    public static final EnumMap<Team, Color> teamColors = new EnumMap<>(Team.class);
    public static final int blockSize = 20; //or mabye blockSize is dynmaic to JPanle size?
    public static final int blockPadding = 2;
    static {
        teamColors.put(Team.NULL, Color.GRAY);
        teamColors.put(Team.YELLOW, Color.YELLOW);
        teamColors.put(Team.RED, Color.RED);
        teamColors.put(Team.GREEN, Color.GREEN);
        teamColors.put(Team.BLUE, Color.BLUE);
    }

}
