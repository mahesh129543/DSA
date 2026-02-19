package extraLeetcode.binarysearch;

public class searchinsortedroteted {
    public static void searchthesortedarr(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }


            if (arr[s] <= arr[mid]) {
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }

            else {
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        System.out.println("Not found");
    }
    public static void main(String[] args) {
      int[]  nums = {4,5,6,7,0,1,2};
        int target = 0;
        searchthesortedarr(nums,target);
    }
}
