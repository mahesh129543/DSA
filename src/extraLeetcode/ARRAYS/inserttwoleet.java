package extraLeetcode.ARRAYS;

import java.util.HashSet;

public class inserttwoleet {

    public static void inserttwo(int n1[],int n2[]){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<n1.length;i++){
            set1.add(n1[i]);
        }
        System.out.println(set1);
        for(int i=0;i<n2.length;i++){
            if(set1.contains(n2[i])){
                System.out.println(n2[i]);
                set1.remove(n2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] n1={1,2,2,1};
        int[] n2={2,2};
        inserttwo(n1,n2);
    }
}
