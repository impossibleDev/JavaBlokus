package controller;

import model.Game;
import shared.Team;
import view.*;
import view.gameUi.Piece;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Aiden
public class GameController implements ActionListener, MouseListener {
    //controls the GameScreen input and stuff
    private Game model = new Game();
    private GameScreen gameScreen;

    public GameController(GameScreen gamescreen){
        this.gameScreen = gamescreen;
        gameScreen.update(model.getBoard());
        //Adding listeners
        for (Piece piece : gamescreen.getPiecePanel().getPieces()){
            piece.addActionListener(this);
            piece.addMouseListener(this);
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Piece) {
            Piece clickedPiece = (Piece) e.getSource();
            // handle piece click, selected piece is this piece
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //if mouse is inside boardpanel, add snapped pos to board, play ur turn!
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof Piece) {
            Piece clickedPiece = (Piece) e.getSource();
            // handle piece hover animation
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
