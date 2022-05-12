package Core_Java.Assignment2;

import java.time.Year;

public class leapyears {
    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }
    public static void main(String[] args) {
        final int startYear = 2022;
        final int endYear = startYear + 50;

        for (int i = startYear; i < endYear; i++) {
            if(isLeapYear(i)) {
                System.out.println(i);
            }
        }


    }
}
