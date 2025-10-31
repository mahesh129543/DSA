package extraLeetcode;

import java.util.Arrays;

public class largestperemetertriangle {
    public static int largestperemetertriangle(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if (n < 3) {

            return 0;
        }
            int sum = 0;

            for (int i = 0; i < n-2; i++) {
                if (arr[i] + arr[i + 1] > arr[i + 2]) {
                    sum=arr[i]+arr[i+1]+arr[i+2];

                }

            }
            return sum;



//        int sum=0;
//        for(int i=n-3;i<n;i++){
//            sum+=arr[i];
//        }
//
//        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,10};
        int[] arr1={2,1,2};
        System.out.println(largestperemetertriangle(arr));
        System.out.println(largestperemetertriangle(arr1));

    }
}
