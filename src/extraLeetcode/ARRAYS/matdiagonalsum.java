package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class matdiagonalsum {
    public static void sumdiagonal(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int i=0;
        int j=0;
        int sum=0;
        while(i<n && j<m) {
             sum+=arr[i][j];
             arr[i][j]=0;
             i=i+1;
             j=j+1;

        }
        System.out.println(sum);
        System.out.println(Arrays.deepToString(arr));
        int k=0;
        int l=m-1;
        while(k<n&&l>=0) {
            sum+=arr[k][l];
            k=k+1;
            l=l-1;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        sumdiagonal(arr);
    }
}
