package extraLeetcode;

import java.util.HashMap;

public class nreapeatedelementin2n {
    public static void nreapeatedelementin2n(int[] nums) {
        int n = nums.length;

        HashMap<Integer , Integer> hm =new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        }
        System.out.println(hm);
        for (int key : hm.keySet()) {
            if (hm.get(key) == n / 2) {
                System.out.println("N-repeated element is: " + key);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={1,4,4,4,2,3};
        nreapeatedelementin2n(nums);
    }
}
