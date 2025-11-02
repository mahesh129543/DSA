package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class Movezerotoendleetcode {
    public static void movezero(int arr[]){
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length){
            if(arr[j]==0){
                j++;
            }
            if(arr[i]==0){
                int temp=arr[j];
                arr[j]=0;
                arr[i]=temp;
                i++;
                j++;


            }
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = {0};
        movezero(arr);
    }
}
