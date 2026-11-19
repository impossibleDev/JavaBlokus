package shared;

public class PieceData{
    //TODO load pieceData from txt files
    //database of all pieces, a piece is defined as boolean[][]
    public final static boolean[][][] pieces;

    static {
        //lets say 10 pieces in total the new boolean[10][][] (change later u figure it out)
        pieces = new boolean[1][][];
        //code here!!!
        //new Scanner
        //Scanner scan stuff in folder and add to pieces

        //TEST PIECE (IGNORE)
        boolean[][] dataTest = new boolean[4][2];
        dataTest[0][0]=true;
        dataTest[0][1]=true;
        dataTest[1][0]=true;
        dataTest[1][1]=true;
        dataTest[2][0]=true;
        dataTest[3][1]=true;
        pieces[0] = dataTest;
    }


}
