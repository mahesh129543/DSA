package Recursion;

public class partyproblem {
    public static int partyproblem(int n) {

        if(n==1){
            return 1;
        }if(n==2){
            return 2;
        }
        return partyproblem(n-1)+(n-1)*partyproblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println("problem is the going the party with ont he bike and the" +
                " person is going the single or double only so find the ways to going the party:");
        System.out.println();
        System.out.println("ways to going the party:"+partyproblem(5));

    }
}
