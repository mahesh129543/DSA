package extraLeetcode.ARRAYS;

public class logestcontilengsubseq {
    public static void longestCommonSubsequence(int[] arr) {
        int n = arr.length;
        int len=1;
        int len2=1;

        for(int i=1; i<n; i++) {
            if(arr[i]>arr[i-1]) {
                len++;
                len2=Math.max(len, len2);

            }else {
                len=1;
            }

        }

        System.out.println(len2);
    }


    public static void main(String[] args) {
        int[] arr ={2,2,2,2};
        longestCommonSubsequence(arr);
    }
}
