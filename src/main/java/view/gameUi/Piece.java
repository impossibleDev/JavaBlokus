package view.gameUi;

import shared.GameConstants;
import shared.Team;

import javax.swing.*;
import java.awt.*;

import static view.ViewConstants.teamColors;
import static view.ViewConstants.blockSize;
import static view.ViewConstants.blockPadding;


public class Piece extends JButton {
    private Team team;
    private boolean[][] data;

    public Piece(boolean[][] data, Team team){
        setData(data);
        setTeam(team);
    }

    public void setData(boolean[][] data){
        this.data = data;
        setSize(blockSize*data.length, blockSize*data[0].length);
    }
    public void setTeam(Team team){
        this.team = team;
        //COLOR CHANGE CODE??
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x< data.length; x++){
            for (int y=0; y<data[0].length; y++){
                //draw tile
                g.setColor(teamColors.get(team));
                if (data[x][y])
                    g.fillRoundRect(x*blockSize, y*blockSize, blockSize-blockPadding, blockSize-blockPadding, 2,2);
            }
        }
    }
}
