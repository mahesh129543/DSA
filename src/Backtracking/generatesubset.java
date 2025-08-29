package Backtracking;

import java.util.ArrayList;

public class generatesubset {
    public static void generateSubset(int[] input, int i, ArrayList<Integer> output) {
        if(i == input.length){
            System.out.println(output);
            return;
        }
        output.add(input[i]);
        generateSubset(input, i + 1, output);
        Integer x=input[i];
        output.remove(x);
        generateSubset(input, i + 1, output);
    }
    public static void main(String[] args) {
        int[] input={1,2,3};
        ArrayList<Integer> output=new ArrayList<>();
        generateSubset(input,0,output);


    }
}
