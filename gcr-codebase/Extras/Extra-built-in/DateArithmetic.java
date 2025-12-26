import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking date input from user
        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        // Converting String input to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);

        // Subtracting 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Displaying result
        System.out.println("Final Date after calculations: " + updatedDate);

        sc.close();
    }
}
