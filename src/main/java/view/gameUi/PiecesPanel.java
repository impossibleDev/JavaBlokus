package view.gameUi;

import shared.Team;

import javax.swing.*;

public class PiecesPanel extends JPanel {

    public PiecesPanel(){
        super(null);
//        setSize(200,600);
        //TEST PIECR RENDERER
        boolean[][] dataTest = new boolean[4][2];
        dataTest[0][0]=true;
        dataTest[0][1]=true;
        dataTest[1][0]=true;
        dataTest[1][1]=true;
        dataTest[2][0]=true;
        dataTest[3][1]=true;
        Piece testPiece = new Piece(dataTest, Team.RED);
        add(testPiece);
    }
}
