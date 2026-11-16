package oldIgnore.view;

import oldIgnore.shared.Team;

import java.awt.*;
import java.util.EnumMap;

public class ViewConstants {
    public static final EnumMap<Team, Color> teamColors = new EnumMap<>(Team.class);

    static {
        teamColors.put(Team.NULL, Color.GRAY);
        teamColors.put(Team.YELLOW, Color.YELLOW);
        teamColors.put(Team.RED, Color.RED);
        teamColors.put(Team.GREEN, Color.GREEN);
        teamColors.put(Team.BLUE, Color.BLUE);
    }

}
