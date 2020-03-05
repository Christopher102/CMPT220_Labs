package lab04;

import java.util.Scanner;

public class TicTacToe {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int player = 1;

        while(hasBlanks(board)) {
            printBoard(board);
            System.out.println(player);
            int[] playerCoords = playerMove();
            int row = playerCoords[0];
            int col = playerCoords[1];
            if(markBoard(board, row, col, player)){
                player = changePlayer(player);
            }
        }


    }



    private static void printBoard(int[][] board) {
        System.out.println("<----------->");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");

            for (int coordinateValue = 0; coordinateValue < 3; coordinateValue++) {
                System.out.print(board[i][coordinateValue] + " | ");
            }

            System.out.println();
            System.out.println("<----------->");
        }
    }


    private static int[] playerMove() {
        System.out.println("Please input the row you would like to change: ");
        int playerRow = keyboard.nextInt() - 1;
        System.out.println("Please input the column you would like to change: ");
        int playerCol = keyboard.nextInt() - 1;
        int[] coordinates = {playerRow, playerCol};
        return coordinates;
    }

    private static boolean markBoard(int[][] board, int row, int col, int player){
        boolean movecheck = true;
        if (board[row][col] == 0){
            board[row][col] = player;
        }
        else {
            System.out.println("This spot is already taken!");
            movecheck = false;
        }
        return movecheck;
    }

    private static boolean hasBlanks(int[][] board){
        boolean empty = false;
        for(int[] row : board){
            for(int col: row) {
                if (col == 0) {
                    empty = true;
                    break;
                }
            }

        }
        return empty;
    }
    private static boolean checkWin(int[][] board, int player){
        boolean win = false;
        for(int row = 0; row < 3; row++){
            int line = 0;
            for(int col = 0; col < 3; col++){
                line += board[row][col];
                if(line == 3){
                    System.out.println("Congrats! Player 1 Wins!");
                    win = true;
                }
                if(line == 6){
                    System.out.println("Congrats! Player 2 Wins!");
                    win = true;
                }
            }
        }

     return win;
    }


    private static int changePlayer(int player) {
        if (player == 1) {
            player = 2;
        }
        else{
            player = 1;

        }

        return player;
    }
}