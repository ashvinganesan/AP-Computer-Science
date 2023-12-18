/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
import java.util.ArrayList;


public interface GameState {
    public boolean isGameOver();
    public Player getWinner();
    public Player getCurrentPlayer();
    public ArrayList <String> getCurrentMoves();
    public void makeMove (String move);
    public String toString();

}
