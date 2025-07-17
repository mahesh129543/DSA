package Array1;

import java.util.Arrays;

public class specialindex {
    public static int[] removeindex(int[] arr, int i) {
        int[] newArr = new int[arr.length - 1];
        int idx = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == i) continue;
            newArr[idx++] = arr[j];
        }
        return newArr;

    }

    public static void specialIndex(int[] arr){
        int cnt=0;

        for(int i=0;i<arr.length;i++){
            int[] temp=removeindex(arr,i);
            System.out.println(Arrays.toString(temp));
            int sume=0;
            int sumo=0;
            for(int j=0;j<=temp.length-1;j++){
                if(j%2==0){
                    sume+=temp[j];
                }else{
                    sumo+=temp[j];
                }

            }
            if(sume==sumo){
                cnt=cnt+1;
            }
        }
        System.out.println(cnt);

    }


    public static void main(String[] args) {
        int[] arr={4,3,2,7,6,-2};
        specialIndex(arr);
        System.out.println(Arrays.toString(arr));



    }
}
