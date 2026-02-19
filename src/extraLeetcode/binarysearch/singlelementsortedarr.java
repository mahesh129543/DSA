package extraLeetcode.binarysearch;

public class singlelementsortedarr {
    public static void singleelement(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = (s + e) / 2;

            // ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // mid is even now
            if (arr[mid] == arr[mid + 1]) {
                s = mid + 2;
            } else {
                e = mid;
            }
        }

        System.out.println(arr[s]);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        singleelement(nums);
    }
}
