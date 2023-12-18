/*
 Ashvin Ganesan
Ms. Hemiup APCS
Wednesday January 15th 2019
 */
public class Runner {
    public static void main(String[] args) {
        TicTacToe demo = new TicTacToe();
        // I have tried all of the cases (up down and both corners)
        // I deleted them 
        demo.printGameBoard();
        demo.makeMove("O", 1, 0);
        demo.printGameBoard();
        demo.makeMove("O", 1, 1);
        demo.printGameBoard();
        demo.makeMove("O", 1, 2);
        demo.printGameBoard();
        demo.isOver();
    }
}
