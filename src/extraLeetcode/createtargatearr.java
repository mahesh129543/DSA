package extraLeetcode;

import java.util.ArrayList;
import java.util.List;

public class createtargatearr {
    public static void createtargatearr(int[] arr1, int[] arr2) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr2[i],arr1[i]);  // INSERT at index
            System.out.println("After inserting " + arr1[i] + " at position " + arr2[i] + " -> " + list);
        }

        System.out.println("Final Target Array = " + list);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        createtargatearr(nums,index);
    }
}
