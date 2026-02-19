package extraLeetcode.binarysearch;

public class peakmoubntainidx {
    public static void peakmoubntainidx(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = (s + e) / 2;

            if (arr[mid] < arr[mid + 1]) {

                s = mid + 1;
            } else {

                e = mid;
            }
        }


        System.out.println(s);

    }
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int[] arr1 = {0,2,3,4,10,5,4,2,1};
        int[] arr2={1,2,3,4,2};
        int[] arr3={18,29,38,59,98,100,99,98,90};
        peakmoubntainidx(arr);

        peakmoubntainidx(arr1);
        peakmoubntainidx(arr2);
        peakmoubntainidx(arr3);
    }
}
