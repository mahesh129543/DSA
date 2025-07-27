package Array2_2D;
import java.util.*;

public class searchtargate {

    public static void searchTargate(int[][] arr,int targat) {
        int i=0;
        int j=arr[i].length-1;
        while(i<arr.length && j>=0) {
            if(arr[i][j]>targat){
                j--;

            }else if(arr[i][j]<targat){
                i++;

            }else{
                System.out.println("position row :"+ i+" col :"+j);
               return;

            }

            
        }
        System.out.println("The number is not found ! please enter the number " +
                "which is present in the array:");
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,4,8},
                   {5,7,10,12},
                  {14,16,20,32},
                  {18,25,30,40}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the targat:");
        int targat = sc.nextInt();



        searchTargate(arr,targat);
    }
}
