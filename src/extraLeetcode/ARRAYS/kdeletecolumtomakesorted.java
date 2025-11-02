package extraLeetcode.ARRAYS;

public class kdeletecolumtomakesorted {
    public static void kdeletecolumtomakesorted(String[] s) {
        int n=s.length;
        int i=0; int j=0;
        int cnt=0;
        for(int k=0; k<n-1; k++) {
            String s1=s[k];
            String s2=s[k+1];
            int n1=s1.length();
            for(int l=0; l<n1-1; l++) {
                if((s1.charAt(i)-'a')<(s2.charAt(j)-'a')) {
                    System.out.println("true");

                }else {
                    System.out.println("false");
                }
            }

        }


    }
    public static void main(String[] args) {
        String[] s={"cba","daf","ghi"};
        kdeletecolumtomakesorted(s);

    }
}
