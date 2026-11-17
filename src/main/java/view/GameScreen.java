package view;

import shared.Team;
import view.gameUi.BoardPanel;
import view.gameUi.Piece;
import view.gameUi.PiecesPanel;
import view.gameUi.TeamPanel;

import javax.swing.*;

public class GameScreen extends Screen{
	
    private BoardPanel boardPanel;
    private TeamPanel teamPanel;
    private PiecesPanel piecesPanel;
    private Piece dragPiece;
    JLabel[] teamBgCorner;

    public GameScreen(){
        super();
        //add boardPanel
        boardPanel = new BoardPanel();
        teamPanel = new TeamPanel();
        piecesPanel = new PiecesPanel();

        add(boardPanel);
        add(teamPanel);
        add(piecesPanel);

        boardPanel.setVisible(true);

    }

    public void update(Team[][] board){
        this.boardPanel.updateBoard(board);
    }

    public void setCurrentTeam(){

    }
    @Override
    public void resize(){
        super.resize();
        boardPanel.setBounds((int)(getWidth()/2-200),50,400,400);
        teamPanel.setBounds(100,50,300,800);;
        piecesPanel.setBounds(getWidth()-250,50,150,400);
    }

}
