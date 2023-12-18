/*
 Ashvin Ganesan
APCS Unit 8 Lab 2 
Wednesday January 15th 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MagicSquare {
    // I wrote this method because I just wanted to see inside the file because I couldn't open it
    // it turns out I had downloaded magic 1 twice and since I did it auto renamed itself to magic 2
    // this meant I was getting a big error and just scratching my head at it :(
    public void debug(String input) throws IOException {
        Scanner file = new Scanner(new File(input));
        while(file.hasNextLine()) {
            System.out.println(file.nextLine());
        }
    }
// This method takes in the name of a file and a true or false that denotes whether it is making a square
//or just checking to see if its a square
    public void processFile(String input, boolean makeSquare) throws IOException {
        Scanner file = new Scanner(new File(input));
        if(!makeSquare) {
            file.nextLine();
        }
        String currentLine;
        while (file.hasNextLine()) { //the file doesn't contain the last 2 squares
            if (makeSquare) {
                int size = Integer.parseInt(file.nextLine().trim());
                //System.out.println("size is " + size);
                makeMagicSquare(size);
            } else {
                int gridSize = Integer.parseInt(file.nextLine().trim());
                currentLine = file.nextLine().trim() + " ";//.replaceAll("\\s", "");
                int[][] square = new int[gridSize][gridSize];
                for (int r = 0; r < gridSize; r++) {
                    for (int c = 0; c < gridSize; c++) {
                        square[r][c] = Integer.parseInt(currentLine.substring(0, currentLine.indexOf(" ")));
                        currentLine = currentLine.substring(currentLine.indexOf(" ") + 1);
                    }
                }
                isMagicSquare(square);
            }
//            for(int row = 0; row < gridSize; row++) {
//                for(int col = 0; col < gridSize; col++) {
//                    System.out.print(square[row][col] + " ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
            
        }
    }
//This method takes a square and says if its a magic square
//it will print the square and say Magic Square or Not a Magic Square

    public void isMagicSquare(int[][] square) {
        int magicSquareNumb = 0;
        boolean isSquare = true;
        for (int r = 0; r < square.length; r++) {

            magicSquareNumb += square[r][0];

        }
//        System.out.println(magicSquareNumb);
        int lDiagnol = 0;
        int rDiagnol = 0;
        for (int i = 0; i < square.length; i++) {
            int rowVal = 0;
            int colVal = 0;
            rDiagnol += (square[i][square.length - 1 - i]);
            lDiagnol += square[i][i];
            for (int j = 0; j < square[i].length; j++) {
                rowVal += square[i][j];
                colVal += square[j][i];
            }
            if (magicSquareNumb != rowVal) {
                isSquare = false;
//                System.out.println("THE NUMB IS " + magicSquareNumb);
//                System.out.println("NO LONGER A SQUARE rowVal = " + rowVal);
            } else if (magicSquareNumb != colVal) {
                isSquare = false;
//                System.out.println("THE NUMB IS" + magicSquareNumb);
//                System.out.println("NO LONGER A SQUARE colVal = " + colVal);
            }

        }
        for (int r = 0; r < square.length; r++) {
            for (int c = 0; c < square[r].length; c++) {
                System.out.print(square[r][c] + " ");
            }
            System.out.println("");
        }
        if (isSquare == true) {
            System.out.println("MAGIC SQUARE");
        } else {
            System.out.println("NOT A MAGIC SQUARE");
        }
        System.out.println("");
        System.out.println("");
    }
//this method makes sure that the row is in bounds if it isn't it adjusts it so it is

    public int checkRow(int row, int size) {

        if (row >= size) {
            return row - size;
        }
        if (row < 0) {
            return size - 1;
        }
        return row;
    }
//this method makes sure that the column is in bounds if it isn't it adjusts it so it is

    public int checkColumn(int column, int size) {
        if (column >= size) {
            return column - size;
        }
        if (column < 0) {
            return size - 1;
        }
        return column;
    }
//this method makes a magicsquare in a grid of size by size(which is its only parameter)
//this method after constructing  a magic square prints it
    public void makeMagicSquare(int size) {
        int[][] square = new int[size][size];
        int row = 0;
        int column = size / 2;
        square[row][column] = 1;
        for (int i = 2; i <= (size * size); i++) {
//            System.out.println("i is " + i);
//            System.out.println("max is " + (size * size));
            row--;
            column++;
            row = checkRow(row, size);
            column = checkColumn(column, size);
//            System.out.println("row is " + row);
//            System.out.println("collum is " + column);
            if (square[row][column] != 0) {
                row += 2;
                column--;
                column = checkColumn(column, size);
                row = checkRow(row, size);
            }
            square[row][column] = i;

        }
        System.out.println("");
        System.out.println("");
        for(int r = 0; r < square.length; r++) {
            for(int c = 0; c < square[r].length;c++) {
                System.out.print(square[r][c] + "      ");
            }
            System.out.println("");
        }
        
//       isMagicSquare(square);

    }
}
