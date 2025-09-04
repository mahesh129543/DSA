package Backtracking;

import java.util.Arrays;

public class Nqueenproblem {
    public static void print(int N,int[][] board) {
        for(int i=0;i<N;i++){

            System.out.println(Arrays.toString(board[i]));
        }  System.out.println();
    }
    public static boolean isSafe(int[][] board,int i,int j,int N){
        for(int k=0;k<i;k++){
            if(board[k][j]==1){
                return false;
            }
        }
        int x=i-1;
        int y=j-1;
        while(x>=0 && y>=0){
            if(board[x][y]==1){
                return false;
            }
            x=x-1;
            y=y-1;
        }
        int x1=i-1;
        int y1=j+1;
        while(x1>=0 && y1<N){
            if(board[x1][y1]==1){
                return false;
            }
            x1=x1-1;
            y1=y1+1;
        }
        return true;

    }
    public static boolean solveNQueen(int[][] board,int N,int i) {
        if(i==N){
            print(N,board);
            return true;
        }
        for(int j=0;j<N;j++){
            if(isSafe(board,i,j,N)){
                board[i][j] = 1;
                boolean res = solveNQueen(board,N,i+1);
                if(res){
                    //return true;
                }
                board[i][j] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("NQueen problem which can be the place the queen " +
                "in safe order instead of cuting positions" +
                "likee horizontal,diagonal and one row one queen:");
        int N=4;
        int board[][]=new int[N][N];
        solveNQueen(board,N,0);


    }
}
