package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class rangeaddition598 {
    public static int rangeSum(int n, int m ,int[][] arr) {

        int[][] res = new int[n][m];
        System.out.println(Arrays.deepToString(res));

          int row=0;
          int col=0;

       for(int i=0;i<arr.length;i++){
           row=(arr[i][0]);
            col=(arr[i][1]);
           System.out.println(row+" "+col);
           for(int j=0;j< row;j++){
               for(int k=0;k<col;k++){
                   res[j][k]=res[j][k]+1;
               }
           }
       }
       System.out.println(Arrays.deepToString(res));
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (res[i][j] > maxVal) {
                    maxVal = res[i][j];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (res[i][j] == maxVal) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr={{2,2},{3,3}};
        System.out.println(rangeSum(3,3,arr));
    }
}
