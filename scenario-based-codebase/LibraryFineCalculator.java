import java.util.Scanner;
public class LibraryFineCalculator{
	public static void main(String[] args){
		//Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);
        final int FINEPERDAY = 5;
		
		
        for (int bookNumber = 1; bookNumber <= 5; bookNumber++) {
			//Taking user input
            System.out.println("\nBook " + bookNumber + " Details");
            System.out.print("Enter due date (in days): ");
            int dueDate = scanner.nextInt();
            System.out.print("Enter return date (in days): ");
            int returnDate = scanner.nextInt();

			//Calculating dues fine displaying result
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fineAmount = lateDays * FINEPERDAY;

                System.out.println("Book returned late by " + lateDays + " days.");
                System.out.println("Fine to be paid: " + fineAmount);
            } else {
                System.out.println("Book returned on time. No fine.");
            }
        }
 
	}
}