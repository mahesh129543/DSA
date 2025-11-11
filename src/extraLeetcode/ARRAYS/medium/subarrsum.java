package extraLeetcode.ARRAYS.medium;

import java.util.HashMap;

public class subarrsum {
    public static void sumSubarrays1(int[] arr,int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base condition: prefix sum 0 occurs once initially
        map.put(0, 1);

        int sum = 0;  // running prefix sum
        int count = 0;

        for (int num : arr) {
            sum += num;


            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // add all possible subarrays
            }

            // Update current prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println(map);
        }

        System.out.println("Count of subarrays = " + count);
    }
    public static void sumofsubarr(int[] arr,int k){
        int n = arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int l=i;l<=j;l++){
                    sum+=arr[l];

                }
                if(sum==k){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
      int[]   nums = {1,1,1};
      int[]   nums2 = {1,2,3};
        int k = 2;
        int k1=3;

        sumofsubarr(nums,k);
        sumofsubarr(nums2,k1);
        sumSubarrays1(nums,k);
        sumSubarrays1(nums2,k1);
    }
}
