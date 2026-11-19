package view.gameUi;

import shared.PieceData;
import shared.Team;

import javax.swing.*;

//Aiden

//TODO someone work on autolayout/positioning the pieces[] !!!
public class PiecesPanel extends JPanel {

    Piece[] pieces;
    Piece selectedPiece;

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

        //load pieces from PieceData
        pieces = new Piece[PieceData.pieces.length];
        for (int i=0; i< pieces.length; i++){
            pieces[i] = new Piece(PieceData.pieces[i], Team.RED); //red for testing, dosent matter
            add(pieces[i]);
        }

    }

    public Piece[] getPieces() {
        return pieces;
    }
}
