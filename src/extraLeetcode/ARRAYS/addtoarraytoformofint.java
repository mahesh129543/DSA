package extraLeetcode.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addtoarraytoformofint {
    public static void addtoarraytoformofint(int[] num,int k) {
        List<Integer> res=new ArrayList<>();
        for (int i = num.length - 1; i >= 0 ; i--) {
            res.add((num[i]+k)%10);
            k=(num[i]+k)/10;
        }

        System.out.println(res);
        while(k>0){
            res.add(k%10);
            k=k/10;
        }
        System.out.println(res);

        List<Integer> resfinal=new ArrayList<>();
        for (int j = res.size() - 1; j >= 0 ; j--) {
            resfinal.add(res.get(j));
        }
        System.out.println(resfinal);
//        int n = arr.length;
//        long sum = 0;
//        long p=1;
//
//        for (int i =n-1; i >=0; i--) {
//            sum=sum+arr[i]*p;
//            p=p*10;
//
//        }
//        long res=sum+k;
//        System.out.println(sum);
//        System.out.println(res);
//        List<Integer> list = new ArrayList<>();
//        while (res > 0) {
//            list.add((int)(res % 10));
//            res /= 10;
//
//        }
//
//        // Reverse since digits were added from the end
//        Collections.reverse(list);
//        System.out.println("Result array: " + list);
//
//        ;
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,0};

        int k=34;
        int[] arr1={9,9,9,9,9,9,9,9,9,9};
        int k1=1;
        addtoarraytoformofint(arr,k);
        System.out.println("another array: " );
        addtoarraytoformofint(arr1,k1);

    }
}
