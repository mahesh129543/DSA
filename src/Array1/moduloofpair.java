package Array1;

import java.util.Arrays;
import java.util.HashMap;

public class moduloofpair {
    public static void moduloPair(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int rem=a[i]%k;
            int  key=rem;
            int frequency = map.getOrDefault(key, 0);
            map.put(key,frequency+ 1);

        }
        System.out.println(map);
        int ans=0;
        if(map.containsKey(0)){
            ans+=map.get(0);
        }
        for(int j=1;j<(k+1)/2;j++){
            ans+=map.get(j)*map.get(k-j);


        }
        System.out.println("the total number of ways:"+ans);
    }
    public static void main(String[] args) {
        int[] arr={4,7,6,5,8,3,10,15};
        moduloPair(arr, 5);

    }
}
