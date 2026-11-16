package model;

import shared.Team;

public class Game {

    private Team currentTeam;
    private Team[][] board;

    //CONSTRUCTOR
    public Game(){
        board = new Team[GameConstants.boardSize][GameConstants.boardSize];
        for (int x = 0; x < GameConstants.boardSize; x++){
            for (int y = 0; y < GameConstants.boardSize; y++){
                board[x][y] = Team.NULL;
            }
        }
        //test board blocks
        board[2][4] = Team.RED;
        board[6][6] = Team.YELLOW;
    }

    public void startGame(){

    }
    public void playTurn(){//playTurn(shape???)
        //place shape
        //next turn
    }

    public boolean isGameOver(){
        return false;
    }

    public Team[][] getBoard(){
        return board;
    }







}
