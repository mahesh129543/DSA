package Recursion.advancer;

public class towerofhanoi {
    static int towerOfhanoi(int n) {
        if (n == 0) {
            return 0;
        }
        return towerOfhanoi(n - 1)+1+towerOfhanoi(n - 1);


    }
    static int faster(int n) {
        if (n == 0) {
            return 0;
        }
        return 2*faster(n-1)+1;


    }
    static void faster1(int n) {
        int ans=(1<<n)-1;
        System.out.println(ans);

    }
    public static void moves(int n,char src,char helper,char dest) {
        if (n==0) {
            return;
        }
        moves(n-1,src,dest,helper);
        System.out.println("moves "+n+" disk from "+src+" to "+dest);
        moves(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        System.out.println("this is the tower of hanoi game and output gives the" +
                " how many moves are need in to complete the game:");
        int n=2;
        System.out.println(towerOfhanoi(n));
        System.out.println(faster(n));
        faster1(n);
        moves(n,'a','b','c');
    }
}
