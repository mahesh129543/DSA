package extraLeetcode.Strings;

public class dfangingIPadress {
    public static  void dfangingIPadress(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='.'){
                sb.append('[');
                sb.append(chars[i]);
                sb.append(']');
            }
            else{
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String address = "255.100.50.0";
        dfangingIPadress(address);
    }
}
