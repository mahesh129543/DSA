package extraLeetcode.ARRAYS;

import java.util.HashSet;

public class checknanditsdouble {
    public static void checknanditsdouble(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i]*2)) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        checknanditsdouble(arr);
    }
}
