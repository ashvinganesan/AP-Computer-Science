/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class GameDriver {
    private GameState state;
    
    public GameDriver(GameState initial) {
        state = initial;
    }
    public void play() {
        System.out.println(state);
        while(!state.isGameOver()) {
            Player p = state.getCurrentPlayer();
            String nextMove = p.getNextMove(state);
            System.out.println("Player: " + p.getName());
            System.out.println("Next move: " + nextMove);
            state.makeMove(nextMove);
        }
        //when the game is over display who wins
        Player winner = state.getWinner();
        if(state.getWinner() != null) {
            System.out.println(winner.getName() + " wins");
        } else {
            System.out.println("Game ends in a draw");
        }
   
    }
    
}
