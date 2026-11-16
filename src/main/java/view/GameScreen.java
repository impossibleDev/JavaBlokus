package view;

import shared.Team;

public class GameScreen extends Screen{
    private BoardPanel boardPanel;
    private PiecesPanel piecesPanel;

    public GameScreen(){
        super();
        //add boardPanel
        boardPanel = new BoardPanel();

        //add piecesPanel
        piecesPanel = new PiecesPanel();

        add(boardPanel);
        add(piecesPanel);

        boardPanel.setVisible(true);

    }

    public void update(Team[][] board){
        this.boardPanel.updateBoard(board);
    }

    @Override
    public void resize(){
        super.resize();
        boardPanel.setBounds(50,50,400,400);
        piecesPanel.setBounds(getWidth()-250,50,150,400);
    }

}
