package extraLeetcode;

import java.util.Arrays;

public class flippinganimage {
    public static void flip(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] arr1 = new int[n][m];
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=m-1;j>=0;j--){
                if(arr[i][j]==1){
                    arr1[i][k] = 0;
                    k++;
                }else if(arr[i][j]==0){
                    arr1[i][k] = 1;
                    k++;
                }



            }
        }
        System.out.println(Arrays.deepToString(arr1));

    }
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        flip(arr);
    }
}
