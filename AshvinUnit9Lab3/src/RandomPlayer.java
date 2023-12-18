/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class RandomPlayer extends Player{
    public RandomPlayer(String name) {
        super(name);
    }
    public String getNextMove(GameState gs) {
        ArrayList<String> moves = gs.getCurrentMoves();
        if(moves.isEmpty()) {
            return "no moves";
        }
        int random = (int)(Math.random() * moves.size());
        return moves.get(random);
    }
}
