package extraLeetcode.ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class insertintwoleet {
    public static void insert(int n1[], int n2[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n1.length;i++){

                map.put(n1[i], map.getOrDefault(n1[i],0)+1);
        }
        System.out.println(map);


//        for(int j=0;j<n2.length;j++){
//
//            map1.put(n2[j], map1.getOrDefault(n2[j],0)+1);
//        }
//        System.out.println(map1);
        for(int j=0;j<n2.length;j++){
            if(map.containsKey(n2[j])){
                System.out.println(n2[j]);
                list.add(n2[j]);
                map.put(n2[j], map.get(n2[j])-1);
                if (map.get(n2[j]) == 0) {
                    map.remove(n2[j]);
                }


            }
        }
        System.out.println(list);

    }


    public static void main(String[] args) {
        int[] n1={4,9,8};
        int[] n2={4,9,8,4,9};
        insert(n1,n2);
    }
}
