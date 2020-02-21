package lab04;

import java.util.Scanner;

public class TicTacToe {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] board = new int[3][3];

        int player = 1;
        printBoard(board);

        while(!checkWin(board, player)) {
            printBoard(board);
            int[] playerCoords = playerMove();
            int row = playerCoords[0];
            int col = playerCoords[1];
            markBoard(board, row, col, player);
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
        int playerRow = keyboard.nextInt();
        System.out.println("Please input the column you would like to change: ");
        int playerCol = keyboard.nextInt();
        int[] coordinates = {playerRow, playerCol};
        return coordinates;
    }

    private static void markBoard(int[][] board, int row, int col, int player){
        if (board[row][col] == 0){
            board[row][col] = player;
        }
        else {
            System.out.println("This spot is already taken!");
            return;
        }
    }

    private static boolean checkWin(int[][] board, int player){
        boolean win = false
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
        for(int col = 0; col < 3; col++){
            int line = 0;
            for(int row = 0; row < 3; col++){
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
        for(int i = 0; i < 8; i++ ){
            int line = 0;
            switch (i){
                case 0:
                    line = board[0][0] + board[0][1] + board[0][2];
                case 1:
                    line = board[1][0] + board[1][1] + board[1][2];
                case 2:
                    line = board[2][0] + board[2][1] + board[2][2];
                case 3:
                    line = board[0][0] + board[1][0] + board[2][0];
                case 4:
                    line = board[0][1] + board[1][1] + board[2][1];
                case 5:
                    line = board[0][2] + board[1][2] + board[2][2];
                case 6:
                    line = board[0][0] + board[1][1] + board[2][2];
                case 7:
                    line = board[2][0] + board[1][1] + board[0][2];


            }
            if(line == 3){
                win = true;
                System.out.println("Player 1");
        }
            if(line == 6){
                win = true;
                System.out.println("Player 2");
            }


        }

     return win;
    }
}