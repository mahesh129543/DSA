package mahesh;

import java.util.Arrays;
import java.util.Scanner;

public class zeroshift {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[cnt]=arr[i];
                cnt++;
            }

        }
        while(cnt<n){
            arr[cnt]=0;
            cnt++;
        }
        System.out.println(Arrays.toString(arr));



    }
}
