package Array1;

import java.util.HashSet;

public class subarraysumzero {
    public static boolean sumIszero(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int ps=arr[0];
        set.add(ps);
        for(int i=1;i<arr.length;i++){
            ps=ps+arr[i];
            if(set.contains(ps)||ps==0){
                return true;

            }
            set.add(ps);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr={1,4,9,-11,2,-10,6,5};
        System.out.println(sumIszero(arr));

    }
}
