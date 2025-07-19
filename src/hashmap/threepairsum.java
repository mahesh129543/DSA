package hashmap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;

public class threepairsum {
    public static void threePairSum(int[] arr,int k1) {
        System.out.println("brute force approach:");
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {

                for(int k=j+1; k<arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==k1) {
                        System.out.println(arr[i]+" ,"+arr[j]+" ," +arr[k]);

                    }
                }
            }
        }

    }
    public static void threePairSum2(int[] arr,int k1) {
        System.out.println("sort and two pointer approach:");
        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-2; i++) {
            int x=arr[i];
            int s=i+1;
            int e=arr.length-1;
            while(s<e){
                if(arr[s]+arr[e]==k1-x) {
                    System.out.println(arr[i]+" ,"+arr[s]+" ,"+arr[e]);
                    s++;
                    e--;
                }else if(arr[s]+arr[e]>k1-x) {
                    e--;

                }else{
                    s++;
                }
            }

        }

    }
    public static void threePairSum3(int[] arr,int k1) {
        System.out.println("hashing approach:");
        for(int i=0; i<arr.length-2; i++) {
            int x=arr[i];
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1; j<arr.length; j++) {
                int y=arr[j];
                int z=k1-x-y;
                if(hs.contains(z)){
                    System.out.println(x+" ,"+y+" ,"+z);
                }
                hs.add(y);

            }
            hs.clear();
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,7,2,8};
                int k1=17;
        threePairSum(arr,k1);
        threePairSum2(arr,k1);
        threePairSum3(arr,k1);

    }
}
