package Backtracking;

import java.util.Arrays;

public class sudokuproblem {
    public static void print(int N,int[][] grid) {
        for(int i=0;i<N;i++){

            System.out.println(Arrays.toString(grid[i]));
        }
    }
    public static boolean canPlace(int[][] grid,int i,int j,int no,int N){
        for(int x=0;x<N;x++){
            if(grid[x][j]==no ||grid[i][x]==no){
                return false;
            }
        }
        int sx=(i/3)*3;
        int sy=(j/3)*3;
        for(int x1=sx;x1<sx+3;x1++){
            for(int y1=sy;y1<sy+3;y1++){
                if(grid[x1][y1]==no){
                    return false;                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int[][] grid,int i,int j,int  N) {
        if(i==N){
            print(N,grid);
            return true;
        }
        if(j==N){
            return solveSudoku(grid,i+1,0,N);

        }
        if(grid[i][j]!=0){
            return solveSudoku(grid,i,j+1,N);
        }
        for(int no=1;no<=N;no++){
            if(canPlace(grid,i,j,no,N)){
                grid[i][j]=no;
                Boolean res = solveSudoku(grid,i,j+1,N);
                if(res){
                    return true;
                }

            }
        }
        grid[i][j]=0;
        return false;
    }
    public static void main(String[] args) {
        int grid[][]={
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        solveSudoku(grid,0,0,9);
    }
}
