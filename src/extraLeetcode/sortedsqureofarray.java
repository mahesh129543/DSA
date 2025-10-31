package extraLeetcode;

import java.util.Arrays;

public class sortedsqureofarray {
    public static void sortedarray(int[] arr){
        int n = arr.length;
        int s=0;
        int e=n-1;
        int[] res=new int[n];
        int k=n-1;
        while(s<e){
            if(Math.abs(arr[s])<Math.abs(arr[e])){
                res[k]=arr[e]*arr[e];
                e--;



            }else{
                res[k]=arr[s]*arr[s];
                s++;
            }
            k--;
        }
        System.out.println(Arrays.toString(res));

    }
    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        sortedarray(arr);

    }
}
