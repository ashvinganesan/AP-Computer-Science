/*
 Ashvin Ganesan
Ms. Hemiup APCS
Wednesday January 15th 2019
 */
public class TicTacToe {
    String[][] board;
    public TicTacToe() {
        board = new String[3][3];
        for (int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                board[r][c] = "_";
            }
        }
    }
    public void printGameBoard() {
        System.out.println(" _ _ _ ");
        for (int i = 0; i < board.length; i++) {
            
            for(int j = 0; j < board[i].length; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    
    public void makeMove(String piece, int row, int column) {
        board[row][column] = piece;
    }
    
    public boolean isOver() {
        for(int counter = 0; counter < board.length; counter++) {
            if(board[counter][0].equals(board[counter][1]) && board[counter][1].equals(board[counter][2]) && !board[counter][1].equals("_")) {
         
                System.out.println(board[counter][0] + " is the winner");
                //System.out.println(counter);
                return true;
            }
            if(board[0][counter].equals(board[1][counter]) && board[1][counter].equals(board[2][counter]) && !board[2][counter].equals("_")) {
                System.out.println(board[0][counter] + " is the winner");
                return true;
            }
            
        }
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals("_")) {
            System.out.println(board[0][0] + " is the winner");
            return true;
        }
        if(board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && !board[1][1].equals("_")) {
            System.out.println(board[1][1] + " is the winner");
            return true;
        }
        return false;
    }
}
