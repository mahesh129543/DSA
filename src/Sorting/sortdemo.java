package Sorting;

import java.util.Arrays;

public class sortdemo {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }


        System.out.println("mahesh:"+Arrays.toString(arr));
    }
    public static void printfun(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);

        System.out.println("Built in function:"+Arrays.toString(arr));




    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }



    }
    public static void printfun1(int[] arr){
        System.out.println("using the selection sort function");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }

    }

    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        bubbleSort(arr);
        printfun(arr);
        int[] arr1={8,7,6,9,6,4,8,67,4,6};
        selectionSort(arr1);
        printfun1(arr1);


    }
}
