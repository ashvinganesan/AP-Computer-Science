/*
Ashvin Ganesan
APCS Unit 10 Lab 1
Monday March 2nd 2020
 */
public class AtCounter {
    public char[][] matrix;
    public int[][] checked;
   
    //generates the random matrix
    public AtCounter(int size) {
        matrix = new char[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if((int)(Math.random() * 2) == 1) {
                    matrix[i][j] = '@';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        checked = new int[0][size * size];
    }
//recursion method which counts the number of @s in the previously generated matrix that are connected from a starting point
//which is passed in as parameters
    public int recursion(int startingRow, int startingColumn){
//        System.out.println("startingRow is " + startingRow);
//        System.out.println("startingColumn is " + startingColumn);
        if(matrix[startingRow][startingColumn] == '-') {
            return 0;
        }
        matrix[startingRow] [startingColumn] = '-';
        int rowZero = 1;
        int colZero = 1;
        int rowMax = 1;
        int colMax = 1;
        if (startingRow  == 0) {
            rowZero = 0;
        }
        else if (startingRow  == matrix.length - 1) {
            rowMax = 0;
        }
        if (startingColumn  == 0) {
            colZero = 0;
        }
        else if (startingColumn  == matrix.length -1) {
            colMax = 0;
        }
        //the return calls recursion 4 times but if the values turn out as it would go out of bounds instead it just calls recursion with the same 
        //values that it already had which catches the marked square so it doesn't count. 
        return 1 + recursion(startingRow - rowZero, startingColumn) + recursion(startingRow + rowMax, startingColumn) + recursion(startingRow, startingColumn - colZero) + recursion(startingRow, startingColumn + colMax);
        //first way I did the problem
//        if(startingRow == 0) {
//            if(startingColumn == 0) {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn+1);
//            }
//            
//            if (startingColumn == matrix.length -1) {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn-1);
//            } else {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn +1) + recursion(startingRow, startingColumn -1);
//            }
//        }
//        if(startingRow == matrix.length -1 ) {
//            if(startingColumn == 0) {
//                return 1 + recursion(startingRow - 1, startingColumn) + recursion(startingRow, startingColumn+1);
//            }
//            
//            if (startingColumn == matrix.length -1) {
//                return 1 + recursion(startingRow - 1, startingColumn) + recursion(startingRow, startingColumn-1);
//            } else {
//                return 1 + recursion(startingRow - 1, startingColumn) + recursion(startingRow, startingColumn +1) + recursion(startingRow, startingColumn -1);
//            }
//        }else {
//            if(startingColumn == 0) {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn+1) + recursion(startingRow-1, startingColumn);
//            }
//            
//            if (startingColumn == matrix.length - 1) {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn-1) + recursion(startingRow -1,startingColumn);
//            } else {
//                return 1 + recursion(startingRow + 1, startingColumn) + recursion(startingRow, startingColumn +1) + recursion(startingRow, startingColumn -1) + recursion(startingRow-1, startingColumn);
//            }
//        }
    }
//prints the matrix 
    public void print() {
        for(int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
