package bit_Manipulation;

import java.util.Scanner;

public class Enemyproblem {
    public static int enemyProblem(int n){

        int cnt = 0;
        while(n > 0){
            int lastbit=n&1;
            if(lastbit==1){
                cnt++;

            }
            n=n>>1;


        }return cnt;

    }
    public static void main(String[] args) {
        System.out.println("problem is the the step to get the enemy from earth like you have to the super man and" +
                "you going the the distroy the enemy in the steps of the rsnge of the " +
                "1,2,4,8,16... like wise ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of diatance of enemies from earth:");
        int n = sc.nextInt();
        System.out.println("steps to get the enemy is:"+enemyProblem(n));


    }
}
