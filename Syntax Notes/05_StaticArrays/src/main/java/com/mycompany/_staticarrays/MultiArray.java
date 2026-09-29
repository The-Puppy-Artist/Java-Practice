package com.mycompany._staticarrays;

public class MultiArray {
    
    public static void drawLine(int len){
        System.out.print("+");
            for(int j=0; j<len; j++)
                System.out.print("-+");
        System.out.println();
    }
    
    public static void drawBoard(char board[][]){
        drawLine(board[0].length);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(j==0)
                    System.out.print("|"+board[i][j]+"|");
                else
                    System.out.print(board[i][j]+"|");
            }
            System.out.println();
            drawLine(board[0].length);
        }
    }
    
    public static void main(String[] args) {
        
        // Multi dimentional array declaration
        char board[][] = new char[4][8];
        char board2[][] = {{' ',' ','X',' ',' '},
                           {'X',' ',' ',' ',' '},
                           {' ','X',' ','X',' '}};
        
        // Obtian array lengths
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = ' '; // array access
                System.out.println("Reset ("+i+","+j+")");
            }
        }
        
        board[0][2] = 'X';
        board[1][5] = 'X';
        board[2][7] = 'X';
        board[3][0] = 'X';
        
        drawBoard(board);
        drawBoard(board2);
    }
}
