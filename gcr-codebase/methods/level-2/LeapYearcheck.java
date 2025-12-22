import java.util.Scanner;

public class LeapYearCheck {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {

        // Check Gregorian calendar condition
        if (year < 1582) {
            return false;
        }

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        int year = sc.nextInt();

        // Call method
        boolean result = isLeapYear(year);

        // Display result
        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}
