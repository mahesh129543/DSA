package extraLeetcode.ARRAYS.medium;

public class reversepair {
    public static void reversepair(int[] arr) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2L * arr[j]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
       int[]  nums = {2,4,3,5,1};
       reversepair(nums);
    }
}
