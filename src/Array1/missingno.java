package Array1;

import java.util.Arrays;

public class missingno {
    public static void missingNumber(int[] arr){
        int[] arr1 = arr.clone();
       Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=i+1){
                System.out.println("this is the missing number:"+(i+1));

            }
        }

    }
    public static void missingNumber2(int[] arr, int n){

        int sum=(n*(n+1))/2;
        System.out.println("totalsum:"+sum);
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];

        }
        System.out.println("missingsum:"+sum1);
        int missing = sum-sum1;
        System.out.println("approach two for the missing number:"+missing);

    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,1};
        int n = arr.length+1;

        missingNumber(arr);
        missingNumber2(arr,n);

    }
}
