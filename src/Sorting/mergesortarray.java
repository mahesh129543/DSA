package Sorting;

import java.util.Arrays;

public class mergesortarray {
    public static void merge(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e+1];
        int i = s, j = mid + 1;
        int k = s;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;

            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(j<=e){
            temp[k] = arr[j];
            j++;
            k++;
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        for(int x=s; x<=e; x++){
            arr[x] = temp[x];
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){

        }
        System.out.println("using merge sort sorted the array:"+Arrays.toString(arr));


    }


    static void mergeSort(int[] arr,int s,int e ){
        if (s >= e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);

    }
    public static void main(String[] args) {
        int[] arr={4,2,5,1,2,5,6};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);


    }
}
