package extraLeetcode.Strings;

public class addstring {
    public static void addString(String a, String b) {
        int num1=Integer.parseInt(a);
        int num2=Integer.parseInt(b);
        int ans=num1+num2;
        System.out.println(ans);
        String ans1=Integer.toString(ans);
        System.out.println(ans1);
//        int n = a.length();
//        int m = b.length();
//        int num1=0;
//        int num2=0;
//        int p=1;
//        int p1=1;
//
//        for(int i=n-1;i>=0;i--){
//
//            num1=num1+(a.charAt(i)-'0')*p;
//            p=p*10;
//
//
//        }
//        System.out.println(num1);
//        for(int i=m-1;i>=0;i--){
//
//            num2=num2+(b.charAt(i)-'0')*p1;
//            p1=p1*10;
//
//
//        }
//        System.out.println(num2);
//        int ans=num1+num2;
//        System.out.println(ans);
//        String ans1=String.valueOf(ans);
//        System.out.println(ans1);
    }
    public static void main(String[] args) {
        String a="12";
        String b="234";
        addString(a,b);
    }
}
