package extraLeetcode.ARRAYS;

public class lemonadechange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false; // no ₹5 for change
                }
            }
            else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false; // no change possible
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,5,10,10,20};
        System.out.println(lemonadeChange(arr)); // ✅ true
    }
}
