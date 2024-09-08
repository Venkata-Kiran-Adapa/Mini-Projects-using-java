package Mini_Projects;

import java.util.Scanner;
public class Sudoku {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[][] board=new int[9][9];
        boolean [][] boardcheck=new boolean[9][9];
        int[][] board1 = {{0, 0, 5}, {0, 1, 3}, {0, 4, 7}, {1, 0, 6}, {1, 3, 1}, {1, 4, 9},
                {1, 5, 5}, {2, 1, 9}, {2, 2, 8}, {2, 7, 6}, {3, 0, 8}, {3, 4, 6}, {3, 8, 3},
                {4, 0, 4}, {4, 3, 8}, {4, 5, 3}, {4, 8, 1}, {5, 1, 1}, {5, 4, 2}, {5, 7, 5}, {6, 2, 1}, {6, 7, 8},
                {6, 8, 4}, {7, 1, 8}, {7, 6, 6}, {7, 7, 3}, {8, 2, 5}, {8, 6, 1}, {8, 7, 7}};
        int[][] board2 = {
                {0, 2, 1},
                {0, 5, 3},
                {0, 8, 4},
                {1, 3, 7},
                {1, 7, 9},
                {2, 5, 1},
                {2, 8, 8},
                {3, 0, 5},
                {3, 1, 9},
                {3, 6, 2},
                {4, 4, 9},
                {4, 7, 1},
                {5, 1, 1},
                {5, 3, 2},
                {5, 8, 9},
                {6, 2, 8},
                {6, 4, 6},
                {6, 6, 3},
                {7, 3, 1},
                {7, 6, 4},
                {8, 1, 2},
                {8, 4, 7},
                {8, 7, 2},
        };
        int[][] board3 = {
                {0, 2, 6},
                {0, 4, 5},
                {1, 3, 1},
                {1, 7, 4},
                {2, 0, 2},
                {2, 5, 7},
                {2, 6, 3},
                {3, 0, 1},
                {3, 3, 6},
                {3, 6, 5},
                {4, 1, 4},
                {4, 4, 9},
                {5, 1, 6},
                {5, 3, 7},
                {5, 6, 4},
                {6, 0, 3},
                {6, 4, 7},
                {6, 8, 4},
                {7, 2, 4},
                {7, 5, 8},
                {7, 6, 9},
                {8, 1, 1},
                {8, 4, 1},
                {8, 7, 9},
        };

        System.out.println("Game rules: \n 1.No row Have the same Number. \n 2.No column have the same number.  \n 3.Each 3x3 sub-grid must contain the digits from (1-9) with no repetition of any digit within that sub-grid.");
        System.out.println("Available SudokuBoards are:");
        System.out.println("\n\t  Board 1: \n"+"\n5 3 0 | 0 7 0 | 0 0 0\n" + "6 0 0 | 1 9 5 | 0 0 0\n" + "0 9 8 | 0 0 0 | 0 6 0\n" +"---------------------\n"+ "8 0 0 | 0 6 0 | 0 0 3\n" + "4 0 0 | 8 0 3 | 0 0 1\n" + "0 1 0 | 0 2 0 | 0 5 0\n" +"---------------------\n"+ "0 0 1 | 0 0 0 | 0 8 4\n" + "0 8 0 | 0 0 0 | 6 3 0\n" + "0 0 5 | 0 0 0 | 1 7 0");
        System.out.println("\n\t  Board 2: \n"+
                "\n0 0 1 | 0 0 3 | 0 0 4"+
                "\n0 0 0 | 7 0 0 | 0 9 0"+
                "\n0 0 0 | 0 0 1 | 0 0 8"+
                "\n---------------------"+
                "\n5 9 0 | 0 0 0 | 2 0 0"+
                "\n0 0 0 | 0 9 0 | 0 1 0"+
                "\n0 1 0 | 2 0 0 | 0 0 9"+
                "\n---------------------"
                +"\n0 0 8 | 0 6 0 | 3 0 0"
                +"\n0 0 0 | 1 0 0 | 4 0 0"
               +"\n0 2 0 | 0 7 0 | 0 2 0");
        System.out.println("\n\t   Board 3:\n"+
                        "\n 0 0 6 | 0 5 0 | 0 0 0 "+
                        "\n0 0 0 | 1 0 0 | 0 4 0"+
                        "\n 2 0 0 | 0 0 7 | 3 0 0 "+
                        "\n---------------------"+
                        "\n1 0 0 | 6 0 0 | 5 0 0"+
                        "\n0 4 0 | 0 9 0 | 0 0 0"+
                        "\n0 6 0 | 7 0 0 | 4 0 0"+
                        "\n---------------------"+
                        "\n3 0 0 | 0 7 0 | 0 0 4"+
                        "\n0 0 4 | 0 0 8 | 9 0 0"+
                        "\n0 1 0 | 0 1 0 | 0 9 0");
        System.out.println("Choose board num:");
        int choice=sc.nextInt();
        switch (choice){
            case 1: {
               board= boardAssign(board1,board);
                boardcheck=fixBoard(board1,boardcheck);
                break;
            }
            case 2:{
               board =boardAssign(board2,board);
                boardcheck=fixBoard(board2,boardcheck);
                break;
            }
            case 3:{
               board= boardAssign(board3,board);
               boardcheck=fixBoard(board3,boardcheck);
                break;
            }
            default:
                System.out.println("Enter from those 3 boards:");
        }

        play(board,boardcheck);
    }
    public static int[][] boardAssign(int[][] entries,int[][] board){
        for (int[] entry : entries) {
            int row = entry[0];
            int col = entry[1];
            int value = entry[2];
            board[row][col] = value;
        }
     return board;
    }
    public static boolean[][] fixBoard(int[][] entries,boolean[][] boardcheck){
        for (int[] entry : entries) {
            int row = entry[0];
            int col = entry[1];
            boardcheck[row][col]=true;
        }
        return boardcheck;
    }
    public static void play(int[][] board,boolean[][] boardcheck){
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(true){
            printBoard(board);
            System.out.println("Enter row(1-9):");
            int row=sc.nextInt()-1;
            System.out.println("Enter col(1-9):");
            int col=sc.nextInt()-1;
            if (row < 0 || row >= 9 || col < 0 || col >= 9) {
                System.out.println("Invalid row or column. Please enter values between 1 and 9.");
                continue;
            }
            if(boardcheck[row][col]){
                System.out.println("you cant change the Original board values");
                continue;
            }
            System.out.println("Enter number to fill: ");
            int num=sc.nextInt();
            if(checkValid(num, board, row, col) && checkSubGrid(num, board, row, col)){
                    board[row][col]=num;
                    c++;
                if( (c > 50) && (gameWon(board))){
                    System.out.println("Congratulation you won...!");
                    break;
                }
            }
            else{
                    System.out.println("Number is already present in the board");
                }
        }
    }
    public static boolean gameWon(int[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(int[][] board){
        int count=0,c1=0;
        System.out.println("PRINTING BOARD HERE:");
        System.out.println("------------------------------");
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(" "+board[r][c] + " ");
                count++;
                if(count==3){
                    System.out.print("|");
                    count=0;
                }
            }
            c1++;
            if(c1==3 ){
                System.out.println("\n------------------------------");
                c1=0;
            }
            else{
            System.out.println();
        }}
    }
    public static boolean checkValid(int n,int[][] board,int row,int col) {
        for (int i = 0; i < 9; i++) {
            if (( board[row][i]==n) || ( board[i][col]==n )) {
                return false;
            }
        }

      return true;
    }
    public static boolean checkSubGrid(int n, int[][] board, int row, int col) {
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }
}

