package view.gameUi;

import shared.GameConstants;
import shared.Team;

import javax.swing.*;
import java.awt.*;

import static view.ViewConstants.teamColors;
import static view.ViewConstants.blockSize;
import static view.ViewConstants.blockPadding;

public class BoardPanel extends JPanel {

    private Team[][] board;
    public BoardPanel(){
        super();
        setSize(400,400);
    }

    public void updateBoard(Team[][] board){
        this.board = board;
        System.out.print("MM!!");
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (board == null) return;
        for (int x = 0; x< GameConstants.boardSize; x++){
            for (int y=0; y<GameConstants.boardSize; y++){
                //draw tile
                g.setColor(teamColors.get(board[x][y]));
                if (board[x][y]== Team.NULL)
                    g.fillRect(x*blockSize, y*blockSize, blockSize-blockPadding, blockSize-blockPadding);
                else
                    g.fillRoundRect(x*blockSize, y*blockSize, blockSize-blockPadding, blockSize-blockPadding, 2,2);
            }
        }
    }
}
