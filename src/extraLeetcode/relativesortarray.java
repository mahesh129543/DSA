package extraLeetcode;

import java.util.*;

public class relativesortarray {
    public static void relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//       int[] arr3 = arr1.clone();
//       Arrays.sort(arr3);
        for (int i = 0; i < n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);

        }
        System.out.println(map);
        int k = 0;
        for (int i = 0; i < m; i++) {
            while(map.containsKey(arr2[i])) {
                arr1[k]=arr2[i];
                map.put(arr2[i], map.get(arr2[i]) - 1);
                k++;
                if(map.get(arr2[i]) == 0) {
                    map.remove(arr2[i]);
                }


            }
        }
        System.out.println(map);
        System.out.println(Arrays.toString(arr1));
        List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);

        // Place remaining numbers
        for (int x : remaining) {
            int freq = map.get(x);
            while (freq!= 0) {
                arr1[k++] = x;
                freq--;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1, arr2);
    }
}
