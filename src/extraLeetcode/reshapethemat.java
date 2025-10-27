package extraLeetcode;

import java.util.Arrays;

public class reshapethemat {
    public static int[][] reshape(int[][] mat,int r,int c){
        int m = mat.length,n = mat[0].length;
        int[][] res = new int[r][c];
        int row=0;int col=0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                res[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }

            }
        }
        System.out.println(Arrays.deepToString(res));
        return res;
    }

    public static void main(String[] args) {

        int[][] mat={
                {1,2},{3,4}
        };
        int r=1;
        int c=4;
        System.out.println(Arrays.deepToString(reshape(mat,r,c)));
    }
}
