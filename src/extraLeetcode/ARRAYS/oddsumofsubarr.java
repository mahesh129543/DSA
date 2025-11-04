package extraLeetcode.ARRAYS;

public class oddsumofsubarr {
    public static int oddsubarrsum(int[] arr){
        int n = arr.length;
        int sum = 0;

        for (int start = 0; start < n; start++) {
            int curr = 0;
            for (int end = start; end < n; end++) {
                curr += arr[end];

                // length is odd
                if ((end - start + 1) % 2 == 1) {
                    sum += curr;
                }
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        System.out.println(oddsubarrsum(arr));

    }
}
