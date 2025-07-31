package Sorting;

public class quicksortiing {
    public static int  partition(int[] arr,int s,int e) {
        int pivot = arr[e];
        int i = s-1;
        for (int j = s; j <= e-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[e];
        arr[e] = arr[i+1];
        arr[i+1] = temp;
        return i+1;

    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }



    public static void quicksort(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int p=partition(arr,s,e);
        quicksort(arr,s,p-1);
        quicksort(arr,p+1,e);


    }
    public static void main(String[] args) {
        int[] arr = { 3,4,2,1,7,6,5};
        int s = 0;
        int e = arr.length-1;
        quicksort(arr,s,e);
        printArray(arr);

    }
}
