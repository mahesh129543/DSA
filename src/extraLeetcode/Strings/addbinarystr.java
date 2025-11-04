package extraLeetcode.Strings;

public class addbinarystr {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            res.append(sum % 2);   // write bit
            carry = sum / 2;       // update carry

            i--;
            j--;
        }

        return res.reverse().toString();



//        int n = a.length();
//        int m = b.length();
//        int max = Math.max(n, m);
//        String res = "";
//        int carry = 0;
//        while(max >= 0) {
//            if(a.charAt(n - 1) == b.charAt(m - 1)) {
//
//               int  sum=carry+a.charAt(n - 1) + b.charAt(m - 1) - '0';
//               if(sum==2){
//                   carry=1;
//                   res=res+'0';
//               }
//               if(sum==3){
//                   carry=1;
//                   res=res+'1';
//               }
//            }else{
//                carry=0;
//                res=res+'1';
//            }
//        }
//        if(carry==1){
//            res=res+'1';
//        }
//        System.out.println(res);
   }
    public static void main(String[] args) {
        String s="11";
        String s1="1";
        System.out.println( addBinary(s, s1));

    }
}
