package extraLeetcode.Strings;

public class decimaltohexa {
    public static void decimaltohexa(int a) {
        String s = Integer.toHexString(a);
        System.out.println(s);

        long n = a;
        if (a < 0) {
            n = (long) a & 0xFFFFFFFFL;
        }
       String s1="";
       while(n>0){

           long rem=n%16;
              n=n/16;
           if(rem<10){
               s1=rem+s1;
           }else{
               s1=(char)('a'+(rem-10))+s1;
           }
       }
       System.out.println(s1);
    }
    public static void main(String[] args) {
        int n=26;
        int n1=-1;
        decimaltohexa(n);
        decimaltohexa(n1);

    }
}
