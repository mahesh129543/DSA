package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class pairsum {
    public static void pairsumofArray(int[] arr,int k) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);



        for (int i = 0; i < arr.length; i++) {
           int  x=arr[i];
           int y=k-x;
           if(hs.contains(y)) {
               System.out.println(x+" "+y);

           }

        }

    }
    public static void duplicatepairsumofArray(int[] arr1,int k1) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);


        }
        System.out.println(hm);
        for(int x:arr1){
            int y=k1-x;
            if(hm.containsKey(y)) {
                System.out.println(x+" "+y);
            } else if (x==y) {
                if(hm.get(x)>=2) {
                    System.out.println(x+" "+y);
                }

            }
        }
    }
    public static void anotherpairsumofArrayapproach(int[] arr1,int k1) {
        System.out.println("another approac which can work on the empty hashset and avoid the duplicate pairs:");
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            int x=arr1[i];
            int y=k1-x;
            if(hs1.contains(y)) {
                System.out.println("this is the pair which sum is equal to k1 :"+x+" "+y);
            }
            hs1.add(x);
        }
    }
    public static void main(String[] args) {
        int[] arr={8,1,2,4,5,10,0,6,7};
        int k=10;
        pairsumofArray(arr,k);
        int[] arr1={3,5,7,2,4,7};
        int k1=5;
        duplicatepairsumofArray(arr1,k1);
        anotherpairsumofArrayapproach(arr1,k1);

    }
}
