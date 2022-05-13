package Core_Java.Assignment3;

public class countingdays {

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int date = 1;
        int month = 1;
        int year = 2022;

        int inputDate = 18;
        int inputMonth = 3;
        int finalYear = 2022;

        int finalMonth = 12;
        int finalDate = 30;
        int countingDays = 0;
        for (int i = year; i <= finalYear; i++) {

            if (year == finalYear) {
                finalMonth = inputMonth;
            }
            for (int j = month; j <= finalMonth; j++) {
                int count = 0;

                switch (j) {
                    case 1:
                        finalDate = 31;
                        break;
                    case 2:
                        if (isLeapYear(i)) {
                            finalDate = 29;
                        } else {
                            finalDate = 28;

                        }
                        break;

                    case 3:
                        finalDate = 31;
                        break;
                    case 4:
                        finalDate = 30;
                        break;
                    case 5:
                        finalDate = 31;
                        break;
                    case 6:
                        finalDate = 30;
                        break;
                    case 7:
                        finalDate = 31;
                        break;
                    case 8:
                        finalDate = 31;
                        break;
                    case 9:
                        finalDate = 30;
                        break;
                    case 10:
                        finalDate = 31;
                        break;
                    case 11:
                        finalDate = 30;
                        break;
                    case 12:
                        finalDate = 31;
                        break;

                    default:
                        break;
                }
                int currStartdate = date;
                if (year == finalYear && j == finalMonth) {
                    finalDate = inputDate;
                }
                for (int j2 = date; j2 < finalDate; j2++) {
                    count++;
                }
                if(j != month) {
                    count++;
                }
                countingDays += count;
                System.out.println("In " + j + " Month :-" );
                System.out.println("From date (" + currStartdate + " - " + finalDate + ") are " + count + " days");
                date = 1;
            }
            month = 1;
        }
        System.out.println("Total Days : " + countingDays);
    }

}
