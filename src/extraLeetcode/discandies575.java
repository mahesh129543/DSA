package extraLeetcode;

import java.util.HashSet;

public class discandies575 {
    public  static int disc(int[] arr) {
        int n = arr.length;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n; i++) {
            set.add(arr[i]);

        }
        int candytype=set.size();
        int no_of_candieseat=n/2;
        if(candytype<no_of_candieseat){
            return candytype;
        }
        return no_of_candieseat;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(disc(arr));

    }
}
