package Recursion;

public class tilingsettingproblem {
    public static int tilingproblem(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return tilingproblem(n-1)+tilingproblem(n-2);
    }

    public static void main(String[] args) {
        System.out.println(tilingproblem(5));

    }
}
