package extraLeetcode;

import java.util.Arrays;

public class replaceelementogrght {
    public static void replatheelel(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int max = Integer.MIN_VALUE;

            for(int j = i + 1; j < n; j++){
                max = Math.max(max, arr[j]);
            }

            arr[i] = max;
        }

        arr[n - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replatheelel(arr);
    }
}
