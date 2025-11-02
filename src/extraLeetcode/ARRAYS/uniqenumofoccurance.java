package extraLeetcode.ARRAYS;

import java.util.HashMap;
import java.util.HashSet;

public class uniqenumofoccurance {
    public static void uniqenumofoccurance(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {

                map.put(arr[i],map.getOrDefault(arr[i],0) + 1);

        }
        System.out.println(map);

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:map.keySet()){
            if(set.contains(map.get(i))){
                System.out.println("false");
                return;
            }
           set.add(map.get(i));
        }
        System.out.println(set);
        System.out.println("true");


//        boolean ans=true;
//        for(int i:map.keySet()){
//            if(i<map.size()&&map.get(i)==map.get(i+1)){
//                System.out.println(map.get(i)+" "+map.get(i+1));
//                ans=false;
//                break;
//            }
//
//
//        }
//        if(ans){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        int[] arr1={-1,4,-5,11,-3,4,-1,5,0,11,3};
        uniqenumofoccurance(arr);
        uniqenumofoccurance(arr1);
    }
}
