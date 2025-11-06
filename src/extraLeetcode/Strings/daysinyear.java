package extraLeetcode.Strings;

import java.time.LocalDate;

public class daysinyear {
    public static void daysinyear(String s ) {
        int year = Integer.parseInt(s.substring(0, 4));
        int month = Integer.parseInt(s.substring(5, 7));
        int day = Integer.parseInt(s.substring(8, 10));

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Check for leap year
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leap) {
            daysInMonth[1] = 29; // February = 29
        }

        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += day;

        System.out.println("Date: " + s);
        System.out.println("Day of year: " + totalDays);
//        LocalDate date = LocalDate.parse(s);  // Java handles the format automatically
//        int dayOfYear = date.getDayOfYear();
//        System.out.println("Date: " + date);
//        System.out.println("Day of year: " + dayOfYear);

    }
    public static void main(String[] args) {
       String date = "2019-01-09";

       daysinyear(date);
    }
}
