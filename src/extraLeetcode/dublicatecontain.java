package extraLeetcode;
import java.util.*;

public class dublicatecontain {


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (h.contains(nums[i])) {
                return true;
            }
            h.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = dublicatecontain.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}
