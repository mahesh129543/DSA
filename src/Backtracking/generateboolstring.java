package Backtracking;

import java.util.Arrays;

public class generateboolstring {
    public static void generatebooleanString(int n,int i, int[] output){
        if(i==n){
            System.out.println(Arrays.toString(output));
            return;
        }
        output[i]=4;
        generatebooleanString(n,i+1,output);
        output[i]=5;
        generatebooleanString(n,i+1,output);

    }
    public static void main(String[] args) {
        int n=2;
        int[] output= new int[n];
        generatebooleanString(n,0,output);


    }
}
