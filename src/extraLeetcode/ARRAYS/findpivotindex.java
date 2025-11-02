package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class findpivotindex {
    public static void findpivotindx(int[] arr){
        int n = arr.length;
        int[] leftsum= new int[n];
        leftsum[0] = arr[0];
        int[] rightsum= new int[n];
        rightsum[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            leftsum[i] = leftsum[i-1] + arr[i];


        }
        for(int i=n-2; i>=0; i--){
            rightsum[i] = rightsum[i+1] + arr[i];

        }
        System.out.println(Arrays.toString(leftsum));

        System.out.println(Arrays.toString(rightsum));

        int i=0;
        int j=0;
        while(i<n && j<n){
            if(leftsum[i] == rightsum[j]){
                System.out.println(i);
            }
            i++;
            j++;
        }


    }
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        int [] arr1={1,2,3};
        int[] arr2={2,1,-1};
        findpivotindx(arr);
        findpivotindx(arr1);
        findpivotindx(arr2);
    }
}
