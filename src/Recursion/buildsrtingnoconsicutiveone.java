package Recursion;

public class buildsrtingnoconsicutiveone {
    static int buildsrtingnoconsicutiveone(int n) {
        if(n==1){
            return 2;
        }
        if(n==2){
            return 3;
        }
        return buildsrtingnoconsicutiveone(n-1)+buildsrtingnoconsicutiveone(n-2);

    }

    public static void main(String[] args) {
        System.out.println("que: is the no. of the ways to build the string  of length " +
                "with no consicutive ones like 110101 is wrong =101001 like this");
        System.out.println(buildsrtingnoconsicutiveone(4));


    }
}
