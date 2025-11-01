package extraLeetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class dominopaire {
    public static void dominopaire(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int cnt=1;
        for (int i = 0; i < n-1; i++) {

            if ((arr[i][0] == arr[i+1][0] || arr[i][0] ==  arr[i+1][1]) && (arr[i][1] == arr[i+1][1] || arr[i][1] ==  arr[i+1][0])) {
            cnt++;
            arr[i][0]=arr[i][0]+1;
            }
        }

        if(cnt==2){
            System.out.println("1");
            return;
        }
        System.out.println(cnt);

    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{1,2},{1,1},{1,2},{2,2}};
        int[][] arr1={{1,2},{2,1},{3,4},{5,6}};
        dominopaire(arr);
        dominopaire(arr1);
    }
}
